package fr.fms.bank;

import java.util.ArrayList;

public class TestAffichage {
public static void main(String[] args) {
	AccountJobsImpl job = new AccountJobsImpl();
	
	
	System.out.println("création puis affichage de 2 comptes bancaires");
	
	
	Customer customer1 = new Customer("dupont@gmail.com", "Dupont", "Robert", false);
	Customer customer2 = new Customer("jolie@gmail.com", "Jolie", "Julie", false);
	
	job.addCustomer("dupont@gmail.com", "Dupont", "Robert", false);
	job.addCustomer("jolie@gmail.com", "Jolie", "Julie", false);
	
	Account curAcc1 = new CurrentAccount(200, customer1);
	Account savAcc1 = new SavingAccount(5.5, customer2);
	Account curAcc2 = new CurrentAccount(150, customer2);
	
	
	job.addAccount(curAcc1);
	job.addAccount(savAcc1);
	job.addAccount(curAcc2);
	
	curAcc1.setCurrentAmount(1550);
	savAcc1.setCurrentAmount(2800);
	
	System.out.println(curAcc1);
	System.out.println(savAcc1);
	
	System.out.println("\n----------------------------------------------------------\n");
	
	System.out.println("Solde de "+ curAcc1.getCustomer().getLastName() +": " + curAcc1.getCurrentAmount());
	System.out.println("Solde de "+ savAcc1.getCustomer().getLastName() +": " + savAcc1.getCurrentAmount());
	
	System.out.println("\n----------------------------------------------------------\n");
	
	job.consult(646546);
	job.withdraw(54235022, curAcc1.getID());
	job.transfer(3554, curAcc1.getID(), curAcc1.getID());
	
	System.out.println("\n----------------------------Liste des comptes de ma banque------------------------------\n");
	
	ArrayList<Account> allBankAccounts = job.listAccounts();
	
	for (Account account : allBankAccounts) {
		System.out.println(account);
	}
	
	System.out.println("\n----------------------------Liste des comptes de Julie------------------------------\n");
	
	ArrayList<Customer> allBankCustomers = job.listCustomers();
	
	int idOfJulie = 3;
	
	Customer foundCorrespondingCustomer = null;
	
	for (Customer customer : allBankCustomers) {
		if (customer.getId() == idOfJulie) {
			foundCorrespondingCustomer = customer;
			break;
		}
	}
	
	if (foundCorrespondingCustomer != null)
		for (Account account : foundCorrespondingCustomer.getListAccounts()) {
			System.out.println(account);
		}
	else System.out.println("Aucun client avec cet ID trouvé!");
	
	
	System.out.println("\n----------------------------Liste des transaction de l'unique compte de Robert------------------------------\n");
	
	job.withdraw(2, curAcc1.getID());
	job.deposit(68, curAcc1.getID());
	job.withdraw(14, curAcc1.getID());
	
	for (Operation operation : customer1.getListAccounts().get(0).getListOperations()) {
		System.out.println(operation);
	}
	
	System.out.println("\n----------------------------Liste des transactions du compte N°3 de Julie------------------------------\n");
	
	//operations sur le compte courant de julie avec ID "3"
	job.withdraw(10, curAcc2.getID());
	job.deposit(500, curAcc2.getID());
	job.withdraw(400, curAcc2.getID());
	
	ArrayList<Account> listAccountsJulie = customer2.getListAccounts();
	int idOfCurrentAccountOfJulie = 3;
	
	Account searchedAccount = null;
	
	for (Account account : listAccountsJulie) {
		if (account.getID() == idOfCurrentAccountOfJulie) {
			searchedAccount = account;
			break;
		}
	}
	
	if (searchedAccount != null)
		for (Operation operation : searchedAccount.getListOperations()) {
			System.out.println(operation);
		}
	else System.out.println("Aucun compte avec cet ID trouvé!");
	
	
}
}
