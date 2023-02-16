package fr.fms.bank;

import java.util.Map;

public interface AccountJobs {
	
	public void transfer(double amount, Account accountFrom, Account accountTo);
	public String consult(Account account);
	public void deposit(double amount, Account account);
	
	public void withdraw(double amount, Account account);
	
	public double displayTotalBalance(Customer customer);
	
	public String displayAllBankAccounts();
}
