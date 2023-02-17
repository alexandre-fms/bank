package fr.fms.bank;
import java.util.Scanner;
//TODO
/**
 * Programme d'une application bancaire, appelée CodeQuantumBank, permettant de gérer des comptes en ligne. Celle-ci gère 2 types d'utilisateurs : 
 * - un connecté qui peut réaliser des opérations de consultations sur son compte, de retrait, de versement ou de virement.
 * - un administrateur qui peut en plus de l’utilisateur, créer un ou plusieurs clients et plusieurs comptes pour celui-ci.
 * De plus, elle permet de gérer 2 types de comptes, un compte courant avec un découvert autorisé et un compte épargne avec un taux d'intérêt.
 * @author ChevinA,ArenasA, GuyauN, DeAlbuquerqueD.
 * @version 1.0
 */
public class Main {
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		appCodeQuantumBank();
		scan.close();
	}
/**Méthode proposant le menu principal de l'application. */
	public static void appCodeQuantumBank() {
		AccountJobsImpl job = new AccountJobsImpl();
		int choice = 0;		
		System.out.println("Bienvenue dans l'application de la banque CodeQuantum");
		System.out.println("Faites votre choix dans le menu, saisissez le chiffre correspondant :\n");
		
		while(choice != 3) {
			System.out.println("**********************************************************************");
			System.out.println("1 : Êtes-vous client");
			System.out.println("2 : Êtes-vous administrateur");
			System.out.println("3 : Quitter l'application");
			System.out.println("**********************************************************************");
			
			while(!scan.hasNextInt())	scan.next();
			choice = scan.nextInt();			
			switch(choice) {
				case 1 : menuCustomer();
						 break;
				
				case 2 : menuAdmin();
						 break;
				
				case 3 : System.out.println("Nous vous remercions de votre visite, à bientot.");
						 break;
				
				default : System.out.println("Nous n'avons pas compris votre choix");
			}			
		}			
	}
/** Méthode proposant le menu secondaire de l'application pour les clients de la banque. */
	public static void menuCustomer() {
		int choice = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Vous êtes client de notre Banque");
		System.out.println("Faites votre choix dans le menu, saisissez le chiffre correspondant :\n");
		
		while(choice != 5) {
			System.out.println("**********************************************************************");
			System.out.println("1 : Consulter vos comptes");
			System.out.println("2 : Faire un virement");
			System.out.println("3 : Retirer de l'argent");
			System.out.println("4 : Déposer de l'argent");
			System.out.println("5 : Revenir au menu principal");
			System.out.println("**********************************************************************");
			
			while(!scan.hasNextInt())	scan.next();
			choice = scan.nextInt();			
			switch(choice) {
				case 1 : 
						 break;
				
				case 2 : //transfert d'argent
						 break;
				case 3 : //retirer de l'argent
						break;
				case 4 : //Déposer de l'argent
						break;				
				case 5 : System.out.println("D'accord");
						 break;				
				default : System.out.println("Nous n'avons pas compris votre choix.");
			}			
		}			
	}
	/** Méthode proposant un menu secondaire de l'application pour les administrateurs de la banque. */
	public static void menuAdmin() {
		int choice = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Vous êtes administrateur de notre Banque");
		System.out.println("Faites votre choix dans le menu, saisissez le chiffre correspondant :\n");
		
		while(choice != 3) {
			System.out.println("**********************************************************************");
			System.out.println("1 : Créer un nouveau client");
			System.out.println("2 : Créer un compte pour un client existant");
			System.out.println("3 : Revenir au menu principal");
			System.out.println("**********************************************************************");
			
			while(!scan.hasNextInt())	scan.next();
			choice = scan.nextInt();			
			switch(choice) {
				case 1 : //Créer un nouveau client
						 break;
				
				case 2 : //Créer un compte pour un client existant
						 break;			
				case 3 : System.out.println("D'accord");
						 break;				
				default : System.out.println("Nous n'avons pas compris votre choix.");
			}			
		}			
	}
}
