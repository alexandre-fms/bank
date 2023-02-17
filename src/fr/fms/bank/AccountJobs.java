package fr.fms.bank;

import java.util.ArrayList;

/**
 * 
 * @author ArenasA De-albuquerqueD ChevinA GuyauN
 *
 * Interface AccountJobs
 * Elle contient toutes les methodes qui devront être implémentées.
 */
public interface AccountJobs {
	
	/**
	 * Permet de créer un compte dans la banque.
	 * @param account
	 */
	public void addAccount(Account account);
	
	/**
	 * Associe un compte à un client.
	 * @param customer
	 * @param account
	 */
	public void addAccountToCustomer(Customer customer, Account account);

	/**
	 * Permet d'ajouter un nouveau client dans l'application.
	 * @param email
	 * @param lastName
	 * @param firstName
	 * @param isAdmin
	 */
	public void addCustomer(String email,String lastName,String firstName, boolean isAdmin);
	
	/**
	 * 
	 * @param id On doit lui fournir l'ID du compte à consulter.
	 * @return Retourne le compte correspondant à l'ID.
	 */
	public Account consult(int id);
	
	/**
	 * Permet de verser de l'argent.
	 * @param amount La somme à verser
	 * @param accountId L'id du compte sur lequel verser
	 */
	public void deposit(double amount, int accountId);
	
	/**
	 * 
	 * @return ArrayList<Account> Retourne un tableau dynamique contenant tous les comptes de la banque.
	 */
	public ArrayList<Account> listAccounts();
	
	/**
	 * Retourne la liste des opérations d'un compte en particulier.
	 * @param accountId
	 * @return ArrayList<Operation>
	 */
	public ArrayList<Operation> listOperations(int accountId);
	
	/**
	 * Permet de virer de l'argent d'un compte à un autre.
	 * @param amount La somme à virer
	 * @param accountFromId Le compte d'où part le virement.
	 * @param accountToId Le compte qsui reçoit le virement.
	 */
	public void transfer(double amount, int accountFromId, int accountToId);
	
	/**
	 * Permet de retirer de l'argent d'un compte
	 * @param amount
	 * @param accountId
	 */
	public void withdraw(double amount, int accountId);

}
