package w;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Eigth {
		JFrame F;
		JLabel l1,l2,l3,l4,l5,l6;
		
		
	public Eigth() {
		F=new JFrame();
		F.setSize(305,400);
		F.setResizable(false);
		F.setLayout(null);
		
		l5=new JLabel("Correct Word Is");
		l5.setBounds(110, 50, 150, 20);
		F.add(l5);
		
		l6=new JLabel("Youe Score Is");
		l6.setBounds(110, 160, 150, 20);
		F.add(l6);
		
		l1=new JLabel("___");
		l1.setBounds(20, 88, 30, 50);
		l1.setForeground(Color.blue);
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setFont(new Font("Tahoma", Font.BOLD, 16));
		F.add(l1);

		l2=new JLabel("___");
		l2.setBounds(80, 88, 30, 50);
		l2.setForeground(Color.blue);
		l2.setHorizontalAlignment(SwingConstants.CENTER);
		l2.setFont(new Font("Tahoma", Font.BOLD, 16));
		F.add(l2);

		l3=new JLabel("___");
		l3.setBounds(150, 88, 30, 50);
		l3.setForeground(Color.blue);
		l3.setHorizontalAlignment(SwingConstants.CENTER);
		l3.setFont(new Font("Tahoma", Font.BOLD, 16));
		F.add(l3);

		l4=new JLabel("___");
		l4.setBounds(210, 88, 30, 50);
		l4.setForeground(Color.blue);
		l4.setHorizontalAlignment(SwingConstants.CENTER);
		l4.setFont(new Font("Tahoma", Font.BOLD, 16));
		F.add(l4);
		
		F.setVisible(true);


		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		new Eigth();
		// TODO Auto-generated method stub

	}

}
