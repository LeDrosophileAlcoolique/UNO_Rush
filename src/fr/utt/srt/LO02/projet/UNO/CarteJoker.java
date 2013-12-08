package fr.utt.srt.LO02.projet.UNO;

public class CarteJoker extends Card
{
	public CarteJoker()
	{
		super("Black", 50);
		this.type = "Carte Joker";
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
