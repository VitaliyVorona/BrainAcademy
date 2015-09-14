package com.brainacad.LABS_2_13;

/**
 * Created by User on 14.09.2015.
 */
public class MyPhoneBook {

    private PhoneNumber[] phoneNumbers = new PhoneNumber[10];

    public void sortByName() {

    }

    public void sortByPhoneNumber() {

    }

    public PhoneNumber addPhoneNumber(String name, String phone) {
        for (int i = 0; i < phoneNumbers.length; i++) {
            if (phoneNumbers[i] == null) {
                phoneNumbers[i] = new PhoneNumber(name, phone);
                break;
            }
        }
        return new PhoneNumber(name, phone);
    }

    public void printPhoneBook() {
        int i = 0;
        while (phoneNumbers[i] != null) {
            System.out.println(phoneNumbers[i].toString());
            i++;
        }
    }

    static class PhoneNumber {
        String name;
        String phone;

        public PhoneNumber(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        @Override
        public String toString() {
            return "name " + name + " phone " + phone;
        }
    }


}
