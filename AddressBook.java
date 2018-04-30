package finalProject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AddressBook extends ArrayList<Entry> {
	private Entry pNew;

	public AddressBook() {
		// create a new addressbook
	}
	
	public void loadAddressBook(File bookFile) {
		// load address book from file
		try {
			FileReader fr = new FileReader(bookFile);
			BufferedReader bfReader = new BufferedReader(fr);
			String temp;
			while((temp = bfReader.readLine() != null)) {
				String attribute[] = temp.split(" | "); //split information the format i want
				this.add(new Entry(attribute[1], attribute[3], attribute[5])); //attribute each information type to corresponding section
			}
			bfReader.close();
			fr.close();
		}
		catch(Exception e) {
			System.out.println("Failed to load file from " + bookFile.getName());
			e.printStackTrace();
		}
	}
		
	public void saveAddressBook(File bookFile) {
		Entry p;
		try {
			FileWriter fw = new FileWriter(bookFile);
			BufferedWriter bfWriter = new BufferedWriter(fw);
			Iterator<Entry> i = this.iterator(); 
			while(i.hasNext()) {
				p = i.next(); // next contact 
				p.saveContact(bfWriter); // save that contact
				bfWriter.flush();
			}
		}
		catch(IOException e) {
			System.out.println("Failed to write into " + bookFile.getName());
			e.printStackTrace();
		}
	}
	
//	----------------------------------------------------------------------------------
	
	public add(Entry p) {
		System.out.println("\nPlease enter the contact name (Firstname Lastname): ");
		this.add(p); // add a new contact 
	}
	
	public void delete(Entry p) {
		this.remove(this.indexOf(p)); // delete the contact
	}
	
	public void update(Entry p) {
		this.set(this.indexOf(p), pNew);
	}

	public Entry[] search(String name) {
		Iterator<Entry> i = this.iterator();
		Entry p;
		ArrayList<Entry> search = new ArrayList<Entry>(0); //save the search result
		while(i.hasNext()) {
			p = i.next(); // search for next contact
			String pName = p.getName();
			boolean b = name.matches("[" + pName + "]*"); //match with the contact name
			if(b) search.add(p); //save the searched contact
		}
		Entry searched[] = new Entry[search.size()];
		return search.toArray(searched);
	}
	
	public int getSize() {
		return this.size(); //return number of contacts
	}
}