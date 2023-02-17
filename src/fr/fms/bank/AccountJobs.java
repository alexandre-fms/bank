package fr.fms.bank;

import java.util.ArrayList;
import java.util.Map;

public interface AccountJobs {

	public void addCustomer(String email,String lastName,String firstName, boolean isAdmin);
	public Account consult(int id);
	public void deposit(double amount, int accountId);
	public ArrayList<Account> listAccounts();
	public ArrayList<Operation> listOperations(int accountId);
	public void transfer(double amount, int accountFromId, int accountToId);
	public void withdraw(double amount, int accountId);

}
