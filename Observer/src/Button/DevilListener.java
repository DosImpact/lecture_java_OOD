package Button;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DevilListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("AngelListener activated");
	}
	
}
