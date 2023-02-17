package fr.fms.bank;

import java.util.ArrayList;

public class Customer {
	private static int counter=0;
	private int id;
	private ArrayList<Account> listAccounts;
	private String lastName;
	private String firstName;
	private String email;
	private boolean isAdmin;
	
// dans le programme, 
//	if (customer1.getIsAdmin() == true) {
// lance le prog normal + les options ADMIN
// } else {
//	lance juste le prog normal }
	
	/**
	 * Creation du constructeur pour la class customer 
	 * @param id
	 * @param email
	 * @param lastName
	 * @param firstName
	 */
	public Customer (String email,String lastName,String firstName, boolean isAdmin){
		counter++;
		setId(counter);
		setEmail(email);
		setLastName(lastName);
		setFirstName(firstName);
		setIsAdmin(isAdmin);
	}

	public ArrayList<Account> getListAccounts() {
		return listAccounts;
	}

	public void setListAccounts(ArrayList<Account> listAccounts) {
		this.listAccounts = listAccounts;
	}

	public int getId() {
		return id;		
	}
	private void setId(int id) {
		this.id = id;
	}
	
	private void setIsAdmin(boolean b) {
		this.isAdmin = b;
	}
	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [Id=" + id + ", lastName=" + lastName + ", firstName=" + firstName +", email=" + email
				+ "]";
	}

}
