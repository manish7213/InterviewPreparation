package DesignPattern.creational.AbstractFactory;

public class GeneralMotors extends Car {
    @Override
    public Parts getWheels() {
        return new Parts("General Motor's Wheels");
    }

    @Override
    public Parts getMirrors() {
        return new Parts("General Motor's Mirror");
    }

    @Override
    public Parts getEngine() {
        return new Parts("General Motor's Engine");
    }

    @Override
    public Parts getBody() {
        return new Parts("General Motor's Body");
    }
}
