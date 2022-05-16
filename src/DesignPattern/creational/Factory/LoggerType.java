package DesignPattern.creational.Factory;

public enum LoggerType {
    FILE("file"),
    CONSOLE("console"),
    DATABASE("database");

    public final String label;

    private LoggerType(String label) {
        this.label = label;
    }
}
