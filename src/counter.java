import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class counter implements ActionListener{
	JFrame window = new JFrame();
	JPanel panel = new JPanel();
	JButton incbutton = new JButton("increase");
	JButton dispbutton= new JButton("display");
	static counter c = new counter();

	
	public static void main(String[] args) {
		c.buildwindow();

	}

	void buildwindow() {
	window.add(panel);
	panel.add(incbutton);
	panel.add(dispbutton);
	window.setVisible(true);
	window.pack();
	incbutton.addActionListener(this);
	dispbutton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton j==(JButton)arg0.setSource();
		if (j==incbutton) {
			System.out.println("incbutton");
		}else if (j==dispbutton) {
			System.out.println("dispbutton");
		}
			
		}
}