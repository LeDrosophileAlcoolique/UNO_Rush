package fr.utt.srt.LO02.projet.UNO;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public abstract class Joueur 
{
	protected LinkedList  poigne;
	protected String nom;
	protected int score;
	protected String type;
	
	
	public Joueur(String nom)
	{
		poigne = new LinkedList();
		score = 0;
		this.nom = nom;
	}


	public LinkedList getPoigne() {
		return poigne;
	}


	public void setPoigne(LinkedList poigne) {
		this.poigne = poigne;
	}


	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		this.score = score;
	}


	public String getNom() {
		return nom;
	}
	
	public void affichageTexte()
	{
		ListIterator li = poigne.listIterator();
		
		
		System.out.print("Joueur : " + nom +  "\n" );
		while(li.hasNext())
		{
			((Card)(li.next())).affichageCarte();

		}
	}
	public void Jouer()
	{
		System.out.println("ca marche pas!");
	}
}
