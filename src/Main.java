import enums.Department;
import enums.Gender;
import enums.ROOFTYPE;
import enums.TYPE;
import models.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
//        Car benz = new Car(23,"Mercedizes Benz", TYPE.BENZ,2022);
//        Car honda = new Car(24,"Honda", TYPE.HONDA,2029);
//        Car benz2 = new Car();
//        benz2.setName("Benzy");
//        System.out.println(benz2);

//            Integer n = 1;
//
//        for(int i=0; i<10; i++) {
//            Car benz = new Car(n,"Mercedizes Benz", TYPE.BENZ,2022);
//            n++;
//            System.out.println(benz);
//        }

//        System.out.println(benz);
////        System.out.println(benz.getModelYear()+10);
//        System.out.println(benz.getModelYear());
//        System.out.println(benz);
//        benz.setModelYear(2010);
//        System.out.println(benz);
//        System.out.println(benz.getModelYear());

//        List<Car> myCars = new ArrayList<>();
//        myCars.add(benz);
//        myCars.add(honda);
//        System.out.println(myCars.get(1));


        List<Convertible> numConv = new ArrayList<>();
        List<Car> numCar = new ArrayList<>();

        //Inheritance Part
        Roof openRoof = new Roof(1,ROOFTYPE.OPEN);
        Roof closeRoof = new Roof(2,ROOFTYPE.CLOSE);
        Roof openCloseRoof = new Roof(3,ROOFTYPE.OPENANDCLOSE);

        Convertible con1 = new Convertible(1,"Convertible",TYPE.TESLA,2010, 300.00,openRoof,2);
//        Convertible con = new Convertible(1,"Convertible",TYPE.TESLA,2010, 2000.00,openRoof,2);
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

//        numConv.add(con1);
//        numCar.add(benz);
//        numCar.add(con1);

//
//        System.out.println(con1);
//        System.out.println(con1.getName());


        //Composition Principle
        Company decaCars = new Company();

        decaCars.setId(1);
        decaCars.setCompanyName("DECAMOTORS");
        decaCars.setStaff(staffList);
        decaCars.setAllCars(companyCars);
        decaCars.setTypeOfCars(carTypes);

//        System.out.println(decaCars);

        Car secondCar = decaCars.getAllCars().get(1);
        Staff thirdStaff = decaCars.getStaff().get(2);
        System.out.println(secondCar);
//        System.out.println(thirdStaff);


        CarBuyer Ben = new CarBuyer(1,"Ben J",2000.00);


        System.out.println(Ben.buyCar(decaCars,con1));
        System.out.println(decaCars.getAllCars().size());
        System.out.println(Ben.getMoney());
    }
}