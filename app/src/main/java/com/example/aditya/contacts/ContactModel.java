package com.example.aditya.contacts;

public class ContactModel {

    String Person;
    String Number;

    public ContactModel(String person, String number) {
        Person = person;
        Number = number;
    }

    public String getPerson() {
        return Person;
    }

    public String getNumber() {
        return Number;
    }
}
