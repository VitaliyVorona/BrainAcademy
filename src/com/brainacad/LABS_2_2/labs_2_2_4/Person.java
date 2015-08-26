package com.brainacad.LABS_2_2.labs_2_2_4;

/**
 * Created by User on 12.08.2015.
 */
public class Person {
    String firstName,
            lastName,
            gender;
    int age,
            phoneNumber;

    public void set(String firstName) {
        this.firstName = firstName;
        this.lastName = "Smith";
        this.gender = "male";
        this.age = 34;
        this.phoneNumber = 123456;
    }

    public void set(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = "male";
        this.age = 34;
        this.phoneNumber = 123456;
    }

    public void set(String firstName, String lastName, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public void set(String firstName, String lastName, String gender, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
    }

    public void set(String firstName, String lastName, String gender, int age, int phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public void printAll() {
        System.out.println("Name is " + firstName + " family name is " +  lastName + " age is " + age + " phone number is " + phoneNumber);
    }
}
