import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

public class HeartDecorator extends TshirtDecorator {
	protected Image logo = new ImageIcon("heart.jpg").getImage();
	// 기본 하트 모양의 사진로고를 image 에 등록합니다.
	public HeartDecorator(Tshirt decoratedTshirt) {
		super(decoratedTshirt);
		description = "HeartDecorator";
		image = logo;
	}
	
	@Override
    public String getDescription() {// Description Wrapping
		return this.decoratedTshirt.getDescription() + " HeartDecorator";
	}
	
	@Override
	public void paintComponent(Graphics g) {// draw Image/Text Wrapping
		decoratedTshirt.paintComponent(g);	// 1. Draw decoratedTshirt Image
		Graphics2D g2 = (Graphics2D) g;		// 2. Draw decoratedTshirt Image
		if (image != null)
			g2.drawImage(image, 200, 200, 200, 200, this);
	}
	
	@Override
	public double cost() {						// cost Wrapping
		return this.decoratedTshirt.cost() + 2000;
	}
}
