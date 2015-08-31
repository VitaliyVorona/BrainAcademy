package com.brainacad.LABS_2_7.labs_2_7_1;

/**
 * Created by User on 26.08.2015.
 */
public class Monitor extends Device {
    private int resolutionX;
    private int resolutionY;
    private String mac;

    public Monitor(String manufac, int price, String serialNumber, int resolutionX, int resolutionY, int EthernetAdapter, String mac){
        super(manufac, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
        this.mac = mac;
    }

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

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    @Override
    public String toString() {

        return super.toString() + getResolutionX() + " x " + getResolutionY();
    }
}
