//package w;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class First implements ActionListener {
	JFrame f;
	JButton B1,B2,B3,cancel;
	JLabel l1,l2;
	
	private JLabel BgLabel;
	
	public First() {
		
		
		f = new JFrame("Proj");
		f.setSize(300,400);
		f.setResizable(false);
		f.setLayout(null);
		BgLabel= createBackgroundLabel();
		f.setLocation(100, 100);
		f.setUndecorated(true);
		f.add(BgLabel);

		l1=new JLabel("WORD RUSH");
		l1.setBounds(30,10,300,80);
		//l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setFont(new Font("Papyrus",Font.BOLD,25));
		l1.setForeground(Color.red);
		BgLabel.add(l1);
		
		ImageIcon backgroundImages3 = new ImageIcon("xx.PNG");
		cancel=new JButton();
		cancel.setBounds(270, 0, 25, 30);
		Dimension sizel3=cancel.getSize();
		cancel.addActionListener(this);
		cancel.setIcon(new ImageIcon(backgroundImages3.getImage().getScaledInstance((int) sizel3.getWidth(), (int) sizel3.getHeight(), Image.SCALE_SMOOTH)));
		cancel.setContentAreaFilled(false);
		cancel.setBorderPainted(false);
		cancel.setActionCommand("Cancel");
		BgLabel.add(cancel);

		l2=new JLabel("BEST SCORE");
		l2.setBounds(50,100,200,50);
		l2.setFont(new Font("Elephant",Font.PLAIN,25));
		BgLabel.add(l2);

		ImageIcon backgroundImages = new ImageIcon("play.PNG");
		B1=new JButton("");
		B1.setBounds(110,300,73,50);
		Dimension size1=B1.getSize();
		B1.setIcon(new ImageIcon(backgroundImages.getImage().getScaledInstance((int) size1.getWidth(), (int) size1.getHeight(), Image.SCALE_SMOOTH)));
		B1.addActionListener(this);
		B1.setContentAreaFilled(false);
		B1.setBorderPainted(false);
		B1.setActionCommand("START");
		BgLabel.add(B1);

		ImageIcon backgroundImages1 = new ImageIcon("quit.PNG");
		B2=new JButton("Quit");
		B2.setBounds(10,300,85,50);
		Dimension sizel1=B2.getSize();
		B2.setIcon(new ImageIcon(backgroundImages1.getImage().getScaledInstance((int) size1.getWidth(), (int) size1.getHeight(), Image.SCALE_SMOOTH)));
		B2.addActionListener(this);
		B2.setContentAreaFilled(false);
		B2.setBorderPainted(false);
		B2.setActionCommand("Quit");
		BgLabel.add(B2);
		
		ImageIcon backgroundImages2= new ImageIcon("button_setting.png");
		B3=new JButton("");
		B3.setBounds(210,300,75,50);
		Dimension sizel2=B3.getSize();
		B3.setIcon(new ImageIcon(backgroundImages2.getImage().getScaledInstance((int) size1.getWidth(), (int) size1.getHeight(), Image.SCALE_SMOOTH)));
		B3.addActionListener(this);
		B3.setContentAreaFilled(false);
		B3.setBorderPainted(false);
		B3.setActionCommand("Setting");
		BgLabel.add(B3);


		//f.setBackground(Color.orange);
		f.setVisible(true);
		// TODO Auto-generated constructor stub
	}

	private JLabel createBackgroundLabel() {
		Dimension size = f.getSize();
        ImageIcon backgroundImage = new ImageIcon("m.PNG");
        JLabel backgroundLabel = new JLabel();
        backgroundLabel.setBounds(0, 0, (int) size.getWidth(), (int) size.getHeight());
        backgroundLabel.setIcon(new ImageIcon(backgroundImage.getImage().getScaledInstance((int) size.getWidth(), (int) size.getHeight(), Image.SCALE_SMOOTH)));
        return backgroundLabel;
		// TODO Auto-generated method stub
	
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getActionCommand().equals("START"))
		{
				f.setVisible(false);
				//f1.setVisible(true);
				Second s=new Second();
		}
		if(ae.getActionCommand().equals("Setting"))
		{
			//f.setVisible(false);
			Third t=new Third();
		}
		if(ae.getActionCommand().equals("Cancel"))
		{
			f.dispose();
			
		}

	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new First();
	}

}
