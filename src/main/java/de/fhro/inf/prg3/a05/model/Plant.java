package de.fhro.inf.prg3.a05.model;

abstract class Plant {

    // variables
    private double height;
    private String name;
    private String family;

    // constructor
    Plant(double height, String name){
        this.height = height;
        this.name = name;
    }

    // getter
    public double getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }

    public abstract PlantColor getColor();
}
