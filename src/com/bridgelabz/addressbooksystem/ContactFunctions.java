



package com.bridgelabz.addressbooksystem;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ContactFunctions {

    public static Scanner sc = new Scanner(System.in);
    public ArrayList<Contacts> contactList = new ArrayList<>();

    // Add Contact Details to the AddressBook
    public void addContactDetails(){
        System.out.println("Enter the contact details:");
        System.out.println("Enter First Name");
        String firstName = sc.next();
        System.out.println("Enter last Name");
        String lastName = sc.next();
        System.out.println("Enter Address ");
        String address = sc.next();
        System.out.println("Enter City ");
        String city = sc.next();
        System.out.println("Enter State ");
        String state = sc.next();
        System.out.println("Enter  Email ");
        String email = sc.next();
        System.out.println("Enter phone Number");
        String phoneNumber = sc.next();
        System.out.println("Enter Zip code");
        String zip = sc.next();

        Contacts contactDetails = new Contacts(firstName, lastName, address, city, state, email, phoneNumber, zip);
        contactList.add(contactDetails);
        System.out.println(contactDetails);
    }

    // Edit Contact Detail By Firstname
    public boolean editContactDetails(String Name)
    {
        int flag = 0;
        for(Contacts contact: contactList)
        {
            if(contact.getFirstName().equals(Name))
            {

                System.out.println("""
                        Select an option to edit
                        1] First Name
                        2] Last Name
                        3] Address
                        4] City
                        5] State
                        6] Email7] phone Number
                        8] ZIP code
                        """);

                int choice = sc.nextInt();
                switch (choice) {
                    case 1 -> {
                        System.out.println("Enter First Name: ");
                        String firstName = sc.next();
                        contact.setFirstName(firstName);
                        break;
                    }
                    case 2 -> {
                        System.out.println("Enter Last Name: ");
                        String lastName = sc.next();
                        contact.setLastName(lastName);
                        break;
                    }
                    case 3 -> {
                        System.out.println("Enter Address: ");
                        String address = sc.next();
                        contact.setAddress(address);
                        break;
                    }
                    case 4 -> {
                        System.out.println("Enter City: ");
                        String city = sc.next();
                        contact.setCity(city);
                        break;
                    }
                    case 5 -> {
                        System.out.println("Enter State: ");
                        String state = sc.next();
                        contact.setState(state);
                        break;
                    }
                    case 6 -> {
                        System.out.println("Enter Email: ");
                        String email = sc.next();
                        contact.setZip(email);
                        break;
                    }
                    case 7 -> {
                        System.out.println("Enter Phone Number:");
                        String phoneNumber = sc.next();
                        contact.setPhoneNumber(phoneNumber);
                        break;
                    }
                    case 8 -> {
                        System.out.println("Enter Zip Code: ");
                        String zip = sc.next();
                        contact.setZip(zip);
                        break;
                    }
                }
                flag = 1;
                break;
            }
        }
        if(flag==1)
            return true;
        else
            return false;
    }

    //	Display Contact Details
    public boolean Display(String Name)
    {
        int flag = 0;
        for(Contacts contact: contactList)
        {
            if(contact.getFirstName().equals(Name))
            {
                System.out.println(contact);
                flag = 1;
                break;
            }
        }
        if(flag==1)
            return true;
        else
            return false;
    }

    // Delete Contact Details
    public boolean deleteContact(String name) {
        int flag = 0;
        for(Contacts contact: contactList)
        {
            if(contact.getFirstName().equals(name))
            {
                contactList.remove(contact);
                flag = 1;
                break;
            }
        }
        if(flag==1)
            return true;
        else
            return false;
    }

    //Check duplicate
    public void checkDuplicate() {
        Set<String> ContactSet = new HashSet<>();
        Set<Contacts> filterSet = contactList.stream().filter(n -> !ContactSet.add(n.getFirstName())).collect(Collectors.toSet());

        for (Contacts contact : filterSet) {
            System.out.println("The Duplicate Contact is: " + contact.getFirstName() );
        }
    }

    // Get Person Name by State
    public void getPersonNameByState(String State) {
        List<Contacts> list  = contactList.stream().filter(p ->p.getState().equals(State)).collect(Collectors.toList());
        for(Contacts contact: list){
            System.out.println("First Name: "+contact.getFirstName());
            System.out.println("Last Name: "+contact.getLastName());
        }
    }

    // Get Person Name by city
    public void getPersonNameByCity(String cityName) {
        List<Contacts> list  = contactList.stream().filter(p ->p.getCity().equals(cityName)).collect(Collectors.toList());
        for(Contacts contact: list){
            System.out.println("First Name: "+contact.getFirstName());
            System.out.println("Last Name: "+contact.getLastName());
        }
    }

    // Get count of contacts in a particular city
    public void getCountByCity(String city) {
        List<Contacts> list = contactList.stream().filter(p->p.getCity().equals(city)).collect(Collectors.toList());
        long total = Stream.of(list).count();
        System.out.println("The no: of contact on the given city is " + total);
    }

    // Get sorted contacts based on first name
    public void getSortedContactList() {
        System.out.println("\nSorting Address Book based on First Name");
        contactList.sort(Comparator.comparing(Contacts::getFirstName));
        contactList.forEach((Contacts contact) -> System.out.println(contact));
    }

    public void sortByCity() {
        System.out.println("\nSorting Address Book based on City Name");
        contactList.sort(Comparator.comparing(Contacts::getCity));
        contactList.forEach((Contacts contact) -> System.out.println(contact));
    }

    public void sortByState() {
        System.out.println("\nSorting Address Book based on State Name");
        contactList.sort(Comparator.comparing(Contacts::getState));
        contactList.forEach((Contacts contact) -> System.out.println(contact));
    }

    public void sortByZip() {
        System.out.println("\nSorting Address Book based on Zip Code");
        contactList.sort(Comparator.comparing(Contacts::getZip));
        contactList.forEach((Contacts contact) -> System.out.println(contact));
    }
}