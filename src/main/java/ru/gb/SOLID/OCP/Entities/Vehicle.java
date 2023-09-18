package ru.gb.SOLID.OCP.Entities;

/**
 * Parent class Vehicle with base functionality
 */
public abstract class Vehicle {
    protected final double maxSpeed;
    protected final double allowedSpeedLimiter;
    protected final String type;

    public Vehicle(double maxSpeed, double allowedSpeedLimiter, String type) {
        this.maxSpeed = maxSpeed;
        this.allowedSpeedLimiter = allowedSpeedLimiter;
        this.type = type;
    }

    /**
     * Method to get vehicle max speed
     * @return double
     */
    public double getMaxSpeed() {
        return maxSpeed;
    }

    /**
     * Method to get exact car limiter of max speed
     * @return double
     */
    public double getAllowedSpeedLimiter() {
        return allowedSpeedLimiter;
    }

    /**
     * Method to get car type
     * @return String
     */
    public String getType() {
        return type;
    }
}
