package fr.fms.bank;
/**La class User représente un utilisateur qui sera la classe mère de 2 types d'utilisateurs : client et admin
 * Elle contient les attributs : ID, password, email, lastName, firstName et adress.
 * Un constructeur prenant en paramètre tous les attributs
 * 
 * @author ChevinA 2023
 *
 */
public class User {
	private String id;
	private String lastName;
	private String firstName;
	private String adress;
	private String email;
//	private String password;
/**
 * Un constructeur qui prendra en paramètres tous les attributs de la classe	
 * @param id
 * @param lastName
 * @param firstName
 * @param adress
 * @param email
 */
	public User(String id, String lastName, String firstName, String adress, String email) {
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.adress = adress;
		this.email = email;
//		this.password = password;
	}
	
/**
* Méthode toString() redéfinie, elle permet d'afficher les attributs de la classe utilisateur.
*/
		@Override
		public String toString() {
			return id+ ", " +lastName + ", " + firstName + ", " + adress
					+ ", " + email;
		}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}	
}
