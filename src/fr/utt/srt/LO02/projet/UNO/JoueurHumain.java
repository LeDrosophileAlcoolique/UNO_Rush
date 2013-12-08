package fr.utt.srt.LO02.projet.UNO;

import java.util.Scanner;

public class JoueurHumain extends Joueur 
{

	public JoueurHumain(String nom) 
	{
		super(nom);
	}

	public void selectionnerCarte()
	{
		affichageTexte();
	}
	
	
	public void jouer()
	{
		Scanner sc = new Scanner(System.in);
		
		int reponse;
		
		System.out.println("Quelle action voulez vous effectuer ?\n");
		System.out.println("- 1 ) Jouer une carte ?\n");
		System.out.println("- 2 ) Piocher une carte \n");
		System.out.println("- 3 ) Dire UNO \n");
		System.out.println("- 4 ) Dire contre-UNO \n");
		
		reponse = sc.nextInt();
		
		switch(reponse)
		{
			case(1) : 
		}
		
		
		
	}
}