package com.bridgelabz.addressbooksystem;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Contacts> contactList = new ArrayList<>();

    public static void main(String[] args) {
        // WELCOME MESSAGE
        System.out.println("Welcome to the Address book program");
        AddressBookMain addressBookMain = new AddressBookMain();
        addressBookMain.addContactList();
    }

    // DISPLAY ADDRESS BOOK
    public void display(ArrayList<Contacts> contactList) {
        for (Contacts contactItems : contactList) {
            System.out.println(contactItems);
        }
    }

    //METHOD TO ADD NEW CONTACTS IN ADDRESS BOOK
    public void addContact(ArrayList<Contacts> contactList) {

        Contacts contactItems = new Contacts();

        System.out.print("Enter first name : ");
        contactItems.firstName = sc.next();
        System.out.println("Enter last name : ");
        contactItems.lastName = sc.next();
        System.out.println("Enter address : ");
        contactItems.address = sc.next();
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

    // METHOD TO EDIT CONTACTS IN THE ADDRESS BOOK
    public void editContact() {

        System.out.println("Enter First Name of contact you wish to edit");
        String edit = sc.nextLine();
        System.out.println("Option");
        System.out.println("1. To edit First Name\n2. To edit Last Name \n3. To edit Address \n4. To edit City \n5. To edit State \n6. To edit ZipCode \n7.To edit PhoneNumber \n8.To edit Email \n9. Exit");
        int option = sc.nextInt();
        switch (option) {
            case 1:
                for (Contacts contactItems : contactList) {
                    if (contactItems.firstName.equals(edit)) {
                        System.out.println("Enter new First Name");
                        contactItems.firstName = sc.next();
                    }
                }
                break;
            case 2:
                for (Contacts contactItems : contactList) {
                    if (contactItems.firstName.equals(edit)) {
                        System.out.println("Enter new Last Name");
                        contactItems.lastName = sc.next();
                    }
                }
                break;
            case 3:
                for (Contacts contactItems : contactList) {
                    if (contactItems.firstName.equals(edit)) {
                        System.out.println("Enter new Address");
                        contactItems.address = sc.next();
                    }
                }
                break;
            case 4:
                for (Contacts contactItems : contactList) {
                    if (contactItems.firstName.equals(edit)) {
                        System.out.println("Enter new City");
                        contactItems.city = sc.next();
                    }
                }
                break;
            case 5:
                for (Contacts contactItems : contactList) {
                    if (contactItems.firstName.equals(edit)) {
                        System.out.println("Enter new State");
                        contactItems.state = sc.next();
                    }
                }
                break;
            case 6:
                for (Contacts contactItems : contactList) {
                    if (contactItems.firstName.equals(edit)) {
                        System.out.println("Enter new Zip Code");
                        contactItems.zip = sc.nextInt();
                    }
                }
                break;
            case 7:
                for (Contacts contactItems : contactList) {
                    if (contactItems.firstName.equals(edit)) {
                        System.out.println("Enter new Phone Number");
                        contactItems.phoneNumber = sc.nextLong();
                    }
                }
                break;
            case 8:
                for (Contacts contactItems : contactList) {
                    if (contactItems.firstName.equals(edit)) {
                        System.out.println("Enter new Email");
                        contactItems.email = sc.next();
                    }
                }
                break;
        }
    }

    // METHOD TO DELETE CONTACT IN THE ADDRESS BOOK
    public void deleteContact(ArrayList<Contacts> contactList) {
        System.out.println("Enter the first name of the contact you wish to delete");
        String delete = sc.next();
        contactList.removeIf(contactItems -> contactItems.firstName.equals(delete));
    }

    // METHOD TO ADD MULTIPLE CONTACTS
    public void addContactList() {
        while (true) {
            System.out.println("Press 0 :- Display all contacts");
            System.out.println("Press 1 :- Add contact");
            System.out.println("Press 2 :- Edit contact");
            System.out.println("press 3 :- Delete contact");
            System.out.println("Press 6 :- Exit");

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
