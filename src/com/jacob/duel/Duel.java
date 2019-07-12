package com.jacob.duel;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.jacob.start.Main;

public class Duel {

	public static void main(String[] args) {
		char reponse = 'O';
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Mode Duel");
		
		System.out.println("********************");
		
//		while(reponse == 'O' ) {
	
		
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
		
		//Vérifier si les valeurs contenues dans les 2 tableaux sont correctes
		List<int[]> list1 = Arrays.asList(tableau);
		List<int[]> list2 = Arrays.asList(valeur);
		for (int[] str : list1) {
		    if(list2.contains(str)){ System.out.println("Félicitation! Vous avez trouvé la combinaison secrête!");}
		else{System.out.println("L'I.A n'a pas réussit à trouver votre combinaison");}
		}
		
		System.out.println("\n");
		
		
		
		//Comparaison des valeurs Random avec les valeurs saisies par l'utilisateur
		System.out.print("A votre tour de jouer: ");
		
		//Récupération des valeurs saisi (+-/*)
		Scanner combinaisonSaisi = new Scanner(System.in);
		String combinaison = (String) combinaisonSaisi.nextLine();
		
		//Insertion des valeurs saisies par l'utilisateur dans un Tableau
		int valeur2[] = {combinaison.charAt(0), combinaison.charAt(1), combinaison.charAt(2), combinaison.charAt(3)};

//		System.out.println("\n\nVoulez-vous réessayer? (OUI/NON)");
//		
//		//On récupère la réponse de l'utilisateur
//		reponse = sc.nextLine().charAt(0);
//		
//	} Fin de la boucle while
		
		//Retour au menu principal
		Main retour = new Main();
		retour.main(args);

	}

}
