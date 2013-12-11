package fr.utt.srt.LO02.projet.UNO;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Talon 
{
	
	private List<Card> cartes;
	
	public Talon()
	{
		cartes = new LinkedList<Card>();
	}

	public List<Card> getCartes() {
		return cartes;
	}

	public void setCartes(List<Card> cartes) {
		this.cartes = cartes;
	}
}
