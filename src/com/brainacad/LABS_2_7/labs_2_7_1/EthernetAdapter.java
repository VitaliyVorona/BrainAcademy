package com.brainacad.LABS_2_7.labs_2_7_1;

/**
 * Created by User on 31.08.2015.
 */
public class EthernetAdapter extends Device {
    private int speed;
    private String mac;

    public EthernetAdapter(String manufac, int price, String serialNumber, int speed, String mac) {
        super(manufac, price, serialNumber);
        this.speed = speed;
        this.mac = mac;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    @Override
    public String toString() {
        return super.toString() + " speed = "  + getSpeed() + " mac = " + getMac();
    }
}
