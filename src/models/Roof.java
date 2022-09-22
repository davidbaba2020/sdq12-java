package models;

import enums.ROOFTYPE;

public class Roof {
    private Integer id;
    private ROOFTYPE roofType;

    public Roof() {
    }

    public Roof(Integer id, ROOFTYPE roofType) {
        this.id = id;
        this.roofType = roofType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ROOFTYPE getRoofType() {
        return roofType;
    }

    public void setRoofType(ROOFTYPE roofType) {
        this.roofType = roofType;
    }

    @Override
    public String toString() {
        return "Roof{" +
                "id=" + id +
                ", roofType=" + roofType +
                '}';
    }
}
