package com.jacob.duel;

import java.util.Scanner;

public class ToDelete {

	public static void main(String[] args) {
		// Une variable vide
		String prenom;
		
		//On initialise celle-ci � O pour OUI
		char reponse = 'O';
		
		//Notre objet Scanner, n'oublie pas l'import de java.util.Scanner
		Scanner sc = new Scanner(System.in);
		
		//Tant que la r�ponse donn�e est �gale � OUI
		while(reponse == 'O') {
			//On affiche une instruction
			System.out.print("Donnez un pr�nom: ");
			
			//On r�cup�re le pr�nom saisi
			prenom = sc.nextLine();
			
			//On affiche notre phrase avec le pr�nom
			System.out.println("Bonjour " + prenom + ", comment vas-tu?");
			
			//Tant que la r�ponse n'est pas O ou N, on repose la question
			while(reponse != 'O' && reponse != 'N')
			{
			//On demande si la personne veut faire une autre essai
			System.out.println("Voulez-vous r�essayer? (OUI/NON)");
			
			//On r�cup�re la r�ponse de l'utilisateur
			reponse = sc.nextLine().charAt(0);
			}
		}
		System.out.println("Aurevoir...");
		//Fin de la boucle

	}

}
