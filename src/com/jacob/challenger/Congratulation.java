package com.jacob.challenger;

import java.util.Scanner;

import com.jacob.start.End;
import com.jacob.start.Main;

public class Congratulation {
	
	public void Felicitation() {
		System.out.println("\nF�licitation! Vous avez trouv� la combinaison secr�te!\n");
		System.out.println("Que souhaiteriez-vous faire?");
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
	}
}
