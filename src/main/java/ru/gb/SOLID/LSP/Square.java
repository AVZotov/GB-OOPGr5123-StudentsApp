package ru.gb.SOLID.LSP;

/**
 * Parent class for all square based figures
 */
public class Square{

    private double width;

    /**
     * method to set figures width
     * @param width int
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * method to get figure's width
     * @return double
     */
    public double getWidth() {
        return width;
    }

    /**
     * Method to count figure's area
     * @return double
     */
    public double GetArea(){
        return Math.pow(width, 2);
    }
}
