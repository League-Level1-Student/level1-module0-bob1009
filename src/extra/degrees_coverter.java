package extra;

import java.awt.JobAttributes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class degrees_coverter implements ActionListener{
	JFrame frame= new JFrame();
	JPanel panel=new JPanel();
	JButton button=new JButton();
	JTextField field=new JTextField(5);
	JLabel lable1 =new JLabel();
	JLabel lable2 =new JLabel();
	int answer;
	String number;
	
	
	degrees_coverter(){	
		frame.setVisible(true);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		panel.add(field);
		lable1.setText("degrees farhanheit");
		panel.add(lable1);
		button.setText("convert");
		panel.add(button);
		panel.setVisible(true);
		button.addActionListener(this);
		field.getText();
			
		}
		

	

		// TODO Auto-generated method stub
		
public static void main(String[] args) {
	degrees_coverter dc=new degrees_coverter();
	
		
}
@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	JButton button2= (JButton) arg0.getSource();
	
	if (button2==button) {
	String far = field.getText();
	int answer=Integer.parseInt(far);
	int celsius= answer*5/9-32;
	JOptionPane.showMessageDialog(null,celsius +" degrees celsius is "+ answer + " in farenheight" );
	
	}
			}}