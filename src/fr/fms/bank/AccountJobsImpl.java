package fr.fms.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author ArenasA De-albuquerqueD ChevinA GuyauN
 *
 * Implémentation de l'interface AccountJobs
 * Elle contient toutes les methodes qui seront disponibles dans notre application.
 */
public class AccountJobsImpl implements AccountJobs {
	
	private Map<Integer, Operation> operationHistory;
	private Map<Integer, Account> accounts;
	private Map<Integer,Customer> customers;

/**
 * Constructeur de AccountJobsImpl
 */
	public AccountJobsImpl() {
		accounts = new HashMap<Integer,Account>();		
		customers = new HashMap<Integer,Customer>();
		operationHistory = new HashMap<Integer,Operation>();
		Customer customer = new Customer("first@admin.com", "First", "Admin", true);
		customers.put(customer.getId(), customer);
	}
	
	/**
	 * Permet de créer un compte dans la banque.
	 * @param account
	 */
	@Override
	public void addAccount(Account account) {
		accounts.put(account.getID(), account);	
		Customer customer = account.getCustomer(); 	
		if (customers.get(account.getCustomer().getId()) == null) {
			customers.put(customer.getId(), customer);
		}
			
		addAccountToCustomer(customer, account);
	}

	/**
	 * Associe un compte à un client.
	 * @param customer
	 * @param account
	 */
	@Override
	public void addAccountToCustomer(Customer customer, Account account) {
		boolean exist = false;
		for(Account acc : customer.getListAccounts()) {
			if(acc.getID() == account.getID()) {
				exist = true;
				break;
			}
		}
		if(exist == false)	{
			customer.getListAccounts().add(account);
		}
	}

	/**
	 * Permet d'ajouter un nouveau client dans l'application.
	 * @param email
	 * @param lastName
	 * @param firstName
	 * @param isAdmin
	 */
	@Override
	public void addCustomer(String email,String lastName,String firstName, boolean isAdmin) {
		Customer customer = new Customer(email, lastName, firstName, isAdmin); 	
		customers.put(customer.getId(), customer);
	}

	/**
	 * 
	 * @param id On doit lui fournir l'ID du compte à consulter.
	 * @return Retourne le compte correspondant à l'ID.
	 */
	@Override
	public Account consult(int id){
		Account account = accounts.get(id);
		if(account == null)	System.out.println("Vous demandez un compte inexistant !");
		return account;
	};

	
	/**
	 * Permet de verser de l'argent.
	 * @param amount La somme à verser
	 * @param accountId L'id du compte sur lequel verser
	 */
	@Override
	public void deposit(double amount, int accountId){

		Account account = consult(accountId);

		Deposit dp = new Deposit(amount , accountId);
		operationHistory.put(dp.getId(), dp);

		if (accounts.get(account.getID()) == null)
			accounts.put(account.getID(), account);

		accounts.get(account.getID()).addMoney(amount);

		account.getListOperations().add(dp);
	};

	/**
	 * 
	 * @return ArrayList<Account> Retourne un tableau dynamique contenant tous les comptes de la banque.
	 */
	@Override
	public ArrayList<Account> listAccounts() {		
		return new ArrayList<Account> (accounts.values());
	};
	
	/**
	 * 
	 * @return ArrayList<Customer> Retourne un tableau dynamique contenant tous les clients de la banque.
	 */
	@Override
	public ArrayList<Customer> listCustomers() {		
		return new ArrayList<Customer> (customers.values());
	};

	/**
	 * Retourne la liste des opérations d'un compte en particulier.
	 * @param accountId
	 * @return ArrayList<Operation>
	 */
	@Override
	public ArrayList<Operation> listOperations(int accountId) {
		return consult(accountId).getListOperations();
	};

	/**
	 * Permet de virer de l'argent d'un compte à un autre.
	 * @param amount La somme à virer
	 * @param accountFromId Le compte d'où part le virement.
	 * @param accountToId Le compte qsui reçoit le virement.
	 */
	@Override
	public void transfer(double amount, int accountFromId, int accountToId){

		if (accountFromId == accountToId) {
			System.out.println("vous ne pouvez retirer et verser sur le même compte !");
		} else {
			Account accountFrom = consult(accountFromId);
			Account accountTo = consult(accountToId);
			Transfer tf = new Transfer(amount, accountFromId);
			operationHistory.put(tf.getId(), tf);

			if (accounts.get(accountFrom.getID()) == null)
				accounts.put(accountFrom.getID(), accountFrom);

			if (accounts.get(accountTo.getID()) == null)
				accounts.put(accountTo.getID(), accountTo);

			accounts.get(accountFrom.getID()).removeMoney(amount);
			accounts.get(accountTo.getID()).addMoney(amount);
		}

	}
	
	/**
	 * Permet de retirer de l'argent d'un compte
	 * @param amount
	 * @param accountId
	 */
	@Override
	public void withdraw(double amount, int accountId) {
		Account account = consult(accountId);
		Withdraw wd = new Withdraw(amount, accountId);
		

		if (accounts.get(account.getID()) == null)
			accounts.put(account.getID(), account);

		if (accounts.get(account.getID()).removeMoney(amount)) {
			account.getListOperations().add(wd);
			operationHistory.put(wd.getId(), wd);
		}
			
	}




}
