package interfaces;

import models.Car;
import models.Company;

public interface CarBuyerInterface {

    String buyCar(Company company, Car car);
    void buyCarVoid (Company company, Car car);
}
