import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class Tests {
	private int x;
	
	public static void main(String[] args) {
		
		go();
		
	}
	class MyInnerClass{
		
	}

	private static void go() {
		JFrame frame = new JFrame();
		JButton button = new JButton();
		button.setText("click");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(button);
		frame.setSize(300, 300);
		frame.setVisible(true);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
	}
		
		
}