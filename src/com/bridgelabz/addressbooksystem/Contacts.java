package com.bridgelabz.addressbooksystem;

public class Contacts {

    // VARIABLES
    String firstName;
    String lastName;
    long phoneNumber;
    String email;
    String address;
    String city;
    String state;
    int zip;

    @Override
    public String toString() {
        return "Contacts{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                '}';
    }
}