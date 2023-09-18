package ru.gb.SOLID.OCP.Services;

import ru.gb.SOLID.OCP.Entities.Vehicle;

/**
 * Support class
 */
public class SpeedCalculation {

    /**
     * Method to calculate max allowed speed
     * @param vehicle exact car
     * @return double
     */
    public static double calculateAllowedSpeed(Vehicle vehicle) {
        return vehicle.getMaxSpeed() * vehicle.getAllowedSpeedLimiter();
    }
}
