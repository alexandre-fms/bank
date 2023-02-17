package fr.fms.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AccountJobsImpl implements AccountJobs {
	
	private Map<Integer, Operation> operationHistory;
	private Map<Integer, Account> accounts;
	private Map<Integer,Customer> customers;


	public AccountJobsImpl() {
		accounts = new HashMap<Integer,Account>();		
		customers = new HashMap<Integer,Customer>();
		Customer customer = new Customer("first@admin.com", "First", "Admin", true);
		customers.put(customer.getId(), customer);
	}
	
	
	public void addCustomer(String email,String lastName,String firstName, boolean isAdmin) {
		Customer customer = new Customer(email, lastName, firstName, isAdmin); 	
		customers.put(customer.getId(), customer);
	}

	public void addAccount(Account account) {
		accounts.put(account.getID(), account);	
		Customer customer = account.getCustomer(); 	
		customers.put(customer.getId(), customer);
		addAccountToCustomer(customer, account);
	}

	private void addAccountToCustomer(Customer customer, Account account) {
		boolean exist = false;
		for(Account acc : customer.getListAccounts()) {
			if(acc.getID() == account.getID()) {
				exist = true;
				break;
			}
		}
		if(exist == false)	customer.getListAccounts().add(account);
	}

	@Override
	public Account consult(int id){
		Account account = accounts.get(id);
		if(account == null)	System.out.println("Vous demandez un compte inexistant !");
		return account;
	};

	@Override
	public void deposit(double amount, int accountId){

		Account account = consult(accountId);

		Deposit dp = new Deposit(amount);
		operationHistory.put(dp.getId(), dp);

		if (accounts.get(account.getID()) == null)
			accounts.put(account.getID(), account);

		accounts.get(account.getID()).addMoney(amount);

		account.getListOperations().add(dp);
	};

	@Override
	public ArrayList<Account> listAccounts() {		
		return new ArrayList<Account> (accounts.values());
	};

	@Override
	public ArrayList<Operation> listOperations(int accountId) {
		return consult(accountId).getListOperations();
	};

	@Override
	public void transfer(double amount, int accountFromId, int accountToId){

		if (accountFromId == accountToId) {
			System.out.println("vous ne pouvez retirer et verser sur le même compte !");
		} else {
			Account accountFrom = consult(accountFromId);
			Account accountTo = consult(accountToId);
			Transfer tf = new Transfer(amount);
			operationHistory.put(tf.getId(), tf);

			if (accounts.get(accountFrom.getID()) == null)
				accounts.put(accountFrom.getID(), accountFrom);

			if (accounts.get(accountTo.getID()) == null)
				accounts.put(accountTo.getID(), accountTo);

			accounts.get(accountFrom.getID()).removeMoney(amount);
			accounts.get(accountTo.getID()).addMoney(amount);
		}

	}
	@Override
	public void withdraw(double amount, int accountId) {
		Account account = consult(accountId);
		Withdraw wd = new Withdraw(amount);
		operationHistory.put(wd.getId(), wd);

		if (accounts.get(account.getID()) == null)
			accounts.put(account.getID(), account);

		accounts.get(account.getID()).removeMoney(amount);

		account.getListOperations().add(wd);
	}




}
