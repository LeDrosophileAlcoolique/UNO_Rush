package fr.utt.srt.LO02.projet.UNO;

public class CarteSuperJoker extends Card
{
	public CarteSuperJoker()
	{
		super("Black", 50);
		this.type = "Carte +4";
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
