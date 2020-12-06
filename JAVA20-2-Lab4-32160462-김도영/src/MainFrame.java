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
	private static final String MAIN_TITLE = "Decorating Tshirts";
	private static final String[] comboboxItems =  {"ShortSleeveTshirt","HoodedSweatshirt","LongSleeveTshirt","SweatShirt"};

	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JComboBox<String> combobox;
	private Tshirt[] products = {new ShortSleeveTshirt(),new HoodedSweatshirt(),new LongSleeveTshirt(),new SweatShirt()};
	private Tshirt product = products[0];
	private int selectedIndex = 0;
	private JPanel displayPanel;
	
	public MainFrame(String title) {
		super(title);

		// displayPanel
		displayPanel = new JPanel(new BorderLayout());
		displayPanel.add(product);
        this.getContentPane().add(displayPanel, BorderLayout.CENTER);
		
        // buttonPanel
		JPanel buttonPanel = new JPanel(new GridLayout(1, 4));
		
        combobox = new JComboBox<String>(comboboxItems); // tshirts combobox
        combobox.addItemListener(this);
        
        buttonPanel.add(combobox);
        button1 = new JButton("Heart");
        button1.addActionListener(this);
        buttonPanel.add(button1);
        
        button2 = new JButton("Tree");
        button2.addActionListener(this);
        buttonPanel.add(button2);
        
        button3 = new JButton("Text");
        button3.addActionListener(this);
        buttonPanel.add(button3);
        
        this.getContentPane().add(buttonPanel, BorderLayout.SOUTH);

        this.setSize(600, 700);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	// 데코레이터 버튼을 누르면 previous product에 데코레이터 클래스를 Wrapping 합니다.
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		if (button == button1) {
			displayPanel.remove(product); // remove previous tshirt
			product = new HeartDecorator(product); // decorate with HeartDecorator
			displayPanel.add(product); // add decorated tshirt
		}
		if(button == button2) {
			displayPanel.remove(product); // remove previous tshirt
			product = new TreeDecorator(product); // decorate with TreeDecorator
			displayPanel.add(product); // add decorated tshirt
		}
		if(button == button3) {
			displayPanel.remove(product); // remove previous tshirt
			product = new TextDecorator(product); // decorate with TextDecorator
			displayPanel.add(product); // add decorated tshirt
	        
		}
		System.out.println(product.getDescription() + " " + product.cost() + " won"); //설명 출력
		displayPanel.revalidate();	// paintComponents 출력
		displayPanel.repaint();
	}
	// selectedIndex 콤보박스의 index에 따른 selectedIndex 설정해줍니다. 
	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getStateChange() == ItemEvent.SELECTED) {
			
			if( e.getItem() == comboboxItems[0]) {
				selectedIndex = 0;
			}
			else if( e.getItem() == comboboxItems[1]) {
				selectedIndex = 1;
			}
			else if( e.getItem() == comboboxItems[2]) {
				selectedIndex = 2;
			}
			else if( e.getItem() == comboboxItems[3]) {
				selectedIndex = 3;
			}else {
				selectedIndex = 0;
			}
			setProductselectedIndex();
			displayPanel.revalidate();	// paintComponents 출력
			displayPanel.repaint();
		}
	}
	// itemStateChanged에 호출됨 . selectedIndex 콤보박스의 index에 따른 product를 바꿔줍니다.
	public void setProductselectedIndex() { 
		switch (selectedIndex) {
		case 0:
			displayPanel.remove(product);
			product = products[0];
			displayPanel.add(product);
			break;
		case 1:
			displayPanel.remove(product);
			product = products[1];
			displayPanel.add(product);
			break;
		case 2:
			displayPanel.remove(product);
			product = products[2];
			displayPanel.add(product);
			break;
		case 3:
			displayPanel.remove(product);
			product = products[3];
			displayPanel.add(product);
			break;
		default:
			break;
		}
		System.out.println(product.getDescription() + " " + product.cost() + " won"); //설명 출력
	}
	
    public static void main(String[] args) {
        new MainFrame(MAIN_TITLE);
    }

}
