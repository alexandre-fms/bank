package fr.fms.bank;

import java.util.HashMap;
import java.util.Map;

public class AccountJobsImpl implements AccountJobs {
	//bdd
	Map<String, Operation> operationHistory = new HashMap<>();
	Map<String, Account> accounts = new HashMap<>();
	
	@Override
	public String consult(Account account){
		return account;
	};
	
	@Override
	public void withdraw(double amount, Account account) {
		Withdraw wd = new Withdraw(amount, account);
		operationHistory.set(Withdraw.counter, wd);
		accounts.get(account.getID()).setCurrentAmount(amount);
	};
	
	@Override
	public void transfer(double amount, Account accountFrom, Account accountTo){
		Transfer tf = new Transfer(amount, accountFrom, accountTo);
		operationHistory.set(Transfer.counter, tf);
		accounts.get(accountFrom.getID()).setCurrentAmount(-amount);
		accounts.get(accountTo.getID()).setCurrentAmount(amount);
	};
	
	@Override
	public void deposit(double amount, Account account){
		Deposit dp = new Deposit(amount, account);
		operationHistory.set(Deposit.counter, dp);
		accounts.get(account.getID()).setCurrentAmount(amount);
	};
}
