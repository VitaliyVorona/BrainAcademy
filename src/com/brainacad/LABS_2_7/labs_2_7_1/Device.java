package com.brainacad.LABS_2_7.labs_2_7_1;

/**
 * Created by User on 26.08.2015.
 */
public class Device {
    private String manufacturer;
    private float price;
    private String serialNumber;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public boolean equals(Object a) {
        if (a == null)return false;
        if (!(a instanceof Device)) return false;
        if (a == this)return true;
        return true;
    }

    @Override
    public String toString() {

//        System.out.println(getClass().getSimpleName() + " manufacture = " + getManufacturer() + ", price = " + getPrice() + ", serialNumber = " + getSerialNumber());
        return getClass().getSimpleName() + " manufacture = " + getManufacturer() + ", price = " + getPrice() + ", serialNumber = ";
    }
}
