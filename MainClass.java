package finalProject;

import java.io.File;
import java.util.Iterator;
import java.util.Scanner;

public class MainClass {
	private static AddressBook myAddressBook = new AddressBook(); //create address book object
	private static File f = new File("default.txt"); //open address book file
	
	public static void main(String[] args) {
		showMainMenu();
	}
	
	public static void showMainMenu() {
		show("Main Menu: ");
		show("\t1 View all contacts");
		show("\t2 Add new contact");
		show("\t3 Delete contact");
		show("\t4 Update contact");
		show("\t5 Search contact");
		show("\t6 Save Address Book");
		show("\t7 Exit");
		System.out.println("What would you like to do? (enter number 1~7)");
		Scanner in = new Scanner(System.in);
		int select = in.nextInt();
		switch(select) {
			case 1:
				showAddressBook(); //view all contacts
				break;
			case 2:
				addNewContact(); // add contact
				break;
			case 3:
				deleteContact(); //delete contact
				break;
			case 4:
				updateContact(); //update contact
				break;
			case 5:
				findContact();
				break;
			case 6:
				saveAddressBook();
				break;
			case 7:
				System.exit(0);
				break;
			default:
				showMainMenu();
		}
		
	}
	
	public static void show(String s) {
		System.out.println(s);
	}
	
	public static void enter() {
		new Scanner(System.in).nextLine(); //press enter to continue
	}
	
	public static void showAddressBook() {
		Iterator<Entry> i = myAddressBook.iterator();
		Entry p;
		if(myAddressBook.size() == 0) {
			show("The Address Book is empty! Press enter to return to main menu.");
			enter();
			showMainMenu();
			return;
		}
		while(i.hasNext()) {
			p = i.next();
			showEntry(p); //show contact
		}
		show("You've reached the bottom. Press enter to return to main menu.");
		enter();
		showMainMenu();
	}
	
	public static void showEntry(Entry p) {
		show("\nName: " + p.getName() + "\nNumber: " + p.getNumber() + "\nEmail: " + p.getEmail());
	}
	
	public static void findContact() {
		show("Please enter contact name: ");
		String s = new Scanner(System.in).next();
		Entry found[] = myAddressBook.search(s); //find contact
		if(found.length == 0) {
			show("No such person. Press enter to return to main menu.");
			enter();
			showMainMenu();
			return;
		}
		for(Entry p:found) {
			showEntry(p);
		}
		show("Above are all contact found. Press enter to return to main menu.");
		enter();
		showMainMenu();
	}
	
	public static void addNewContact() {
		show("Please enter the information: ");
		System.out.println("Name: ");
		String name = new Scanner(System.in).next();
		System.out.println("Number: ");
		String number = new Scanner(System.in).next();
		System.out.println("Email: ");
		String email = new Scanner(System.in).next();
		Entry p = new Entry(name, number, email);
		show("Below is the new contact to be created: ");
		showEntry(p);
		System.out.println("Are you sure to create the new contact? y/n");
		String yesno = new Scanner(System.in).next();
		if("y".equals(yesno)) {
			myAddressBook.add(p);
			show("Contact added. Press enter to return to main menu.");
			enter();
			showMainMenu();
		}
		else {
			show("Add contact cancelled. Press enter to return to main menu.");
			enter();
			showMainMenu();
		}
	}
	
	public static void deleteContact() {
		show("Please enter contact name that you want to delete: ");
		String s = new Scanner(System.in).next();
		Entry found[] = myAddressBook.search(s); //find contact
		if(found.length == 0) {
			show("No such person. Press enter to return to main menu.");
			enter();
			showMainMenu();
			return;
		}
		for(Entry p:found) {
			myAddressBook.delete(p);
		}
		show("Contact has been deleted. Press enter to return to main menu.");
		enter();
		showMainMenu();
	}
	
	public static void updateContact() {
		show("Please enter the contact name that you want to update: ");
		String s = new Scanner(System.in).next();
		Entry found[] = myAddressBook.search(s); //find contact
		if(found.length == 0) {
			show("No such person. Press enter to return to main menu.");
			enter();
			showMainMenu();
			return;
		}
		for(Entry p:found) {
			show("Please enter new information: ");
			System.out.println("Name: ");
			String name = new Scanner(System.in).next();
			System.out.println("Number: ");
			String number = new Scanner(System.in).next();
			System.out.println("Email: ");
			String email = new Scanner(System.in).next();
			show("Below is the new contact to be created: ");
			show("Name: " + name + "\nNumber: " + number + "\nEmail: " + email);
			System.out.println("Are you sure to update the contact? y/n");
			String yesno = new Scanner(System.in).next();
			if("y".equals(yesno)) {
				myAddressBook.update(p);
				show("Contact has been updated. Press enter to return to main menu.");
				enter();
				showMainMenu();
			}
			else {
				show("Update contact cancelled. Press enter to return to main menu.");
				enter();
				showMainMenu();
			}
		}
	}	
	
	public static void openAddressBook() {
		System.out.println("Enter address book file name: ");
		f = new File(new Scanner(System.in).next());
		myAddressBook.loadAddressBook(f);
		show("Open successfully! Press enter to return to main menu.");
		enter();
		showMainMenu();
	}
	
	public static void saveAddressBook() {
		myAddressBook.saveAddressBook(f);
		show("Save successfully! Press enter to return to main menu.");
		enter();
		showMainMenu();
	}

}
