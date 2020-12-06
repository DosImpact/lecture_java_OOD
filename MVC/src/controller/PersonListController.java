package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.text.html.ImageView;

import model.Person;
import view.TextView;

public class PersonListController extends JFrame implements ListSelectionListener, MouseListener  {
	private List<Person> pList; // M
	private ImageView imageView; // V
	private TextView textView; // C
	
	JPanel panel = new JPanel();
	// Jlist를 사용하기 위해서는 DefaultListModel 를 사용해야한다.
	DefaultListModel<String> listmodel = new DefaultListModel<>();
	JList<String> list = new JList<>(listmodel);
	
	
	
	public PersonListController(List<Person> pList, ImageView imageView, TextView textView) {
		this.pList = pList;
		this.imageView = imageView;
		this.textView = textView;
		
		//JList ? 
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		// implements ListSelectionListener
		list.addListSelectionListener(this);
		list.addMouseListener(this);
		list.setLayoutOrientation(JList.VERTICAL);
		list.setVisibleRowCount(-1);
		panel.add(list);
		this.add(panel); //23:30
	}



	public static void main(String[] args) {
		
	}
	
	// implements ListSelectionListener
	@Override
	public void valueChanged(ListSelectionEvent e) {
	}
	
	
	// implements MouseListener
	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}
}
