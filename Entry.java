package finalProject;

import java.io.BufferedWriter;
import java.io.IOException;

public class Entry {
	private String name;
	private String number;
	private String email;
	
	public Entry(String name, String number, String email) {
		this.name = name;	//contact name
		this.number = number;	//phone number
		this.email = email;    //email address
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	public void saveContact(BufferedWriter out) {
		try {
			out.write(this.name + " | " + this.number + " | " + this.email);
			out.newLine();
		}
		catch(IOException e) {
			System.out.println("Save contact error");
			e.printStackTrace();
		}
	}
	
	public Entry getUpdateContact() {
		return new Entry(this.name, this.number, this.email);
	}
}
