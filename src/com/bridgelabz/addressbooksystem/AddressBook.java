package com.bridgelabz.addressbooksystem;

import java.util.Scanner;

public class AddressBook {

    // VARIABLES
    private  String FirstName;
    private String LastName;
    private String State;
    private String City;
    private String Address;
    private long ZipCode;
    private long PhoneNO;
    private String Email;

    // GETTERS AND SETTERS FOR THE DECLARED VARIABLE
    Scanner input = new Scanner(System.in);

    public String getFirstName() {
        return FirstName;
    }
    public void setFirstName(String firstName) {
        FirstName = firstName;
    }
    public String getLastName() {
        return LastName;
    }
    public void setLastName(String lastName) {
        LastName = lastName;
    }
    public String getState() {
        return State;
    }
    public Long getPhoneNO() {
        return PhoneNO;
    }
    public void setPhoneNO(Long phoneNO) {
        PhoneNO = phoneNO;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        Email=email;
    }
    public String getCity() {
        return City;
    }
    public void setCity(String city) {
        City = city;
    }
    public void setState(String state) {
        this.State = state;
    }
    public String getAddress() {
        return Address;
    }
    public void setAddress(String address) {
        this.Address = address;
    }
    public Long getZipCode() {
        return ZipCode;
    }
    public void setZipCode(Long zipCode) {
        ZipCode = zipCode;
    }

    public void display()
    {
        System.out.print("Enter First Name : ");
        setFirstName(input.nextLine());
        System.out.print("Enter Last Name : ");
        setLastName(input.nextLine());
        System.out.print("Enter State : ");
        setState(input.next());
        System.out.print("Enter City : ");
        setCity(input.next());
        System.out.print("Enter Address : ");
        setAddress(input.next());
        System.out.print("Enter Zip : ");
        setZipCode(input.nextLong());
        System.out.print("Enter PhoneNo : ");
        setPhoneNO(input.nextLong());
        System.out.print("Enter Email : ");
        setEmail(input.next());

        System.out.println("--- Address Book of the above entered Contact --- ");
        System.out.println("First Name :\t" + this.getFirstName());
        System.out.println("Last Name :\t" + this.getLastName());
        System.out.println("Phone No :\t" + this.getPhoneNO());
        System.out.println("Email :\t" + this.getEmail());
        System.out.println("Address :\t" + this.getAddress());
        System.out.println("City :\t" + this.getCity());
        System.out.println("State :\t" + this.getState());
        System.out.println("Zip :\t" + this.getZipCode());
    }

    public static void main(String[] args)
    {
        // DISPLAY ADDRESS BOOK WITH A CONTACT
        System.out.println("Enter details of 1st user");
        AddressBook user1 = new  AddressBook();
        user1.display();

        // ADD ONE MORE CONTACT TO THE ADDRESS BOOK
        System.out.println("Enter details of 2nd user");
        AddressBook user2 = new  AddressBook();
        user2.display();
    }
}
