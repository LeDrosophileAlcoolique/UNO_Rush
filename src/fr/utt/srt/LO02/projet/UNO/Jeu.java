package fr.utt.srt.LO02.projet.UNO;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Jeu 
{
	private ArrayList<Joueur> listeJoueur; //
	private Talon talon;
	private Pioche pioche;
	
	
	private int nombreDeJoueur;
	private int nombreHumain;
	private int sensNormal;
	
	public Jeu(int joueur, int humain) 
	{
		this.nombreDeJoueur = joueur;
		this.nombreHumain = humain;
		this.sensNormal = 1;

		listeJoueur = new ArrayList<Joueur>();
		// creer les joueurs
		creerListeJoueur(joueur, humain);
		// creer la pioche
		talon = new Talon();
		// creer le talon
		pioche = new Pioche();
		// distribuer cartes
		distribuerCartes();

		// DEBUG TEST
		ListIterator li = listeJoueur.listIterator();

		while (li.hasNext()) 
		{
			((Joueur) (li.next())).affichageTexte();
		}

	}
	
	public static char scan(int index) { // récupère char dans un message a la position index depuis clavier 
		Scanner scan = new Scanner(System.in);
		//System.out.print(c = scan.nextLine().charAt(index)); // à dégager plus tard
		return scan.nextLine().charAt(index);
	}
	
	private void distribuerCartes()
	{
		for(int j = 0; j < 7; j++)
		{
				ListIterator it = listeJoueur.listIterator();
			    while(it.hasNext())
			    {
			    	pioche.piocher((Joueur)it.next()); //(Joueur)
			    }
		}
			
	}
	
	private void creerListeJoueur(int joueur, int humain)
	{	
		Scanner sc3 = new Scanner(System.in);
		String nom;
		
		JoueurHumain enCoursSaisie;
		JoueurIA enCoursSaisieIA;
		
		for(int i = 0; i < nombreHumain; i++)
		{
			System.out.print("\n Nom du Joueur humain no " + (i+1)); 
			
		
				nom = sc3.nextLine();
				System.out.print(nom);
			
			listeJoueur.add(new JoueurHumain(nom, this));
			
		}
		
		for(int i = 0; i < (nombreDeJoueur - nombreHumain); i++)
		{
			System.out.print("Nom du Joueur IA n°" + (i+1));
			nom = sc3.next();
			
			listeJoueur.add(new JoueurIA(nom, this));
			//enCoursSaisieIA = new JoueurIA(nom);
		}
	}
	
	public ArrayList<Joueur> getListeJoueur() {
		return listeJoueur;
	}

	public void setListeJoueur(ArrayList<Joueur> listeJoueur) {
		this.listeJoueur = listeJoueur;
	}

	public Talon getTalon() {
		return talon;
	}

	public void setTalon(Talon talon) {
		this.talon = talon;
	}

	public Pioche getPioche() {
		return pioche;
	}

	public void setPioche(Pioche pioche) {
		this.pioche = pioche;
	}

	public int getNombreDeJoueur() {
		return nombreDeJoueur;
	}

	public void setNombreDeJoueur(int nombreDeJoueur) {
		this.nombreDeJoueur = nombreDeJoueur;
	}

	public int getNombreHumain() {
		return nombreHumain;
	}

	public void setNombreHumain(int nombreHumain) {
		this.nombreHumain = nombreHumain;
	}

	public int isSensNormal() {
		return sensNormal;
	}

	public void setSensNormal(int sensNormal) {
		this.sensNormal = sensNormal;
	}

	public void lancerManche()
	{
		boolean partieFinie = false;
		int joueurEnCours = 0;
		
		//On initialise la Defausse
		
		while(!partieFinie)
		{
			//Le joueur en cours joue
			listeJoueur.get(joueurEnCours).jouer();
			
			//On vérifie fin de partie (joueur en cours a plus de carte)
			if(listeJoueur.get(joueurEnCours).getPoigne().isEmpty())
			{
				partieFinie = true;
			}
			
			//On applique l'effet de la carte posée.
			
			////talon.get
			
			//On change l'indice pour le prochain joueur.
			
			joueurEnCours = (joueurEnCours + (1 * sensNormal)) % nombreDeJoueur;
			
			//C'est bon!!
		}
	}
	
}
