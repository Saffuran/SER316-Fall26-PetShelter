import static org.junit.jupiter.api.Assertions.assertEquals;

import model.Animal;
import model.medical.IntakeExam;
import model.medical.Vaccination;
import org.junit.jupiter.api.Test;

//decorator tests
public class DecoratorTest {

    @Test
    void examMakesAnimalHealthy() {
        Animal eevee = new Animal("#133-1", "Eevee", 3, "Unknown", "INTAKE");

        new IntakeExam().perform(eevee);

        assertEquals("Healthy", eevee.getHealth());
    }

    @Test
    void vaccinationAddsANote() {
        Animal pidgey = new Animal("#016-1", "Pidgey", 2, "Unknown", "INTAKE");

        new Vaccination(new IntakeExam()).perform(pidgey);

        assertEquals("Vaccinated", pidgey.getNotes().get(0));
    }
}