import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.JPanel;

// Tshirt 클래스 JPanel를 상속받아 paintComponent 수행 
public abstract class Tshirt extends JPanel {
	protected static final int WIDTH = 600;
	protected static final int HEIGHT = 600;
	protected String description = "Tshirt";
	protected Image image = null;
	
    public String getDescription() { // description 출력
		return description;
	}
    // Graphics 객체를 통해 Image image 의 데이터를 출력합니다.
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g); // JPanel paintComponent
		Graphics2D g2 = (Graphics2D) g;
		if (image != null)
			g2.drawImage(image, 0, 0, WIDTH, HEIGHT, this); // 출력할 이미지, 위치, 크기 정보
	}
	
	public abstract double cost(); // the different types of tshirt will have different cost
}
