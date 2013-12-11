package fr.utt.srt.LO02.projet.UNO;

import java.util.Scanner;

public class JoueurHumain extends Joueur 
{

	public JoueurHumain(String nom, Jeu partie) 
	{
		super(nom, partie);
	}

	public void selectionnerCarte()
	{
		affichageTexte();
	}
	
	public boolean poserCarte(int index)
	{
		if(estJouable(poigne.get(index)));
		{
			//partie.setPioche(pioche);
			
			return false;
		}
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
				System.out.println("- 1 ) Quelle carte souhaitez vous jouer ?\n");
				afficherCartes();
				Scanner sc2 = new Scanner(System.in);
//				while(!poserCarte(sc2.next()))
//				{
//				}
//				
				
			case(2):
				poigne.add((Card)(partie.getPioche().getToutesLesCartes().poll()));
				
			case(3):
				aDitUNO = true;
				
		}
		
		
		
	}
}