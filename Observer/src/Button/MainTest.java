package Button;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainTest extends JFrame {

	private JButton button1;
	private JPanel displayPanel;
	
	
	public MainTest(String title) {
		super(title);
		// displayPanel
		displayPanel = new JPanel(new BorderLayout());
        this.getContentPane().add(displayPanel, BorderLayout.CENTER);
		
        // buttonPanel
		JPanel buttonPanel = new JPanel(new GridLayout(1, 4));
        
        button1 = new JButton("Heart");
        button1.addActionListener( e -> System.out.println("lambda"));
        button1.addActionListener(new DevilListener());
        button1.addActionListener(new AngelListener());

        
        buttonPanel.add(button1);
        
        this.getContentPane().add(buttonPanel, BorderLayout.SOUTH);
        this.setSize(600, 700);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
    public static void main(String[] args) {
        new MainTest("TEST");
    }



}
