package com.brainacad.LABS_2_13;

/**
 * Created by User on 11.09.2015.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        MyPhoneBook phoneBook = new MyPhoneBook();
        fillMyPhoneBook(phoneBook, 5);
        phoneBook.printPhoneBook();
    }

    public static void fillMyPhoneBook(MyPhoneBook book, int count) {
        for (int i = 0; i < count; i++) {
            String name = Names.values()[i].toString();
            String phone = Phones.values()[i].toString().substring(1);
            book.addPhoneNumber(name, phone);
        }
    }
}
