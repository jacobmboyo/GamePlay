package com.jacob.duel;

import java.util.Random;
import java.util.Scanner;

public class CapitalGame {

	public static void main(String[] args) {
		final int NOMBRE_OF_QUESTION = 7;
		int index;
		
		String[][] data = {
				{"Sénégal", "Dakar"},
				{"France", "Paris"},
				{"Nigéria", "Lagos"},
				{"Sénégal", "Dakar"},
				{"Allemagne", "Berlin"},
				{"Italie", "Rome"},
				{"Monaco", "Monaco"},
				{"Liberia", "Monrovia"},
				{"Perou", "Lima"},
		};
		
		Scanner clavier = new Scanner(System.in);
		//Répéter l'action n fois
		for(int i=0; i < NOMBRE_OF_QUESTION; i++) {
			//Choisir le pays de manière aléatoire
			Random random = new Random();
			index = random.nextInt(data.length);
			
			//Demander à l'utilisateur d'entrer la capital de ce pays
			//On compare les réponses
			//On affiche notre résultat
		}

	}

}
