package fr.fms.bank;

import java.util.HashMap;
import java.util.Map;

/**
 * la classe Admin hérite de la classe User
 * un admin possède les droit de création de compte et d'utilisateur en plus de
 * ce que peut faire un utilisateur normal
 * @author ArenasA
 *
 */
public class Admin extends User {

	private boolean admin = true;
	
	
	/**
	 * 
	 * @param admin		boolean true = admin, false = client
	 * @param name		String nom utilisateur
	 * @param firstName	String prénom utilisateur
	 * @param address	String adresse de l'utilisateur
	 * @param mail		String adresse mail de l'utilisateur
	 */
	public Admin(String name, String firstName, String address, String mail, boolean admin) {
		super(name, firstName, address, mail);
		this.admin = admin;
	}
	/**
	 * méthode qui permet de savoir si l'utilisateur est un admin
	 */
	public boolean getAdmin() {
		return admin;
	}

	/**
	 * retourne une chaine de caractère mentionnant si l'utilisateur est un admin ou non.
	 */
	@Override
	public String toString() {
		if(getAdmin() == false)return "L'utilisateur n'est pas un admin";
		return "L'utilisateur est bien un admin.";
	}
	/**
	 * 
	 * @param name		String nom utilisateur
	 * @param firstName	String prénom utilisateur
	 * @param address	String adresse de l'utilisateur
	 * @param mail		String adresse mail de l'utilisateur
	 */
	public void createCustomer(String name, String firstName, String address, String mail, HashMap<String, Customer> customers) {
		Customer client = new Customer(name, firstName, address, mail);
		customers.put(name.toLowerCase()+firstName.toLowerCase(), client);
	}
	
	/**
	 * Cette méthode permet de supprimer un utilisateur via sa clé (ici nom + prenom)
	 * on empêche aussi le fait de supprimer un compte admin
	 * @param name		nom de l'utilisateur
	 * @param firstName	prénom de l'utilisateur
	 */
	public void removeCustomer(String name, String firstName, HashMap<String, Customer> customers) {
		try {
			if(getAdmin() == false) {
				if(customers.keySet().contains(name.toLowerCase()+firstName.toLowerCase())) {
					customers.remove(name.toLowerCase()+firstName.toLowerCase());
				}
			}else {
				System.out.println("Vous ne pouvez pas supprimer un admin.");
			}
		} catch (Exception e) {
			System.out.println("Le client n'existe pas ou ne peut pas être supprimé.");
		}
		
	}
	
	/**
	 * méthode qui permet de créer un compte courant, nécessite les infos suivantes 
	 * @param libelle		intitulé du compte
	 * @param amount		montant sur le compte
	 * @param overdraft		boolean pour découvert autorisé ou non
	 * @param customer		l'objet Client (Customer) associé au compte.
	 */
	public void createCurrentAccount(String libelle, int amount, boolean overdraft, HashMap<String, Customer> customers,HashMap<String, CurrentAccount> currents) {
		CurrentAccount newAccount = new CurrentAccount(libelle, amount, overdraft, customers);
		currents.put(customers.getName().toLowerCase()+customers.getFirstName().toLowerCase(), newAccount);
	}
	
	public void removeCurrentAccount(Customer customer, HashMap<String, CurrentAccount> currents) {
		if(currents.keySet().contains(customer.getName().toLowerCase()+customer.getFirstName().toLowerCase())) {
			currents.remove(customer.getName().toLowerCase()+customer.getFirstName().toLowerCase());
		}
	}
	
	public void createSavingAccount(double interest, HashMap<String, Customer> customers,HashMap<String, SavingAccount> saving) {
		CurrentAccount newAccount = new CurrentAccount(libelle, amount, overdraft, customers);
		saving.put(customers.getName().toLowerCase()+customers.getFirstName().toLowerCase(), newAccount);
	}
	
	public void removeSavingAccount(Customer customer, HashMap<String, SavingAccount> saving) {
		if(saving.keySet().contains(customer.getName().toLowerCase()+customer.getFirstName().toLowerCase())) {
			saving.remove(customer.getName().toLowerCase()+customer.getFirstName().toLowerCase());
		}
	}
	
	
	
	
	
}
