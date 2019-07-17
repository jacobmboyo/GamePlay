package com.jacob.start;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.jacob.challenger.Challenger;
import com.jacob.defender.Defender;
import com.jacob.duel.Duel;

public class Main {

	public static void main(String[] args) {
		System.out.println("Bienvenue sur GAMEPLAY!");
		System.out.println("Sélectionner un mode pour continuer");
		System.out.println("1= Challenger\n2= Defender\n3= Duel");
		
		Scanner clavier = new Scanner(System.in);
		
		try {
			
		int mode = clavier.nextInt();

		switch(mode){
			case 1:
				Challenger choice = new Challenger();
				choice.jeux();
				break;
			case 2:
				Defender choice2 = new Defender();
				choice2.jeux();
				break;
			case 3:
				Duel choice3 = new Duel();
				choice3.jeux();
				break;
			default:
				System.out.println("Désolé, Vous devriez saisir un chiffre comme 1, 2 ou 3\"");
		}
		
		}catch(InputMismatchException e) {
			System.out.println("Désolé, Vous devriez saisir un chiffre comme 1, 2 ou 3");
		}

	}

}
