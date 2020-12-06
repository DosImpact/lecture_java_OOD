import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

public class TextDecorator extends TshirtDecorator {
	protected String text= "JAVA";
	// 기본 text를 DrawString 하기에 image는 사용하지 않습니다.
	public TextDecorator(Tshirt decoratedTshirt) {
		super(decoratedTshirt);
		description = "TreeDecorator";
	}
	
	@Override
    public String getDescription() {// Description Wrapping
		return this.decoratedTshirt.getDescription() + " TextDecorator";
	}
	
	@Override
	public void paintComponent(Graphics g) {// draw Image/Text Wrapping
		decoratedTshirt.paintComponent(g);// 1. Draw decoratedTshirt Image
		Graphics2D g2 = (Graphics2D) g;	// 2. Draw decoratedTshirt Image
		if (text != null)
			g2.drawString(text, 200, 200);
	}
	
	@Override
	public double cost() {						// cost Wrapping
		return this.decoratedTshirt.cost() + 500;
	}
}
