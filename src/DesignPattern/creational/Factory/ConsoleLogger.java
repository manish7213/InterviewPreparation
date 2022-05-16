package DesignPattern.creational.Factory;

public class ConsoleLogger implements AppLogger{

    @Override
    public void log(String message) {
        // Write the log to console
        System.out.println(message);
        System.out.println("LOGGED TO CONSOLE");
    }
}
