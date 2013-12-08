package fr.utt.srt.LO02.projet.UNO;

public class CartePlusDeux  extends Card
{
	public CartePlusDeux(String color, int value)
	{
		super(color, value);
		this.type = "Carte +2";
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
