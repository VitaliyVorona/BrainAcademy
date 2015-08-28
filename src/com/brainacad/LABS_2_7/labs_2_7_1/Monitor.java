package com.brainacad.LABS_2_7.labs_2_7_1;

/**
 * Created by User on 26.08.2015.
 */
public class Monitor extends Device {
    private int resolutionX;
    private int resolutionY;
    private int EthernetAdapter;
    private String mac;

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    public int getEthernetAdapter() {
        return EthernetAdapter;
    }

    public void setEthernetAdapter(int ethernetAdapter) {
        EthernetAdapter = ethernetAdapter;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    @Override
    public String toString() {

        System.out.println(getClass().getSimpleName() + " manufacture =" + getManufacturer() + ", price =" + getPrice() + ", serialNumber=" + getSerialNumber());
        return getClass().getName() + "manufacture =" + getManufacturer() + ", price =" + getPrice() + ", serialNumber=";
    }
}
