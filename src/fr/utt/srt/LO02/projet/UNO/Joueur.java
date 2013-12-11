package fr.utt.srt.LO02.projet.UNO;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public abstract class Joueur 
{
	protected LinkedList<Card>  poigne;
	protected String nom;
	protected int score;
	protected String type;
	protected Jeu partie;
	protected boolean aDitUNO;
	
	
	public Joueur(String nom, Jeu partie)
	{
		poigne = new LinkedList<Card>();
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
		int i = 0;
		ListIterator<Card> li = poigne.listIterator();
		
		while(li.hasNext())
		{
			System.out.println("Carte No" + i);
			((Card)(li.next())).affichageCarte();
			i++;
		}
	}
	
	public boolean estJouable(Card carte)
	{
		if((partie.getTalon().getCartes().get(0).getColor() == carte.getColor())||
				(partie.getTalon().getCartes().get(0).getValue()== carte.getValue()))
			return true;
		
		if (carte.getColor() == "black")
			return true;
		
		return false;
	}
	
	public void affichageTexte()
	{
		System.out.print("Joueur : " + nom +  "\n" );
		afficherCartes();
	}
	public void jouer()
	{
		int reponse;
		Scanner sc = new Scanner(System.in);
		System.out.println("ca marche pas!\n");
		System.out.println("Vos cartes : \n");
		System.out.println("\nQuelle carte souhaitez vous jouer ?\n");
		reponse = sc.nextInt();
		
		
		

		
		
	}
}
