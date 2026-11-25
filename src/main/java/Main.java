import java.util.Random;
import controller.SimulationController;
import model.Shelter;
import view.ConsoleView;

/**
 * Entry point for the pet shelter simulation.
 * Skeleton only: reads --days and --seed and prints the cycle structure.
 */

public class Main {
    public static void main(String[] args) {
        SimulationController controller =
                new SimulationController(new Shelter(), new ConsoleView(), 316L);
        controller.run(7);
    }
}


