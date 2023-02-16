package fr.fms.bank;

public class Customer {
	private String savingAccountId;
	private String currentAccountId;
	private String Id;
	private String lastName;
	private String firstName;
	private String adress;
	private String email;
	
	/**
	 * Creation du constructeur pour la class customer avec 
	 * lien a la classe mere User
	 * @param savingAccountId
	 * @param currentAccountId
	 * @param Id
	 * @param email
	 * @param lastName
	 * @param firstName
	 * @param adress
	 */
	public Customer (String savingAccountId,String currentAccountId,String Id,String email,String lastName,String firstName,String adress){
		//super(ID,email,lastName,firstName,adress);
		setSavingAccountId(savingAccountId);
		setCurrentAccountId(currentAccountId);
		setId(Id);
		setEmail(email);
		setLastName(lastName);
		setFirstName(firstName);
		setAdress(adress);
	
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

	public String getId() {
		return Id;		
	}
	public void setId(String Id) {
		this.Id = Id;
	}
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
		return "Customer [savingAccountId=" + savingAccountId + ", currentAccountId=" + currentAccountId + ", Id=" + Id
				+ ", lastName=" + lastName + ", firstName=" + firstName + ", adress=" + adress + ", email=" + email
				+ "]";
	}

	
	
	
	}
