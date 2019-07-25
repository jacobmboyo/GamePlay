package com.jacob.challenger;


import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.jacob.defender.Defender;
import com.jacob.duel.Duel;
import com.jacob.start.End;
import com.jacob.start.Main;

public class Challenger {
	
	public void jeux() {
		final int NOMBRE_ESSAI = 5;
		char reponse = 'O';
		Random rand = new Random();
		
		//G�n�ration des valeurs de l'IA
		int valeurRandomIA[] = {rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10)};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Mode Challenger");
		
		System.out.println("********************");
		
		//Initialisation du nombre de d�but d'essai �: 1
		int e = 1;

		//Boucle nombre d'essai
		for(int j = 0 ; j < NOMBRE_ESSAI ; j++) {
		int nbreEssai = j+e;
		
		System.out.println("\n\nNombre d'essai: " + nbreEssai + "/" + NOMBRE_ESSAI);
		System.out.print("Votre Proposition: ");

		
		Scanner proposition = new Scanner(System.in);
		String choice = (String) proposition.nextLine();
		//Insertion des valeurs saisi par l'User dans valeur[]
		int valeurSaisiparUser[] = {Integer.parseInt(choice.substring(0, 1)), Integer.parseInt(choice.substring(1, 2)), 
				Integer.parseInt(choice.substring(2, 3)), Integer.parseInt(choice.substring(3, 4))};
		//String tableau[] = {choice};


		//Affichage de la combinaison ser�te
		//System.out.println("Combinaison secr�te: " + valeurRandomIA[0] + valeurRandomIA[1] +  valeurRandomIA[2] + valeurRandomIA[3]);
		
		System.out.print("R�ponse: ");
		for(int i = 0; i <valeurRandomIA.length; i++) {
			//Si valeur saisi est inf�rieur � valeur Random
			if(valeurRandomIA[i] == valeurSaisiparUser[i]) {
				System.out.print("=");
			}else if (valeurRandomIA[i] > valeurSaisiparUser[i]) {
				System.out.print("-");
			}else {
				System.out.print("+");
			}
		}		

		//V�rifier si la taille ainsi que le contenu des tableaux sont �gaux ou diff�rents 
		if(valeurRandomIA == null || valeurSaisiparUser == null || valeurRandomIA.length != valeurSaisiparUser.length) {
			System.out.println("Diff�rent");
		}else {
			int i = 0;
			while(i < valeurRandomIA.length && valeurRandomIA[i] == valeurSaisiparUser[i]) {
				i++;
				
			}
			
			if( i >= valeurRandomIA.length) {
				Congratulation win = new Congratulation();
				win.Felicitation();
			
			}
		}
		

//		System.out.println("\n\nESSAI " + e + "/" + NOMBRE_ESSAI);
//		//On demande si la personne veut faire une autre essai
//		System.out.println("Voulez-vous r�essayer? (OUI/NON)");
//		
//		//On r�cup�re la r�ponse de l'utilisateur
//		reponse = sc.nextLine().charAt(0);
		
//		}

	}
		//Retour au menu principal
		System.out.println("\n\nGAME OVER!\nVous avez perdu!\nLa combinaison secr�te �tait: " + valeurRandomIA[0] + valeurRandomIA[1] +  valeurRandomIA[2] + valeurRandomIA[3]);
		System.out.println("\nQue souhaiteriez-vous faire?");
		System.out.println("1= Rejouer au m�me mode\n2= Changer de mode\n3= Quitter");
		Scanner decisionJoueur = new Scanner (System.in);
		int leJoueur = decisionJoueur.nextInt();
		
		switch(leJoueur){
		case 1:
			Challenger challenge = new Challenger();
			challenge.jeux();
			break;
		case 2:
			Main menu = new Main();
			menu.main(null);
			break;
		case 3:
			End exit = new End();
			exit.EndGame();
			break;
		default:
			System.out.println("D�sol�, Vous devriez saisir un chiffre comme 1, 2 ou 3\"");
	}
//		new Main();
	}

	

}
