package models;

import enums.Department;
import enums.ROOFTYPE;
import enums.TYPE;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class CarBuyerTest {

//    @Test
//    void buyCar() {
//        Roof openRoof = new Roof(1, ROOFTYPE.OPEN);
//        Roof closeRoof = new Roof(2,ROOFTYPE.CLOSE);
//        Roof openCloseRoof = new Roof(3,ROOFTYPE.OPENANDCLOSE);
//
//        Convertible con1 = new Convertible(1,"Convertible", TYPE.TESLA,2010, 300.00,openRoof,2);
//        Convertible con2 = new Convertible(2,"BMW",TYPE.BMW,2030, 15000.00,closeRoof,6);
//        Convertible con3 = new Convertible(3,"HONDA",TYPE.HONDA,2050, 2500.00,openCloseRoof,10);
//
//
//        //Company Cars
//        List<Car> companyCars = new ArrayList<>();
//        companyCars.add(con1);
//        companyCars.add(con2);
//        companyCars.add(con3);
//
//
//        //Staff in the company
//        Staff Henry = new Staff(1,"Henry", Department.SALES);
//        Staff Peace = new Staff(2,"PEACE", Department.FINANCE);
//        Staff Chidi = new Staff(3,"CHIDI", Department.OPERATIONS);
//        Staff Aisha = new Staff(4,"AISHA", Department.MANUFACTURING);
//
//        List<Staff> staffList = new ArrayList<>();
//
//        staffList.add(Henry);
//        staffList.add(Peace);
//        staffList.add(Chidi);
//        staffList.add(Aisha);
//
//
//        Set<String> carTypes= new HashSet<>();
//        carTypes.add("FOUR-WHEEL-DRIVE");
//        carTypes.add("FOUR-WHEEL-DRIVE");
//        carTypes.add("REAR-WHEEL-DRIVE");
//        carTypes.add("all-wheel-drive");
//
//        //Composition Principle
//        Company decaCars = new Company();
//
//        decaCars.setId(1);
//        decaCars.setCompanyName("DECAMOTORS");
//        decaCars.setStaff(staffList);
//        decaCars.setAllCars(companyCars);
//        decaCars.setTypeOfCars(carTypes);
//
////        System.out.println(decaCars);
////
////        Car secondCar = decaCars.getAllCars().get(1);
////        Staff thirdStaff = decaCars.getStaff().get(2);
//
//        CarBuyer Ben = new CarBuyer(1,"Ben J",20000000000.00);
//        String carBought = Ben.buyCar(decaCars,con1);
//        String msgSuccess = "Hurray! U have a new car";
//        String msgFail = "Insufficient fund!";
//        String msgCarNotAvailable = "Car not available in the company";
//        Assert.assertEquals(msgSuccess,carBought);
//        Assert.assertNotEquals(msgFail,carBought);
//
//    }

    @Test
    void buyCarVoid() {
        Roof openRoof = new Roof(1, ROOFTYPE.OPEN);
        Roof closeRoof = new Roof(2,ROOFTYPE.CLOSE);
        Roof openCloseRoof = new Roof(3,ROOFTYPE.OPENANDCLOSE);

        Convertible con1 = new Convertible(1,"Convertible", TYPE.TESLA,2010, 300.00,openRoof,2);
        Convertible con2 = new Convertible(2,"BMW",TYPE.BMW,2030, 15000.00,closeRoof,6);
        Convertible con3 = new Convertible(3,"HONDA",TYPE.HONDA,2050, 2500.00,openCloseRoof,10);


        //Company Cars
        List<Car> companyCars = new ArrayList<>();
        companyCars.add(con1);
        companyCars.add(con2);
        companyCars.add(con3);


        //Staff in the company
        Staff Henry = new Staff(1,"Henry", Department.SALES);
        Staff Peace = new Staff(2,"PEACE", Department.FINANCE);
        Staff Chidi = new Staff(3,"CHIDI", Department.OPERATIONS);
        Staff Aisha = new Staff(4,"AISHA", Department.MANUFACTURING);

        List<Staff> staffList = new ArrayList<>();

        staffList.add(Henry);
        staffList.add(Peace);
        staffList.add(Chidi);
        staffList.add(Aisha);


        Set<String> carTypes= new HashSet<>();
        carTypes.add("FOUR-WHEEL-DRIVE");
        carTypes.add("FOUR-WHEEL-DRIVE");
        carTypes.add("REAR-WHEEL-DRIVE");
        carTypes.add("all-wheel-drive");

        //Composition Principle
        Company decaCars = new Company();

        decaCars.setId(1);
        decaCars.setCompanyName("DECAMOTORS");
        decaCars.setStaff(staffList);
        decaCars.setAllCars(companyCars);
        decaCars.setTypeOfCars(carTypes);

//        System.out.println(decaCars);
//
//        Car secondCar = decaCars.getAllCars().get(1);
//        Staff thirdStaff = decaCars.getStaff().get(2);

        CarBuyer Ben = new CarBuyer(1,"Ben J",20000000000.00);
        Ben.buyCar(decaCars,con1);
        String msgSuccess = "Hurray! U have a new car";
        String msgFail = "Insufficient fund!";
        String msgCarNotAvailable = "Car not available in the company";
//        companycompanyAssert.assertEquals(msgSuccess,carBought);
        Double benM = Ben.getMoney();
        Double benOrM = 20000000000.00;
        Integer conpCars = decaCars.getAllCars().size();
//        Assert.assertNotEquals(benM,benOrM);
        Integer n = 2;
        Assert.assertEquals(n,conpCars);
    }
}