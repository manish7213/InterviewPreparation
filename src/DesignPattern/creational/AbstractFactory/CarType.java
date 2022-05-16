package DesignPattern.creational.AbstractFactory;

public class CarType {
    private Car car;

    public Car getCar(String carType) {
        if (carType.equalsIgnoreCase("BenQ")) {
            return new BenQ();
        }

        if (carType.equalsIgnoreCase("BMW")) {
            return new BMW();
        }

        if (carType.equalsIgnoreCase("GeneralMotors")) {
            return new GeneralMotors();
        }

        return null;
    }
}
