package com.brainacad.LABS_2_2_4;

/**
 * Created by User on 17.08.2015.
 */
public class Emploee {
    private String firstName, lastName, occupation;
    private int telephone;
    public static int numberOfEmployees;

    public Emploee(String firstName, String lastName, String occupation, int telephone){
        numberOfEmployees++;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public static int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public static void setNumberOfEmployees(int numberOfEmployees) {
        Emploee.numberOfEmployees = numberOfEmployees;
    }
}
