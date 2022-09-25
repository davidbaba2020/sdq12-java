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
    private Double price;


    // No-Arguement constructor
    public Car() {
    }


    // All arguement constructor

    public Car(Integer id, String name, TYPE typeOfCar, Integer modelYear, Double price) {
        this.id = id;
        this.name = name;
        this.typeOfCar = typeOfCar;
        this.modelYear = modelYear;
        this.price = price;
    }

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

    public Integer getModelYear() {
        return modelYear;
    }

    public void setModelYear(Integer modelYear) {
        this.modelYear = modelYear;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", typeOfCar=" + typeOfCar +
                ", modelYear=" + modelYear +
                ", price=" + price +
                '}';
    }
}
