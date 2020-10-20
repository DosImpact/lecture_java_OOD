import javax.swing.ImageIcon;

public class ShortSleeveTshirt extends Tshirt {
	public ShortSleeveTshirt() {
		description = "Long Sleeve Tshirt";
		image = new ImageIcon("long-tshirt-white.jpg").getImage();
	}

	@Override
	public double cost() {
		return 15000;
	}

}
