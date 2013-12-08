package fr.utt.srt.LO02.projet.UNO;

public class CarteCouleur extends Card
{
	
	
	public CarteCouleur(String color, int value)
	{
		super(color, value);
//		this.color = color;
//		this.value = value;
		this.type = "Carte normale";
	}

	public String getColor() {
		return this.color;
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

}
