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

    public String toString() {
        return "ContactItems [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city="
                + city + ", state=" + state + ", zip=" + zip + ", phoneNumber=" + phoneNumber + ", email=" + email
                + "]";
    }
}
