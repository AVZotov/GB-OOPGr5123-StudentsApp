package ru.gb.SOLID.ISP;

public class Cube implements FigureVolume, FigureArea {
    private final int edge;
    private static final int SIZES_COUNT = 6;

    public Cube(int edge) {
        this.edge = edge;
    }

    @Override
    public double area() {
        return SIZES_COUNT * edge * edge;
    }

    @Override
    public double volume() {
        return edge * edge * edge;
    }
}
