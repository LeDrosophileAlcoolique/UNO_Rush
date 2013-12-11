package fr.utt.srt.LO02.projet.UNO;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Collections;


public class Pioche 
{
	public LinkedList<Card> getToutesLesCartes() {
		return toutesLesCartes;
	}

	public void setToutesLesCartes(LinkedList<Card> toutesLesCartes) {
		this.toutesLesCartes = toutesLesCartes;
	}

	private LinkedList toutesLesCartes;
	
	
	
	public Pioche()
	{
		toutesLesCartes = new LinkedList<Card>();
		//on creer le jeu de carte
		creerJeu();
		//on mélange les cartes
		Collections.shuffle(toutesLesCartes);
		
		
	}
	
	public void creerJeu()
	{
		
		
		
//Blue Color
		toutesLesCartes.add(new CarteCouleur("Blue", 0));
		
		for(int j = 1; j < 10; j++)
		{
			toutesLesCartes.add(new CarteCouleur("Blue", j));
			toutesLesCartes.add(new CarteCouleur("Blue", j));
		}
		for(int j = 1; j < 3; j++)
		{
			toutesLesCartes.add(new CarteInverse("Blue", 20));
			toutesLesCartes.add(new CartePlusDeux("Blue", 20));
			toutesLesCartes.add(new CartePasseTour("Blue", 20));
		}

//Red Color
		toutesLesCartes.add(new CarteCouleur("Red", 0));
				
		for(int j = 1; j < 10; j++)
		{
			toutesLesCartes.add(new CarteCouleur("Red", j));
			toutesLesCartes.add(new CarteCouleur("Red", j));
		}
		for(int j = 1; j < 3; j++)
		{
			toutesLesCartes.add(new CarteInverse("Red", 20));
			toutesLesCartes.add(new CartePlusDeux("Red", 20));
			toutesLesCartes.add(new CartePasseTour("Red", 20));
		}

//Yellow Color
		toutesLesCartes.add(new CarteCouleur("Yellow", 0));
				
		for(int j = 1; j < 10; j++)
		{
			toutesLesCartes.add(new CarteCouleur("Yellow", j));
			toutesLesCartes.add(new CarteCouleur("Yellow", j));
		}
		for(int j = 1; j < 3; j++)
		{
			toutesLesCartes.add(new CarteInverse("Yellow", 20));
			toutesLesCartes.add(new CartePlusDeux("Yellow", 20));
			toutesLesCartes.add(new CartePasseTour("Yellow", 20));
		}

//Green Color
		toutesLesCartes.add(new CarteCouleur("Green", 0));
		
		for(int j = 1; j < 10; j++)
		{
			toutesLesCartes.add(new CarteCouleur("Green", j));
			toutesLesCartes.add(new CarteCouleur("Green", j));
		}
		for(int j = 1; j < 3; j++)
		{
			toutesLesCartes.add(new CarteInverse("Green", 20));
			toutesLesCartes.add(new CartePlusDeux("Green", 20));
			toutesLesCartes.add(new CartePasseTour("Green", 20));
		}
		
//JOKER
		for(int j = 0; j < 4; j++)
		{
			toutesLesCartes.add(new CarteJoker());
		}
		
//+4
		for(int j = 0; j < 4; j++)
		{
			toutesLesCartes.add(new CarteSuperJoker());
		}
		
	}
	
	public void piocher(Joueur joueur)
	{
		joueur.getPoigne().add(toutesLesCartes.pop());
	}
	
}
	

