import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import model.Adopter;
import model.Animal;
import model.matching.AgeRangeCheck;
import model.matching.SpeciesCheck;
import org.junit.jupiter.api.Test;

//chain of responsibility tests
public class ChainTest {

    @Test
    void wrongSpeciesIsRejected() {
        Adopter ash = new Adopter("Ash", "Arcanine", 1, 6);
        Animal skitty = new Animal("#300-1", "Skitty", 3, "Healthy", "AVAILABLE");

        assertFalse(new SpeciesCheck().check(ash, skitty));
    }

    @Test
    void rightSpeciesIsAccepted() {
        Adopter ash = new Adopter("Ash", "Arcanine", 1, 6);
        Animal arcanine = new Animal("#059-1", "Arcanine", 3, "Healthy", "AVAILABLE");

        assertTrue(new SpeciesCheck().check(ash, arcanine));
    }

    @Test
    void tooOldIsRejected() {
        Adopter ash = new Adopter("Ash", "Arcanine", 1, 6);
        Animal oldArcanine = new Animal("#059-1", "Arcanine", 7, "Healthy", "AVAILABLE");

        assertFalse(new AgeRangeCheck().check(ash, oldArcanine));
    }
}