package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

import model.Person;

public class PersonDialog extends JDialog implements ActionListener, KeyListener {
	public final static int OK = 1;
	public final static int CANCEL  = 2;
	int returnValue = 0;
	
	
	JLabel label1 = new JLabel("age");
	JLabel label2 = new JLabel("name");
	JTextField textfield1 = new JTextField(20);
	JTextField textfield2 = new JTextField(20);
	JButton button1 = new JButton("submit");
	
	Person person = new Person();
	
	public PersonDialog() {
		setTitle("Person Dialog");
		setLayout(null);
		label1.setBounds(20,30,100,20);
		label2.setBounds(20,60,100,20);
		this.add(label1);
		this.add(label2);
		
		textfield1.setBounds(120,30,100,20);
		textfield2.setBounds(120,60,100,20);
		this.add(textfield1);
		this.add(textfield2);
		
		button1.setBounds(60,220,160,20);
		button1.addActionListener(this);
		this.add(button1);
		
		this.setSize(300,300);
		this.setModal(true);
	}
	// ActionListener 인터페이스의 구현, button 리스너
	@Override
	public void actionPerformed(ActionEvent e) {
		if( (JButton)e.getSource() == button1) {
			System.out.println("button1 ");
			person.setAge(Integer.parseInt(textfield1.getText()));
			person.setName(textfield2.getText());
			returnValue = OK;
			dispose(); // ? 이 다이로그를 꺼라.
		}
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}
}
