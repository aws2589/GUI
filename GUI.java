import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class GUI extends JFrame  {


	public GUI() {
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Enter two numbers to find the sum:");
		JTextField num1 = new JTextField(10);
		JTextField num2 = new JTextField(10);
		JButton button = new JButton("Calculate");
		button.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "The total of the two numbers is " + (Integer.parseInt(num1.getText())+Integer.parseInt(num2.getText())));	
		
		}
		
		});
		
		panel.add(label);
		panel.add(num1);
		panel.add(num2);
		panel.add(button);
		
		add(panel);
		setSize(300,200);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		new GUI();
	
	}
}




		
		