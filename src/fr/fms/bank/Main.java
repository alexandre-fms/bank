package fr.fms.bank;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entrez votre mot de passe client (ou entrez \"admin\" si vous êtes Admin) :");

		String password = scan.next();

		//on imagine une vérification du mot de passe

		AccountJobsImpl job = new AccountJobsImpl();

		System.out.println("Bonjour Jean Paul, vous êtes bien connecté.");
		System.out.println("Que souhaitez vous faire ?");

		System.out.println("1 - Consulter le solde d'un de mes comptes");
		System.out.println("2 - Déposer de l'argent sur un de mes comptes");
		System.out.println("3 - Retirer de l'argent d'un des comptes");
		System.out.println("4 - transférer de l'argent");
		
		

		switch (scan.nextInt()) {
		case 1:
			System.out.println("Sur quel compte souhaitez-vous effectuer un retrait ?");

			System.out.println("1 - Compte courant");
			System.out.println("2 - Compte épargne");
			//job.consult()
			break;

		case 2:
			System.out.println("Pas encore implémenté");
			break;

		case 3:
			System.out.println("Sur quel compte souhaitez-vous effectuer un retrait ?");

			System.out.println("1 - Compte courant");
			System.out.println("2 - Compte épargne");

			//job.withdraw
			break;

		case 4:
			System.out.println("Pas encore implémenté");
			break;

		default:
			break;
		}


		System.out.println("Sur quel compte ?");
		System.out.println("1 - Compte courant");
		System.out.println("2 - Compte épargne");

		//1

		System.out.println("Quel montant ?");

		//200

		//job.withdraw("compte courant", "200");


	}

}
