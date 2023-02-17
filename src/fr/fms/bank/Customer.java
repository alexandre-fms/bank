package fr.fms.bank;

import java.util.ArrayList;
/**
 * La classe Customer sert à créer des clients ou des admins
 * @author ArenasA ChevinA DeAlbuquerqueD GuyauN
 *
 */
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
 * Constructeur permettant la création d'un client si isAdmin = false ou un admin si isAdmin = true
 * @param email		String l'adresse mail de l'utilisateur
 * @param lastName	String prénom de l'utilisateur
 * @param firstName	String nom de l'utilisateur
 * @param isAdmin	boolean définit si l'utilisateur est un admin
 */
	public Customer (String email,String lastName,String firstName, boolean isAdmin){
		counter++;
		setEmail(email);
		setLastName(lastName);
		setFirstName(firstName);
		setIsAdmin(isAdmin);
	}

	/**
	 * Retourne une ArrayList d'account
	 * @return ArrayList	retourne une liste des comptes
	 */
	public ArrayList<Account> getListAccounts() {
		return listAccounts;
	}

	/**
	 * Méthode permettant de modifier une liste de compte
	 * @param listAccounts	ArrayList	liste de comptes
	 */
	public void setListAccounts(ArrayList<Account> listAccounts) {
		this.listAccounts = listAccounts;
	}

	/**
	 * méthode permettant de récupérer l'id du compte
	 * @return	int l'id du compte
	 */
	public int getId() {
		return id;		
	}

	/**
	 * Méthode permettant de modifier un customer en admin et inversement
	 * @param b	boolean	true pour admin et false pour customer
	 */
	private void setIsAdmin(boolean b) {
		this.isAdmin = b;
	}
	/**
	 * Méthode permettant de récupérer le lastname utilisateur
	 * @return lastName	String le nom de l'utilisateur
	 */
	public String getLastName() {
		return lastName;
	}
/**
 * Méthode permettant de modifier le nom de l'utilisateur
 * @param lastName String le prénom de l'utilisateur
 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Méthode qui permet de rédupérer le prénom de l'utilisateur
	 * @return firstName String	le prénom de l'utilisateur
	 */
	public String getFirstName() {
		return firstName;
	}
/**
 * Méthode permettant de modifier le prénom de l'utilisateur
 * @param firstName	String le prénom de l'utilisateur
 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
/**
 * Méthode permettant de récupérer l'adresse mail de l'utilisateur
 * @return email String l'adresse mail de l'utilisateur
 */
	public String getEmail() {
		return email;
	}
/**
 * Méthode permettant de modifier l'adresse mail de l'utilisateur
 * @param email 	String 	l'adresse mail de l'utilisateur
 */
	public void setEmail(String email) {
		this.email = email;
	}
/**
 * Méthode d'affichage
 * @return String une chaine de caractère à afficher
 */
	@Override
	public String toString() {
		return "Customer [Id=" + id + ", lastName=" + lastName + ", firstName=" + firstName +", email=" + email
				+ "]";
	}

}
