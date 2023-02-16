package fr.fms.bank;

import java.util.ArrayList;

public class Customer {
	private static int counter=0;
	private int id;
	private ArrayList<Account> listAccounts;
	private String lastName;
	private String firstName;
	private String email;
	
	/**
	 * Creation du constructeur pour la class customer avec 
	 * lien a la classe mere User
	 * @param savingAccountId
	 * @param currentAccountId
	 * @param id
	 * @param email
	 * @param lastName
	 * @param firstName
	 * @param adress
	 */
	public Customer (String email,String lastName,String firstName){
		counter++;
		setId(counter);
		setEmail(email);
		setLastName(lastName);
		setFirstName(firstName);
	
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
