package com.example.sane.a1customadapters.models;

/**
 * Created by Sane on 10/1/2017.
 */

public class Contact {


    String Name;
    String PhoneNumber;
    String Gender;

    public Contact(String name, String phoneNumber) {
        Name = name;
        PhoneNumber = phoneNumber;
    }

    public Contact(String name, String phoneNumber, String gender) {
        Name = name;
        PhoneNumber = phoneNumber;
        Gender = gender;
    }

    public String getName() {
        return Name;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public String getGender() {
        return Gender;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "Name='" + Name + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                ", Gender='" + Gender + '\'' +
                '}';
    }
}
