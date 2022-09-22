package models;

import enums.TYPE;

public class Convertible extends Car{
    private Roof type;
    private Integer numberOfDoors;

    public Convertible(Roof type, Integer numberOfDoors) {
        this.type = type;
        this.numberOfDoors = numberOfDoors;
    }

    public Convertible() {
    }

    public Convertible(Integer id, String name, TYPE typeOfCar, Integer modelYear) {
        super(id, name, typeOfCar, modelYear);
    }

    public Convertible(Integer id, String name, TYPE typeOfCar, Integer modelYear, Roof type, Integer numberOfDoors) {
        super(id, name, typeOfCar, modelYear);
        this.type = type;
        this.numberOfDoors = numberOfDoors;
    }


    public Roof getType() {
        return type;
    }

    public void setType(Roof type) {
        this.type = type;
    }

    public Integer getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(Integer numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String toString() {
        return "Convertible{" +
                "type=" + type +
                ", numberOfDoors=" + numberOfDoors +
                "} " + super.toString();
    }
}
