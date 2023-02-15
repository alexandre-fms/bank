package fr.fms.bank;

public class Customer extends User{
	private String savingAccountId;
	private String currentAccountId;
	
	public Customer (String savingAccountId,String currentAccountId,String ID,String email,String lastName,String firstName,String adress){
		super(ID,email,lastName,firstName,adress);
		setSavingAccountId(savingAccountId);
		setCurrentAccountId(currentAccountId);
	
	}
	
	public String getSavingAccountId() {
		return savingAccountId;
	}

	public void setSavingAccountId(String savingAccountId) {
		this.savingAccountId = savingAccountId;
	}

	public String getCurrentAccountId() {
		return currentAccountId;
	}

	public void setCurrentAccountId(String currentAccountId) {
		this.currentAccountId = currentAccountId;
	}

	
	public boolean virement(String currentAccountId,String currentAccountId2,int amount) {
		return true;
	}
	public int retire(String currentAccountId,int amount) {
		return amount;
	}
	public int versement(String currentAccountId,int amount) {
		return amount;
	}

	@Override
	public String toString() {
		return "Customer [savingAccountId=" + savingAccountId + ", currentAccountId=" + currentAccountId + super.getLastName()+super.getFirstName()+"]";
	}
	
	}
