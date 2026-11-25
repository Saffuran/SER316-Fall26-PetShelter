package view;

public class ConsoleView {
    public void showCycle(int day) {
        System.out.println("CYCLE " + day);
    }

    public void showEvent(String message) {
        System.out.println("EVENT " + message);
    }

    public void showSummary(String message) {
        System.out.println("SUMMARY " + message);
    }
}