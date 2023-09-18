package ru.gb.SOLID.LSP;

public class Rectangle extends Square{
    private double height;

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double GetArea() {
        return getWidth() * this.height;
    }
}
