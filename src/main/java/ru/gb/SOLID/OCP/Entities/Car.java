package ru.gb.SOLID.OCP.Entities;

public class Car extends Vehicle{

    public Car(double maxSpeed, double allowedSpeedLimiter, String type) {
        super(maxSpeed, allowedSpeedLimiter, type);
    }
}
