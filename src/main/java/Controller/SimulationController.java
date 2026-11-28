package controller;

import java.util.Random;
import model.Shelter;
import view.ConsoleView;

public class SimulationController {
    private final Shelter shelter;
    private final ConsoleView view;
    private final Random random;

    public SimulationController(Shelter shelter, ConsoleView view, long seed) {
        this.shelter = shelter;
        this.view = view;
        this.random = new Random(seed);
    }

    public void run(int days) {
        for (int day = 1; day <= days; day++) {
            view.showCycle(day);
            // intake -> vet (Decorator) -> adoption (Chain) through view
        }
        view.showSummary("Simulation finished after " + days + " days");
    }
}