package com.jacob.defender;

import java.util.Random;
import java.util.Scanner;

import com.jacob.start.Main;

public class Defender {
	
	public void jeux() {
		
		char reponse = 'O';
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Mode Defender");
		
		System.out.println("********************");
		
		while(reponse == 'O' ) {
	
		
		System.out.print("Saisir la combinaison secrête: ");
		Scanner proposition = new Scanner(System.in);
		String choice = (String) proposition.nextLine();
		
		//Insertion des valeurs saisies par l'utilisateur dans un Tableau
		int valeur[] = {Integer.parseInt(choice.substring(0, 1)), Integer.parseInt(choice.substring(1, 2)), 
				Integer.parseInt(choice.substring(2, 3)), Integer.parseInt(choice.substring(3, 4))};
		
		//Génération des valeurs Random
		Random rand = new Random();
		
		int tableau[] = {rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10)};
		
		//Insertion des valeurs Random dans un Tableau
		System.out.println("\nProposition de l'Intelligence Artificielle: " + tableau[0] + tableau[1] +  tableau[2] + tableau[3]);
		
		//Comparaison des valeurs Random avec les valeurs saisies par l'utilisateur
		System.out.print("Votre réponse: ");
		
		//Récupération des valeurs saisi (+-/*)
		Scanner combinaisonSaisi = new Scanner(System.in);
		String combinaison = (String) combinaisonSaisi.nextLine();
		
		//Insertion des valeurs saisies par l'utilisateur dans un Tableau
		int valeur2[] = {combinaison.charAt(0), combinaison.charAt(1), combinaison.charAt(2), combinaison.charAt(3)};
		
		System.out.print("Autre proposition de l'I.A: ");
		
		for(int i = 0; i < valeur2.length; i++) {
			//Si valeur saisi est inférieur à valeur Random
			if(valeur2[i] == '-') {
				System.out.print("+");
			}else if (valeur2[i] == '=') {
				System.out.print("+");
			}else {
				System.out.print("-");
			}
		}
		System.out.println("\n\nVoulez-vous réessayer? (OUI/NON)");
		
		//On récupère la réponse de l'utilisateur
		reponse = sc.nextLine().charAt(0);
		
	}//Fin de la boucle
		//Retour au menu principal

	}
}
