package fr.fms.bank;

import java.util.ArrayList;
import java.util.Date;

/**
 * 
 * @author ArenasA De-albuquerqueD ChevinA GuyauN
 *
 * Classe abstraite Account
 * Elle permet d'en faire dériver 2 classes enfants: SavingAccount et CurrentAccount.
 */
public abstract class Account {
	private static int counter=0;
	private double currentAmount;
	private ArrayList<Operation> listOperations;
	private int ID;
	private Date date;
	private Customer customer;
	//	private String label;

	/**
	 * 
	 * @param customer
	 * Constructeur de Account qui prend en paramètre le client à qui appartient le Account.
	 */
	public Account(Customer customer) {
		counter++;
		setID(counter);
		setCurrentAmount(0);
		this.date = new Date();
		setCustomer(customer);
	}
	
	/**
	 * Permet d'ajouter de l'argent sur le compte.
	 * @param amount permet d'ajouter au montant actuel.
	 */
	public void addMoney(double amount) {
		this.currentAmount += amount;
	};

	/**
	 * 
	 * @return affiche le montant dispo sur le compte sous forme de double
	 */
	public double displayAvailableAmount() {
		return this.currentAmount;
	}

	/**
	 * 
	 * @return Retourne un double avec le montant disponible sur le compte.
	 */
	public double getCurrentAmount() {
		return currentAmount;
	}

	/**
	 * 
	 * @return Customer, retourne le client possédant ce compte.
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * 
	 * @return l'ID du compte sous forme de int.
	 */
	public int getID() {
		return ID;
	}

	/**
	 * 
	 * @return ArrayList<Operation> Retourne un tableau dynamique avec l'ensemble des opérations réalisées pour ce compte.
	 */
	public ArrayList<Operation> getListOperations() {
		return listOperations;
	}

	/**
	 * 
	 * @param amount
	 * permet de retirer au montant actuel 
	 */
	public void removeMoney(double amount) {

	}

	/**
	 * 
	 * @param currentAmount modifie le montant dispo par un nouveau montant.
	 */
	public void setCurrentAmount(double currentAmount) {
		this.currentAmount = currentAmount;		
	}

	/**
	 * 
	 * @param customer2
	 * Permet de modifier le client auquel appartient ce compte.
	 */
	private void setCustomer(Customer customer2) {
		this.customer = customer2;

	}

	/**
	 * 
	 * @param id Prend le nouvel ID à attribuer au compte.
	 */
	protected void setID(int id) {
		this.ID = id;
	}

	/**
	 * 
	 * @param listOperations
	 * Methode qui permet de remplacer l'actuelle liste des opérations par une nouvelle liste mise à jour.
	 */
	public void setListOperations(ArrayList<Operation> listOperations) {
		this.listOperations = listOperations;
	}

	/**
	 * Retourne tous les attributs du compte sous forme de String
	 */
	@Override
	public String toString() {
		return "[ID=" + ID + ", creation date=" + date + ", balance= " + currentAmount + " , "  + customer.toString() + "]";
	}


}