package com.bridgelabz.addressbooksystem;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Contacts> contactList = new ArrayList<>();

    public static void main(String[] args)
    {
        // WELCOME MESSAGE
        System.out.println("--- Welcome to the Address Book System ---");
        AddressBookMain addressBookMain = new AddressBookMain();
        addressBookMain.addContactList();
    }

    // DISPLAY ADDRESS BOOK
    public void display(ArrayList<Contacts> contactList)
    {
        for (Contacts contacts : contactList)
        {
            System.out.println(contacts);
        }
    }

    // METHOD TO ADD NEW CONTACTS IN ADDRESS BOOK
    public void addContact(ArrayList<Contacts> contactList) {

        Contacts contacts = new Contacts();

        System.out.println("Enter First Name : ");
        contacts.firstName = sc.next();
        System.out.println("Enter Last Name : ");
        contacts.lastName = sc.next();
        System.out.println("Enter Address : ");
        contacts.address = sc.next();
        System.out.println("Enter City : ");
        contacts.city = sc.next();
        System.out.println("Enter State : ");
        contacts.state = sc.next();
        System.out.println("Enter Zip : ");
        contacts.zip = sc.nextInt();
        System.out.println("Enter Phone Number : ");
        contacts.phoneNumber = sc.nextLong();
        System.out.println("Enter Email : ");
        contacts.email = sc.next();

        contactList.add(contacts);
    }

    // METHOD TO EDIT CONTACT IN CONTACT BOOK
    public void editContact()
    {

        System.out.println("Enter the First Name of contact you wish to edit");
        String edit = sc.nextLine();
        System.out.println("Press 1 - To edit First Name");
        System.out.println("Press 2 - To edit Last Name");
        System.out.println("Press 3 - To edit Address");
        System.out.println("Press 4 - To edit City");
        System.out.println("Press 5 - To edit State");
        System.out.println("Press 6 - To edit Zip");
        System.out.println("Press 7 - To edit Phone Number");
        System.out.println("Press 8 - To edit Email");
        int choice = sc.nextInt();
        if (choice == 1) {
            for (Contacts contacts : contactList) {
                if (contacts.firstName.equals(edit)) {
                    System.out.println("Enter new First Name");
                    contacts.firstName = sc.next();
                }
            }
        }
        if (choice == 2) {
            for (Contacts contacts : contactList) {
                if (contacts.firstName.equals(edit)) {
                    System.out.println("Enter new Last Name");
                    contacts.lastName = sc.next();
                }
            }
        }
        if (choice == 3) {
            for (Contacts contacts : contactList) {
                if (contacts.firstName.equals(edit)) {
                    System.out.println("Enter New Address");
                    contacts.address = sc.next();
                }
            }
        }
        if (choice == 4) {
            for (Contacts contacts : contactList) {
                if (contacts.firstName.equals(edit)) {
                    System.out.println("Enter New City");
                    contacts.city = sc.next();
                }
            }
        }
        if (choice == 5) {
            for (Contacts contacts : contactList) {
                if (contacts.firstName.equals(edit)) {
                    System.out.println("Enter New State");
                    contacts.state = sc.next();
                }
            }
        }
        if (choice == 6) {
            for (Contacts contacts : contactList) {
                if (contacts.firstName.equals(edit)) {
                    System.out.println("Enter new Zip Code");
                    contacts.zip = sc.nextInt();
                }
            }
        }
        if (choice == 7) {
            for (Contacts contacts : contactList) {
                if (contacts.firstName.equals(edit)) {
                    System.out.println("Enter new Phone Number");
                    contacts.phoneNumber = sc.nextLong();
                }
            }
        }
        if (choice == 8) {
            for (Contacts contacts : contactList) {
                if (contacts.firstName.equals(edit)) {
                    System.out.println("Enter New Email");
                    contacts.email = sc.next();
                }
            }
        }
    }

    // METHOD TO DELETE CONTACTS IN ADDRESS BOOK
    public void deleteContact(ArrayList<Contacts> contactList)
    {
        System.out.println("Enter the First Name of the contact you wish to delete");
        String delete = sc.next();
        contactList.removeIf(contacts -> contacts.firstName.equals(delete));
    }

    // METHOD TO SHOW, ADD, EDIT AND DELETE CONTACT LIST IN ADDRESS BOOK
    public void addContactList() {
        while (true) {
            System.out.println("Press 0 - Display all contacts");
            System.out.println("Press 1 - Add contact");
            System.out.println("Press 2 - Edit contact");
            System.out.println("Press 3 - Delete contact");
            System.out.println("Press 6 - Exit");
            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 0 -> display(contactList);
                case 1 -> addContact(contactList);
                case 2 -> editContact();
                case 3 -> deleteContact(contactList);
            }
            if (option == 6) {
                break;
            }
        }
    }
}
