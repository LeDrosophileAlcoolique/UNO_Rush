package fr.utt.srt.LO02.projet.UNO;


public abstract class Card
{
	protected String color;
	protected String type;
	protected int value; 
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Card(String color, int value)
	{
		this.color = color;
		this.value = value;
	}
	
	public void affichageCarte()
	{
		System.out.print(type + " - " + color + " - " + value + "\n");
	}
}
