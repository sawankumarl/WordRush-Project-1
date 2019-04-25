package w;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class TimerTime extends JPanel implements ActionListener{

			private JLabel timeLabel;
			private Timer Timertimer;
	
	public TimerTime() {
	 timeLabel=new JLabel(new Date().toString());
	 add(timeLabel);
	 Timertimer=new Timer(1000,this);
	 Timertimer.setInitialDelay(1);
	 Timertimer.start();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
			
			 createAndShowUI();
			
		// TODO Auto-generated method stub

	}
	 
	 
		 
	 

	@Override
	public void actionPerformed(ActionEvent ae) {
		timeLabel.setText(new Date().toString());
		// TODO Auto-generated method stub
		
	}
	
	private static void createAndShowUI()
	{
		JFrame frame=new JFrame("Timertimer");
		frame.add(new TimerTime());
		frame.setLocationByPlatform(true);
		frame.pack();
		frame.setVisible(true);
	}

}
