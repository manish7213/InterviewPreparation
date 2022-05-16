package DesignPattern.creational.Factory;

public class LoggerFactory {

    public AppLogger getLogger(String logType) {

        if (LoggerType.FILE.toString().equalsIgnoreCase(logType)) {
            return new FileLogger();
        }

        if (LoggerType.DATABASE.toString().equalsIgnoreCase(logType)) {
            return new DatabaseLogger();
        }

        if (LoggerType.CONSOLE.toString().equalsIgnoreCase(logType)) {
            return new ConsoleLogger();
        }

        return null;
    }
}
