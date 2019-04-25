package w;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class Main {

	public static void main(String[] args) {
		JFrame frame =new JFrame("Counter");
		frame.setLayout(new FlowLayout());
		
		JLabel label=new JLabel("count:0");
		frame.add(label);
		
		MyListener listener =new MyListener(label);
	
	
		 Timer timer = new Timer(1000,listener);
		 timer.start();
		 frame.setSize(300,200);
		 frame.setVisible(true);
		// TODO Auto-generated method stub

	}
	
	
					
		
	}	
		

