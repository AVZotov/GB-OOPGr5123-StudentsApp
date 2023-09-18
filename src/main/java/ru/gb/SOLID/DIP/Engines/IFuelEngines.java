package ru.gb.SOLID.DIP.Engines;

/**
 * Interface with base functionality of all fuel based engines
 */
public interface IFuelEngines {
    /**
     * Method to start engine returns true if all checks passed and engine started to work
     * @return boolean
     */
    public boolean Start();
}
