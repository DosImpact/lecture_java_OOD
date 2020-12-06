package view;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ImageView extends JFrame {
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	
	public ImageView() {
		super("ImageView");
		panel.add(label);
		this.add(panel);
		this.setSize(600,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public void display(ImageIcon icon) {
		label.setIcon(icon);
		label.invalidate();
	}
}
