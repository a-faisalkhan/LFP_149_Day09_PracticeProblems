package com.bridgelabz.addressbooksystem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class AddressBook {

	Scanner scanner = new Scanner(System.in);
	public static List<Contact> contacts = new ArrayList<>();

	public void addContacts() {

		System.out.println("Enter the contact details");
		Contact contact = new Contact();

		System.out.println("Enter the first name");
		contact.setFirstName(scanner.next());

		System.out.println("Enter the last name");
		contact.setLastName(scanner.next());

		System.out.println("Enter the address");
		contact.setAddress(scanner.next());

		System.out.println("Enter the city name");
		contact.setCity(scanner.next());

		System.out.println("Enter the zip code");
		contact.setZip(scanner.next());

		System.out.println("Enter the phone number");
		contact.setPhoneNumber(scanner.next());

		System.out.println("Enter the email");
		contact.setEmail(scanner.next());

		contacts.add(contact);
	}

	public void editContact(String firstName) {
		for (int i = 0; i < contacts.size(); i++) {
			Contact contact = (Contact) contacts.get(i);
			if (contact.getFirstName().equals(firstName)) {
				System.out.println("What data you want to edit?");
				System.out.println("1.First name/2.Last name/3.Address/4.City/5.Zip/6.PhoneNumber/7.Email");
				switch (scanner.nextInt()) {
				case 1:
					System.out.println("Enter the new First Name you want to update");
					contact.setFirstName(scanner.next());
					break;
				case 2:
					System.out.println("Enter the Last Name you want to update");
					contact.setLastName(scanner.next());
					break;
				case 3:
					System.out.println("Enter the Address you want to update");
					contact.setAddress(scanner.next());
					break;
				case 4:
					System.out.println("Enter the City you want to update");
					contact.setCity(scanner.next());
					break;
				case 5:
					System.out.println("Enter the Zip you want to update");
					contact.setZip(scanner.next());
					break;
				case 6:
					System.out.println("Enter the Phone Number you want to update");
					contact.setPhoneNumber(scanner.next());
					break;
				case 7:
					System.out.println("Enter the Email you want to update");
					contact.setEmail(scanner.next());
					break;
				}
			}
		}
		System.out.println(AddressBook.contacts);
	}

	public void deleteContact(String firstName) {
		for (Contact contact : contacts) {
			if (contact.getFirstName().equals(firstName)) {
				contacts.remove(contact);
			}
			System.out.println(AddressBook.contacts);
			break;
		}
	}

}
