import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame implements ActionListener, ItemListener {
    private static final String MAIN_TITLE = "Shape";
    private static final String[] comboboxItems = { "Triangle", "Rectangle", "Circle" }; // combobox�� shirt option �߰�

    // up down left right undo button
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    
    private JComboBox<String> combobox;
    private Shape[] products = { new Triangle(), new Rectangle(), new Circle() }; //
    private Shape product = products[0];
    

    private JPanel displayPanel;
    private static ShapeMoveControl shapeMoveControl = new ShapeMoveControl();

    // MainFrame�� Layout�� �����մϴ�.
    public MainFrame(String title) {
        super(title);

        // displayPanel - �ֻ�� �г�
        displayPanel = new JPanel(new BorderLayout());
        displayPanel.add(product);
        this.getContentPane().add(displayPanel, BorderLayout.CENTER);

        
        // �ϴ��� �г�, �׸��� ���̾ƿ����� ���� 
        JPanel buttonPanel = new JPanel(new GridLayout(1, 6));
        
        // �޺��ڽ� add
        combobox = new JComboBox<String>(comboboxItems); // tshirts combobox
        combobox.addItemListener(this);
        buttonPanel.add(combobox);
        
        // 5�� ��ư add
        button1 = new JButton("up");
        button1.addActionListener(this);
        buttonPanel.add(button1);
        
        button2 = new JButton("down");
        button2.addActionListener(this);
        buttonPanel.add(button2);
        
        button3 = new JButton("left");
        button3.addActionListener(this);
        buttonPanel.add(button3);
        
        button4 = new JButton("right");
        button4.addActionListener(this);
        buttonPanel.add(button4);
        
        button5 = new JButton("undo");
        button5.addActionListener(this);
        buttonPanel.add(button5);
        
        
        // displayPanel - �ֻ�� �г� Visible
        this.getContentPane().add(buttonPanel, BorderLayout.SOUTH);
        this.setSize(600, 700);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // ��ư�� �̺�Ʈ�� ó���մϴ�.
    @Override
    public void actionPerformed(ActionEvent e) {
    	JButton button = (JButton) e.getSource();
    	 if (button == button1) {
    		 shapeMoveControl.execute("up",product);
    	 }
       	 if (button == button2) {
    		 shapeMoveControl.execute("down",product);
    	 }
       	 if (button == button3) {
    		 shapeMoveControl.execute("left",product);
    	 }
       	 if (button == button4) {
    		 shapeMoveControl.execute("right",product);
    	 }
       	 if (button == button5) {
    		 shapeMoveControl.undo(product);
    
    	 }
			displayPanel.revalidate();
			displayPanel.repaint();
    }

    //�޺��ڽ��� �̺�Ʈ�� ó���մϴ�.
    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
//        	System.out.println(combobox.getSelectedItem());
        	// Triangle ���õ�
            if (combobox.getSelectedItem() == comboboxItems[0] ) { 
                                                                                     
                displayPanel.remove(product); 
                product = products[0]; 
                displayPanel.add(product); 
                displayPanel.revalidate();
                displayPanel.repaint();
             // Rectangle ���õ�
            } else if (combobox.getSelectedItem() == comboboxItems[1] ) {

                displayPanel.remove(product);
                product = products[1];
                displayPanel.add(product);
                displayPanel.revalidate();
                displayPanel.repaint();
             // Circle ���õ�
            } else if (combobox.getSelectedItem() == comboboxItems[2] ) {

                displayPanel.remove(product);
                product = products[2];
                displayPanel.add(product);
                displayPanel.revalidate();
                displayPanel.repaint();
            } else {
                displayPanel.remove(product);
                product = products[0];
                displayPanel.add(product);
                displayPanel.revalidate();
                displayPanel.repaint();
            }
        }
    }

    public static void main(String[] args) {
    	// ���� ������ �۵�
        new MainFrame(MAIN_TITLE);
        // commander ���
        shapeMoveControl.setCommand("up", new MoveUpCommand());
        shapeMoveControl.setCommand("down", new MoveDownCommand());
        shapeMoveControl.setCommand("left", new MoveLeftCommand());
        shapeMoveControl.setCommand("right", new MoveRightCommand());
    }

}