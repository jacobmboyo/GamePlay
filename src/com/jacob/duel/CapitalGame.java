package com.jacob.duel;

import java.util.Random;
import java.util.Scanner;

public class CapitalGame {

	public static void main(String[] args) {
		final int NOMBRE_OF_QUESTION = 7;
		int index;
		
		String[][] data = {
				{"S�n�gal", "Dakar"},
				{"France", "Paris"},
				{"Nig�ria", "Lagos"},
				{"S�n�gal", "Dakar"},
				{"Allemagne", "Berlin"},
				{"Italie", "Rome"},
				{"Monaco", "Monaco"},
				{"Liberia", "Monrovia"},
				{"Perou", "Lima"},
		};
		
		Scanner clavier = new Scanner(System.in);
		//R�p�ter l'action n fois
		for(int i=0; i < NOMBRE_OF_QUESTION; i++) {
			//Choisir le pays de mani�re al�atoire
			Random random = new Random();
			index = random.nextInt(data.length);
			
			//Demander � l'utilisateur d'entrer la capital de ce pays
			//On compare les r�ponses
			//On affiche notre r�sultat
		}

	}

}
