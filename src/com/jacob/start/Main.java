package com.jacob.start;

import java.util.Scanner;

import com.jacob.challenger.Challenger;
import com.jacob.defender.Defender;

public class Main {

	public static void main(String[] args) {
		System.out.println("Bienvenue sur GAMEPLAY!");
		System.out.println("Sélectionner un mode pour continuer");
		System.out.println("1= Challenger\n2= Defender\n3= Duel");
		
		Scanner clavier = new Scanner(System.in);
		int mode = clavier.nextInt();
		
		
		switch(mode){
			case 1:
				Challenger choice = new Challenger();
				choice.main(args);
				break;
			case 2:
				Defender choice2 = new Defender();
				choice2.main(args);
				break;
			case 3:
				System.out.println("Duel");
				break;
			default:
				System.out.println("Valeur invalide!");
		}
		
		

	}

}
