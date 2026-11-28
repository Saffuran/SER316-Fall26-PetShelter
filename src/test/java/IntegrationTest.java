import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import model.Adopter;
import model.Animal;
import model.matching.AvailabilityCheck;
import model.matching.SpeciesCheck;
import model.medical.IntakeExam;
import model.staff.AdoptionCoordinator;
import model.staff.Veterinarian;
import org.junit.jupiter.api.Test;

//both patterns working together: nurse joy treats it, then oak adopts it out
public class IntegrationTest {

    @Test
    void vetThenAdoptionWorks() {
        Animal arcanine = new Animal("#059-1", "Arcanine", 5, "Unknown", "INTAKE");
        Adopter ash = new Adopter("Ash", "Arcanine", 1, 10);
        SpeciesCheck chain = new SpeciesCheck();
        chain.setNext(new AvailabilityCheck());

        new Veterinarian("Nurse Joy").treat(arcanine, new IntakeExam());
        new AdoptionCoordinator("Professor Oak", chain).tryAdopt(ash, arcanine);

        assertEquals("ADOPTED", arcanine.getStatus());
    }

    @Test
    void cannotAdoptBeforeVetVisit() {
        Animal arcanine = new Animal("#059-1", "Arcanine", 5, "Unknown", "INTAKE");
        Adopter ash = new Adopter("Ash", "Arcanine", 1, 10);
        SpeciesCheck chain = new SpeciesCheck();
        chain.setNext(new AvailabilityCheck());

        assertFalse(new AdoptionCoordinator("Professor Oak", chain).tryAdopt(ash, arcanine));
    }
}