package com.bridgelabz.addressbooksystem;

import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) {
		System.out.println("<------------Welcome To Address Book Program------------->");
		Scanner scanner = new Scanner(System.in);
		AddressBook addressBook = new AddressBook();

		boolean exit = false;
		System.out.println("Enter Your Choice");

		while (!exit) {
			System.out.println("1.Create/Add Contact\t 2.Update Contact\t 3.Delete Contact\t 4.Quit");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter no of contact you want to add");
				int contactsCount = scanner.nextInt();
				for (int i = 0; i < contactsCount; i++) {
					addressBook.addContacts();
				}
				for (int i = 0; i < contactsCount; i++) {
					System.out.println(AddressBook.contacts.get(i));
				}
				break;
			case 2:
				System.out.println("Enter existing contact first name you want to edit");
				String firstName = scanner.next();
				addressBook.editContact(firstName);
				break;
			case 3:
				System.out.println("Enter the name you want to delete");
				String FirstName = scanner.next();
				addressBook.deleteContact(FirstName);
				break;
			case 4:
				exit = true;
				System.out.println("Thank you.....!!!");
				break;
			default:
				System.out.println("You are out of choices");
				break;
			}
		}
	}
}
