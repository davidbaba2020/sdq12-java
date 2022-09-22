package models;

import java.util.List;
import java.util.Set;

public class Company {
    private Integer id;
    private String companyName;
    private Set<String> typeOfCars;
    private List<Staff> staff;
    private List<Car> allCars;

    public Company() {
    }

    public Company(Integer id, String companyName, Set<String> typeOfCars,
                   List<Staff> staff, List<Car> allCars) {
        this.id = id;
        this.companyName = companyName;
        this.typeOfCars = typeOfCars;
        this.staff = staff;
        this.allCars = allCars;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Set<String> getTypeOfCars() {
        return typeOfCars;
    }

    public void setTypeOfCars(Set<String> typeOfCars) {
        this.typeOfCars = typeOfCars;
    }

    public List<Staff> getStaff() {
        return staff;
    }

    public void setStaff(List<Staff> staff) {
        this.staff = staff;
    }

    public List<Car> getAllCars() {
        return allCars;
    }

    public void setAllCars(List<Car> allCars) {
        this.allCars = allCars;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", companyName='" + companyName + '\'' +
                ", typeOfCars=" + typeOfCars +
                ", staff=" + staff +
                ", allCars=" + allCars +
                '}';
    }
}
