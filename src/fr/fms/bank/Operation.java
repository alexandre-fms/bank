package fr.fms.bank;
import java.util.Date;
/**
 * La Classe Operation est la classe mère abstraite des classes Transfer, Withdraw, Deposit.
 * Elle contient 4 attributs : id, somme, date du jour.
 * @author ChevinA, ArenasA, GuyauN, DeAlbuquerqueD
 * @version 1.0
 */


public abstract class Operation {
	private int id;
	private double amount;
	private Date date;
	private static int counter = 0;
/**
 * Constructeur de opération, le compteur du constructeur est incrémentée à chaque fois qu'une classe fille de opération sera instanciée,
 * il correspond à l'id de l'opération.
 * @param amount double 
 */
	public Operation(double amount) {
		counter++; 
		setId(counter);
		this.amount = amount;
		this.date = new Date();
		
	}
/**
 * Méthode qui permet l'accés à l'attribut correspondant au compteur de l'opération.
 * @return counter int
 */
	static int getCounter() {
		return counter;
	}
/**
 * Méthode qui permet l'accés à l'attribut correspondant à l'id de l'opération.
 * @return id l'id de l'opération.
 */
	public int getId() {
		return id;
	}
/**
 * Méthode qui permet de modifier l'id de l'opération.
 * @param id int
 */
	public void setId(int id) {
		this.id = id;
	}
/**
 * Méthode qui permet l'accés à l'attribut correspondant à la somme de l'opération.
* @return amount la somme de l'opération
*/
	public double getAmount() {
		return amount;
	}
/**
 * Méthode qui permet de modifier la somme. 
 * @param amount double
 */
	public void setAmount(double amount) {
		this.amount = amount;
	}
/**
 * Méthode qui permet l'accés à l'attribut correspondant à la date de l'opération.
 * @return date Date
 */
	public Date getDate() {
		return date;
	}
/**
 * Méthode toString redéfinie
 * @return String La chaîne de caractère correspondant aux attributs amount et date de l'opération.
 */
	@Override
	public String toString() {
		return "[amount=" + amount +", "+"date=" + date +"]";
	}
	
	
}
