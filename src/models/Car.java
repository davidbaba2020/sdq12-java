package models;

import enums.TYPE;


//The car class created
public abstract class Car {
    /*
    Declaration of the class fields
     */
    private Integer id;
    private String name;
    private TYPE typeOfCar;
    private Integer modelYear;


    // No-Arguement constructor
    public Car() {
    }


    // All arguement constructor
    public Car(Integer id, String name, TYPE typeOfCar, Integer modelYear) {
        this.id = id;
        this.name = name;
        this.typeOfCar = typeOfCar;
        this.modelYear = modelYear;
    }


    //Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TYPE getTypeOfCar() {
        return typeOfCar;
    }


    public void setTypeOfCar(TYPE typeOfCar) {
        this.typeOfCar = typeOfCar;
    }

    public String getModelYear() {
        if(this.modelYear>=2022){
        return "Buy this Car";
        } else {
            return "Don't buy this car";
        }
    }

    public void setModelYear(Integer modelYear) {
        modelYear+=10;
        this.modelYear = modelYear;
    }


    //String method Overiding
    @Override
    public String toString() {
        return "Car[" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", typeOfCar=" + typeOfCar +
                ", modelYear=" + modelYear +
                ']';
    }
}
