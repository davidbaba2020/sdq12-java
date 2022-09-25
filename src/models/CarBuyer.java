package models;

import interfaces.CarBuyerInterface;

import java.util.List;

public class CarBuyer implements CarBuyerInterface {
    private Integer id;
    private String name;
    private Double Money;


    public CarBuyer() {
    }

    public CarBuyer(Integer id, String name, Double money) {
        this.id = id;
        this.name = name;
        Money = money;
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

    public Double getMoney() {
        return Money;
    }

    public void setMoney(Double money) {
        Money = money;
    }

    @Override
    public String toString() {
        return "CarBuyer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Money=" + Money +
                '}';
    }

    @Override
    public String buyCar(Company company, Car car) {
        String msg = "";
        List<Car> carsAvailable = company.getAllCars();
        for (int i = 0; i < carsAvailable.size(); i++) {
            if (carsAvailable.get(i) == car) {
                if (this.getMoney() >= car.getPrice()) {
                    this.setMoney(this.getMoney() - car.getPrice());
                    carsAvailable.remove(car);
                    msg = "Hurray! U have a new car";
                    return msg;
                } else {
                    msg= "Insufficient fund!";
                    return msg;
                }
            } else {
            }
            msg ="Car not available in the company";
            return msg;
        }
        return msg;
    }

    @Override
    public void buyCarVoid(Company company, Car car) {
        String msg = "";
        List<Car> carsAvailable = company.getAllCars();
        for (int i = 0; i < carsAvailable.size(); i++) {
            if (carsAvailable.get(i) == car) {
                if (this.getMoney() >= car.getPrice()) {
                    this.setMoney(this.getMoney() - car.getPrice());
                    carsAvailable.remove(car);
                    msg = "Hurray! U have a new car";
                    System.out.println(msg);
                } else {
                    msg= "Insufficient fund!";
                    System.out.println(msg);
                }
            } else {
            }
            msg ="Car not available in the company";
            System.out.println(msg);
        }
    }


}

