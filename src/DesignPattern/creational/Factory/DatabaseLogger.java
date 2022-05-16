package DesignPattern.creational.Factory;

public class DatabaseLogger implements AppLogger {

    @Override
    public void log(String message) {
        // Obtain DB connection
        // Log to database
        System.out.println("LOGGED TO DATABASE");
    }
}
