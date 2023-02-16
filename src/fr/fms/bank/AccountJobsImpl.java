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

		if (accounts.get(account.getID()) == null)
			accounts.put(account.getID(), account);

		accounts.get(account.getID()).removeMoney(amount);
	};

	@Override
	public void transfer(double amount, Account accountFrom, Account accountTo){
		
		if (accountFrom.equals(accountTo)) {
			System.out.println("vous ne pouvez retirer et verser sur le même compte !");
		} else {
			Transfer tf = new Transfer(amount);
			operationHistory.put(tf.getId(), tf);
			
			if (accounts.get(accountFrom.getID()) == null)
				accounts.put(accountFrom.getID(), accountFrom);
			
			if (accounts.get(accountTo.getID()) == null)
				accounts.put(accountTo.getID(), accountTo);
			
			accounts.get(accountFrom.getID()).removeMoney(amount);
			accounts.get(accountTo.getID()).addMoney(amount);
		}
		
		
	};

	@Override
	public void deposit(double amount, Account account){
		Deposit dp = new Deposit(amount);
		operationHistory.put(dp.getId(), dp);
		
		if (accounts.get(account.getID()) == null)
			accounts.put(account.getID(), account);

		accounts.get(account.getID()).setCurrentAmount(amount);
	};

	@Override
	public double displayTotalBalance(Customer customer) {
		return 2.2;
	};
	
	@Override
	public String displayAllBankAccounts() {
		String formattedString = "";
		for (Map.Entry<Integer, Account> entry : accounts.entrySet()) {
			formattedString += entry.getValue() + "\n";
		}
		return formattedString;
	};
}
