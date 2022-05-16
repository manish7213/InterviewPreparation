package DesignPattern.creational.AbstractFactory;

public class AbstractFactoryDriver {

    public static void main(String[] args) {
        CarType type = new CarType();
        Car car = type.getCar("BenQ");
        System.out.println("Wheels: " + car.getWheels().getSpecification());
        System.out.println("Mirror: " + car.getMirrors().getSpecification());
        System.out.println("Engine: " + car.getEngine().getSpecification());
        System.out.println("Body: " + car.getBody().getSpecification());
    }
}
