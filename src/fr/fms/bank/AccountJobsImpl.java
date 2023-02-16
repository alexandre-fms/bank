package fr.fms.bank;

import java.util.HashMap;
import java.util.Map;

public class AccountJobsImpl implements AccountJobs {
	//bdd
	Map<Integer, Operation> operationHistory = new HashMap<>();
	Map<Integer, Account> accounts = new HashMap<>();
	
	@Override
	public String consult(Account account){
		return account.toString();
	};
	
	@Override
	public void withdraw(double amount, Account account) {
		Withdraw wd = new Withdraw(amount);
		operationHistory.put(wd.getId(), wd);
		accounts.get(account.getID()).setCurrentAmount(amount);
	};
	
	@Override
	public void transfer(double amount, Account accountFrom, Account accountTo){
		Transfer tf = new Transfer(amount);
		operationHistory.put(tf.getId(), tf);
		accounts.get(accountFrom.getID()).setCurrentAmount(-amount);
		accounts.get(accountTo.getID()).setCurrentAmount(amount);
	};
	
	@Override
	public void deposit(double amount, Account account){
		Deposit dp = new Deposit(amount);
		operationHistory.put(dp.getId(), dp);
		accounts.get(account.getID()).setCurrentAmount(amount);
	};
}
