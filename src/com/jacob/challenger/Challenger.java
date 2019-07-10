package com.jacob.challenger;

import java.util.Random;
import java.util.Scanner;

import com.jacob.start.Main;

public class Challenger {
	
	
	public static void main(String[] args) {
		final int NOMBRE_ESSAI = 3;
		char reponse = 'O';
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Mode Challenger");
		
		System.out.println("********************");
		
		//Boucle nombre d'essai
		for(int j = 0 ; j < NOMBRE_ESSAI ; j++) {
		while(reponse == 'O' ) {
			Random rand = new Random();
			
			int tableau[] = {rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10)};
			
		//Insertion des valeurs Random dans un Tableau
		System.out.println("Combinaison secrête: " + tableau[0] + tableau[1] +  tableau[2] + tableau[3]);
		
		System.out.print("Votre Proposition: ");
		
		Scanner proposition = new Scanner(System.in);
		String choice = (String) proposition.nextLine();
		//String tableau[] = {choice};
		
		//Integer.parseInt(choice.substring(0, 1));
		
		//Insertion des valeurs saisies par l'utilisateur dans un Tableau
		int valeur[] = {Integer.parseInt(choice.substring(0, 1)), Integer.parseInt(choice.substring(1, 2)), 
				Integer.parseInt(choice.substring(2, 3)), Integer.parseInt(choice.substring(3, 4))};
		
		//Comparaison des valeurs Random avec les valeurs saisies par l'utilisateur
		System.out.print("Réponse: ");
		for(int i = 0; i < valeur.length; i++) {
			
			if(tableau[i] < valeur[i]) {
				System.out.print("+");
			}else if (tableau[i] == valeur[i]) {
				System.out.print("=");
			}else {
				System.out.print("-");
			}
		}
		
		//Tant que la réponse n'est pas O ou N, on repose la question
		
//		while(reponse != 'O' && reponse != 'N')
//		{
		//On demande si la personne veut faire une autre essai
		System.out.println("\n\nVoulez-vous réessayer? (OUI/NON)");
		
		//On récupère la réponse de l'utilisateur
		reponse = sc.nextLine().charAt(0);
		
		}
		}
//	}
		//Retour au menu principal
		Main retour = new Main();
		retour.main(args);
		

	}

}
