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
	protected Jeu partie;
	protected boolean aDitUNO;
	
	
	public Joueur(String nom, Jeu partie)
	{
		poigne = new LinkedList();
		score = 0;
		this.nom = nom;
		this.partie = partie;
		aDitUNO = false;
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
	
	public void afficherCartes()
	{
		ListIterator li = poigne.listIterator();
		
		while(li.hasNext())
		{
			((Card)(li.next())).affichageCarte();

		}
	}
	
	public void affichageTexte()
	{
		System.out.print("Joueur : " + nom +  "\n" );
		afficherCartes();
	}
	public void jouer()
	{
		System.out.println("ca marche pas!");
	}
}
