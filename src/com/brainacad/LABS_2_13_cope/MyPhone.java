package com.brainacad.LABS_2_13_cope;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by User on 14.09.2015.
 */
public class MyPhone {
    /**
     * Created by User on 14.09.2015.
     */

    public MyPhone() {
    }

    private MyPhoneBook myPhoneBook = new MyPhoneBook();

    public void call(int phoneNumber) {
        System.out.println("Calling to " + myPhoneBook.phoneNumbers[phoneNumber]);
    }

    public void switchOn() {
        System.out.print("Loading PhoneBook records...");
        System.out.print("OK!");
        fillMyPhoneBook(myPhoneBook, 10);
        myPhoneBook.sortByName();
    }

    private void fillMyPhoneBook(MyPhoneBook myPhoneBook, int count){
        for (int i = 0; i < count; i++) {
            String name = Names.values()[i].toString();
            String phone = Phones.values()[i].toString().substring(1);
            myPhoneBook.addPhoneNumber(name, phone);
        }
    }

    public class MyPhoneBook {

        private PhoneNumber[] phoneNumbers = new PhoneNumber[10];

        public void sortByName() {
            Comparator sortPhoneNames = new Comparator() {
                @Override
                public int compare(Object o1, Object o2) {
                    PhoneNumber obj = (PhoneNumber) o1;
                    PhoneNumber obj2 = (PhoneNumber) o2;
                    return obj.getName().compareTo(obj2.getName());
                }
            };
            Arrays.sort(phoneNumbers, sortPhoneNames);
        }

        public void sortByPhoneNumber() {
            Arrays.sort(phoneNumbers, new Comparator() {
                @Override
                public int compare(Object o1, Object o2) {
                    PhoneNumber obj1 = (PhoneNumber) o1;
                    PhoneNumber obj2 = (PhoneNumber) o2;
                    return obj1.getPhone().compareTo(obj2.getPhone());
                }
            });
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

        class PhoneNumber {
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


}
