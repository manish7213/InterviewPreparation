package DesignPattern.creational.Factory;

public class FileLogger implements AppLogger {

    @Override
    public void log(String message) {
        // Logic to write to file
        System.out.println("LOGGED TO FILE");
    }
}
