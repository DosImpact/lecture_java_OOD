import javax.swing.ImageIcon;

public class LongSleeveTshirt extends Tshirt {
	public LongSleeveTshirt() {
		description = "Short Sleeve Tshirt";
		image = new ImageIcon("short-tshirt-white.jpg").getImage();
	}
	@Override
	public double cost() {
		return 12500;
	}
}
