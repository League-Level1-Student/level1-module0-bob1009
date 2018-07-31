import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;






public class sensitvekeyboard implements KeyListener{
sensitvekeyboard(){
	JFrame frame=new JFrame();
	frame.setVisible(true);
	frame.setSize(599, 599);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.addKeyListener(this);}
	static void speak(String words) {
	    try {
	         Runtime.getRuntime().exec("say " + words).waitFor();
	    } catch (Exception e) {
	         e.printStackTrace();
	         }
	    
	}
	public static void main(String[] args) {
		sensitvekeyboard keyboard=new sensitvekeyboard();
	}
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		speak("ouch");
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
