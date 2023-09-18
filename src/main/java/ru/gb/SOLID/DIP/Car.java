package ru.gb.SOLID.DIP;

import ru.gb.SOLID.DIP.Engines.IFuelEngines;

/**
 * Car class implements IFuelEngin functionality
 */
public class Car {
    private final IFuelEngines engine;

    public Car(IFuelEngines engine) {
        this.engine = engine;
    }

    public void start() {
        this.engine.Start();
    }
}
