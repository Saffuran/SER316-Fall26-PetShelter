package model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import model.matching.AgeRangeCheck;
import model.matching.HealthCheck;
import model.matching.MatchHandler;
import model.matching.SpeciesCheck;
import model.medical.IntakeExam;
import model.medical.Microchipping;
import model.medical.Vaccination;
import model.staff.AdoptionCoordinator;
import model.staff.Veterinarian;
import org.junit.jupiter.api.Test;

public class ModelWhiteBoxTest {

    //species doesn't match returns false
    @Test
    void speciesCheckRejectsWrongSpecies() {
        Adopter ash = new Adopter("T1", "Arcanine", 1, 10);
        Animal skitty = new Animal("#300", "Skitty", 2, "Healthy", "AVAILABLE");

        MatchHandler chain = new SpeciesCheck();

        assertFalse(chain.check(ash, skitty));
    }

    //AgeRangeCheck boundaries – age == maxAge passes, age > maxAge fails
    @Test
    void ageRangeCheckBoundaries() {
        Adopter misty = new Adopter("T2", "Pidgey", 1, 3);
        Animal pidgeyAtMax = new Animal("#016", "Pidgey", 3, "Healthy", "AVAILABLE");
        Animal pidgeyTooOld = new Animal("#016", "Pidgey", 4, "Healthy", "AVAILABLE");

        MatchHandler chain = new AgeRangeCheck();

        assertTrue(chain.check(misty, pidgeyAtMax));
        assertFalse(chain.check(misty, pidgeyTooOld));
    }

    //Professor Oak runs the full chain, every check passes then status becomes ADOPTED
    @Test
    void professorOakAdoptsOutArcanine() {
        Adopter ash = new Adopter("T1", "Arcanine", 1, 10);
        Animal arcanine = new Animal("#059", "Arcanine", 5, "Healthy", "AVAILABLE");

        MatchHandler chain = new SpeciesCheck();
        chain.setNext(new AgeRangeCheck()).setNext(new HealthCheck());
        AdoptionCoordinator oak = new AdoptionCoordinator("Professor Oak", chain);

        assertTrue(oak.tryAdopt(ash, arcanine));
        assertEquals("ADOPTED", arcanine.getStatus());
    }

    //nurse Joy's decorated procedure runs the inner exam first, then outputs
    @Test
    void nurseJoyTreatsSkittyWithDecoratedProcedure() {
        Animal skitty = new Animal("#300", "Skitty", 2, "Unknown", "INTAKE");
        Veterinarian nurseJoy = new Veterinarian("Nurse Joy");

        nurseJoy.treat(skitty, new Vaccination(new Microchipping(new IntakeExam())));

        assertEquals("Healthy", skitty.getHealth());
        assertEquals("Microchipped", skitty.getNotes().get(0));
        assertEquals("Vaccinated", skitty.getNotes().get(1));
    }
}