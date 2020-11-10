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
    private static final String[] comboboxItems = { "Triangle", "Rectangle", "Circle" }; // combobox에 shirt option 추가

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

    // MainFrame의 Layout를 지정합니다.
    public MainFrame(String title) {
        super(title);

        // displayPanel - 최상단 패널
        displayPanel = new JPanel(new BorderLayout());
        displayPanel.add(product);
        this.getContentPane().add(displayPanel, BorderLayout.CENTER);

        
        // 하단의 패널, 그리드 레이아웃으로 구성 
        JPanel buttonPanel = new JPanel(new GridLayout(1, 6));
        
        // 콤보박스 add
        combobox = new JComboBox<String>(comboboxItems); // tshirts combobox
        combobox.addItemListener(this);
        buttonPanel.add(combobox);
        
        // 5개 버튼 add
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
        
        
        // displayPanel - 최상단 패널 Visible
        this.getContentPane().add(buttonPanel, BorderLayout.SOUTH);
        this.setSize(600, 700);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // 버튼의 이벤트를 처리합니다.
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

    //콤보박스의 이벤트를 처리합니다.
    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
//        	System.out.println(combobox.getSelectedItem());
        	// Triangle 선택됨
            if (combobox.getSelectedItem() == comboboxItems[0] ) { 
                                                                                     
                displayPanel.remove(product); 
                product = products[0]; 
                displayPanel.add(product); 
                displayPanel.revalidate();
                displayPanel.repaint();
             // Rectangle 선택됨
            } else if (combobox.getSelectedItem() == comboboxItems[1] ) {

                displayPanel.remove(product);
                product = products[1];
                displayPanel.add(product);
                displayPanel.revalidate();
                displayPanel.repaint();
             // Circle 선택됨
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
    	// 메인 프레임 작동
        new MainFrame(MAIN_TITLE);
        // commander 등록
        shapeMoveControl.setCommand("up", new MoveUpCommand());
        shapeMoveControl.setCommand("down", new MoveDownCommand());
        shapeMoveControl.setCommand("left", new MoveLeftCommand());
        shapeMoveControl.setCommand("right", new MoveRightCommand());
    }

}