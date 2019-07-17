package com.jacob.challenger;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.jacob.start.Main;

public class Challenger {
	
	public void jeux() {
		final int NOMBRE_ESSAI = 3;
		char reponse = 'O';
		Random rand = new Random();
		
		//insertion des valeurs Random dans un tableau
		int tableau[] = {rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10)};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Mode Challenger");
		
		System.out.println("********************");
		
		//Boucle nombre d'essai
		for(int j = 0 ; j < NOMBRE_ESSAI ; j++) {
		
			while(reponse == 'O' || reponse == 'o' ) {
			
		
		//Affichage des valeurs Random
		//System.out.println("Combinaison secr�te: " + tableau[0] + tableau[1] +  tableau[2] + tableau[3]);
		
		System.out.print("Votre Proposition: ");
///		
//En r�alit�, c'est l'User qui fait sa proposition en premier 
//ensuite l'IA, la proposition de l'IA doit �tre approximatif
///		
		Scanner proposition = new Scanner(System.in);
		String choice = (String) proposition.nextLine();
		//String tableau[] = {choice};
		
		//Integer.parseInt(choice.substring(0, 1));
		
		//Insertion des valeurs saisies par l'utilisateur dans un Tableau
		int valeur[] = {Integer.parseInt(choice.substring(0, 1)), Integer.parseInt(choice.substring(1, 2)), 
				Integer.parseInt(choice.substring(2, 3)), Integer.parseInt(choice.substring(3, 4))};

		System.out.print("R�ponse: ");
		for(int i = 0; i <tableau.length; i++) {
			//Si valeur saisi est inf�rieur � valeur Random
			if(tableau[i] == valeur[i]) {
				System.out.print("=");
			}else if (tableau[i] > valeur[i]) {
				System.out.print("-");
			}else {
				System.out.print("+");
			}
		}		

//		//V�rifier si la taille ainsi que le contenu des tableaux sont �gaux ou diff�rents 
//		if(tableau == null || valeur == null || tableau.length != valeur.length) {
//			System.out.println("Diff�rent");
//		}else {
//			int i = 0;
//			while(i < tableau.length && tableau[i] == valeur[i]) {
//				i++;
//				
//			}
//			
//			if( i >= tableau.length) {
//				System.out.println("F�licitation! Vous avez trouv� la combinaison secr�te!");
//			}else {
//				System.out.println("D�sol�, la combinaison exacte �tait: " + tableau[0] + tableau[1] +  tableau[2] + tableau[3]);
//			}
//		}
		
		//Afficher le nombre d'essai
		int e = 0;
		e++;
		System.out.println("\n\nESSAI " + e + "/" + NOMBRE_ESSAI);
		//On demande si la personne veut faire une autre essai
		System.out.println("Voulez-vous r�essayer? (OUI/NON)");
		
		//On r�cup�re la r�ponse de l'utilisateur
		reponse = sc.nextLine().charAt(0);
		
//		}
		} //fin boucle while OUI/NON
	}
		//Retour au menu principal
//		System.out.println("Souhaiteriez-vous:\n1 = Rejouer au m�me mode\n2 = Jouer une autre mode\n3 = Quitter l'application");
//		new Main();
	}

	

}
