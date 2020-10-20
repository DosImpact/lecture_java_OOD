import javax.swing.ImageIcon;

public class SweatShirt extends Tshirt {
	public SweatShirt() {
		description = "SweatShirt";
		image = new ImageIcon("sweatshirt-white.jpg").getImage();
	}

	@Override
	public double cost() {
		return 20000;
	}

}
