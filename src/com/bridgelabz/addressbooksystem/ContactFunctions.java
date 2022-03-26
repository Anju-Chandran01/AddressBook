package com.bridgelabz.addressbooksystem;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactFunctions {

    static Scanner sc = new Scanner(System.in);

    public void addContact(ArrayList<Contacts> contactList) {

        Contacts contactItems = new Contacts();

        System.out.println("Enter first name : ");
        contactItems.firstName = sc.next();

        System.out.println("Enter last name : ");
        contactItems.lastName = sc.next();

        System.out.println("Enter address : ");
        contactItems.address = sc.nextLine();
        sc.next();

        System.out.println("Enter city : ");
        contactItems.city = sc.next();

        System.out.println("Enter state : ");
        contactItems.state = sc.next();

        System.out.println("Enter zip code : ");
        contactItems.zip = sc.nextInt();

        System.out.println("Enter phone number : ");
        contactItems.phoneNumber = sc.nextLong();

        System.out.println("Enter email : ");
        contactItems.email = sc.next();

        contactList.add(contactItems);

    }
    public void display(ArrayList<Contacts> contactList) {
        for (Contacts contactItems : contactList) {
            System.out.println(contactItems);
        }
    }
    public void editContact(ArrayList<Contacts> contactList) {

        System.out.println("Enter the first name of contact you wish to edit");
        String edit = sc.next();
        System.out.println("Press 1 - To edit first name");
        System.out.println("Press 2 - To edit last name");
        System.out.println("Press 3 - To edit address");
        System.out.println("Press 4 - To edit city");
        System.out.println("Press 5 - To edit state");
        System.out.println("Press 6 - To edit zip code");
        System.out.println("Press 7 - To edit phone number");
        System.out.println("Press 8 - To edit email");
        int choice = sc.nextInt();
        if (choice == 1) {
            for (Contacts contactItems : contactList) {
                if (contactItems.firstName.equals(edit)) {
                    System.out.println("Enter new first name");
                    contactItems.firstName = sc.next();
                }
            }
        }
        if (choice == 2) {
            for (Contacts contactItems : contactList) {
                if (contactItems.firstName.equals(edit)) {
                    System.out.println("Enter new last name");
                    contactItems.lastName = sc.nextLine();
                }
            }
        }
        if (choice == 3) {
            for (Contacts contactItems : contactList) {
                if (contactItems.firstName.equals(edit)) {
                    System.out.println("Enter new address");
                    contactItems.address = sc.nextLine();
                }
            }
        }
        if (choice == 4) {
            for (Contacts contactItems : contactList) {
                if (contactItems.firstName.equals(edit)) {
                    System.out.println("Enter new city");
                    contactItems.city = sc.next();
                }
            }
        }
        if (choice == 5) {
            for (Contacts contactItems : contactList) {
                if (contactItems.firstName.equals(edit)) {
                    System.out.println("Enter new state");
                    contactItems.state = sc.next();
                }
            }
        }
        if (choice == 6) {
            for (Contacts contactItems : contactList) {
                if (contactItems.firstName.equals(edit)) {
                    System.out.println("Enter new zip code");
                    contactItems.zip = sc.nextInt();
                }
            }
        }
        if (choice == 7) {
            for (Contacts contactItems : contactList) {
                if (contactItems.firstName.equals(edit)) {
                    System.out.println("Enter new phone number");
                    contactItems.phoneNumber = sc.nextLong();
                }
            }
        }
        if (choice == 8) {
            for (Contacts contactItems : contactList) {
                if (contactItems.firstName.equals(edit)) {
                    System.out.println("Enter new email");
                    contactItems.email = sc.next();
                }
            }
        }
    }
    public void deleteContact(ArrayList<Contacts> contactList) {
        System.out.println("Enter the first name of the contact you wish to delete");
        String delete = sc.next();
        contactList.removeIf(contactItems -> contactItems.firstName.equals(delete));
    }
}
