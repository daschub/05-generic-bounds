package de.fhro.inf.prg3.a05.model;

public class Shrub extends Plant {

    // variables
    private PlantColor color;

    // constructor
    public Shrub(double height, String name, PlantColor color) {
        super(height, name);
        if (!color.equals(PlantColor.GREEN)){
            System.out.println("Falsche Farbe");
        }
    }

    @Override
    public PlantColor getColor() {
        return null;
    }
}
