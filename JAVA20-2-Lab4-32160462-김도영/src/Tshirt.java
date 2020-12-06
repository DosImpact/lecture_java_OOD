import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.JPanel;

// Tshirt Ŭ���� JPanel�� ��ӹ޾� paintComponent ���� 
public abstract class Tshirt extends JPanel {
	protected static final int WIDTH = 600;
	protected static final int HEIGHT = 600;
	protected String description = "Tshirt";
	protected Image image = null;
	
    public String getDescription() { // description ���
		return description;
	}
    // Graphics ��ü�� ���� Image image �� �����͸� ����մϴ�.
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g); // JPanel paintComponent
		Graphics2D g2 = (Graphics2D) g;
		if (image != null)
			g2.drawImage(image, 0, 0, WIDTH, HEIGHT, this); // ����� �̹���, ��ġ, ũ�� ����
	}
	
	public abstract double cost(); // the different types of tshirt will have different cost
}
