package DesignPattern.creational.AbstractFactory;

public abstract class Car {

    public abstract Parts getWheels();
    public abstract Parts getMirrors();
    public abstract Parts getEngine();
    public abstract Parts getBody();
}
