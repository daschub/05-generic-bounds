package de.fhro.inf.prg3.a05.model;

public enum PlantColor {
    RED ("red"),
    GREEN ("green"),
    BLUE ("blue"),
    YELLOW ("yellow"),
    ORANGE ("orange");

    private final String color;

    PlantColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
