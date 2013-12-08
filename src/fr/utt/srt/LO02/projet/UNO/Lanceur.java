package fr.utt.srt.LO02.projet.UNO;

import java.util.Scanner;

public class Lanceur {

	public static void main(String[] args) 
	{
		int nombreHumain;
		int nombreJoueur;
		Scanner sc = new Scanner(System.in);
//		Scanner sc2 = new Scanner(System.in);

		Jeu partieDeUNO;
		
		System.out.print("Bienvenue dans le jeu de UNO\n\n");
		
		System.out.print("Combien de joueur (humain + IA) ?");
		nombreJoueur = sc.nextInt();
		System.out.print("Combien de joueur humain ?");
		nombreHumain = sc.nextInt();
//		System.out.print("String ?\n");
//		String s  = sc2.nextLine();
		//sc.close();
//		sc2.close();
		
		
//		System.out.println(s + "\n\n");
		
		
		partieDeUNO = new Jeu(nombreJoueur, nombreHumain);
	}

}
