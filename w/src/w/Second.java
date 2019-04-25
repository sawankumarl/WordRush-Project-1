package w;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Second implements ActionListener {
	JFrame f;
	JButton B1,B2,B3,B4;
	JLabel l;
	
	private JLabel BgLabel;

	public Second() {
		f=new JFrame("Second Frame");
		f.setSize(300,400);
		f.setResizable(false);
		f.setLayout(null);
		BgLabel= createBackgroundLabel();
		f.add(BgLabel);

		l=new JLabel("SELECT LEVEL");
		l.setForeground(Color.GREEN);
		l.setHorizontalAlignment(SwingConstants.CENTER);
		l.setFont(new Font("Tahoma", Font.BOLD, 23));
		l.setBounds(40,10,200,80);
		BgLabel.add(l);

		ImageIcon backgroundImages1= new ImageIcon("EASY.jpg");
		B1=new JButton("");
		B1.setBounds(50,120,185,35);
		Dimension sizel=B1.getSize();
		B1.setIcon(new ImageIcon(backgroundImages1.getImage().getScaledInstance((int) sizel.getWidth(), (int) sizel.getHeight(), Image.SCALE_SMOOTH)));
		B1.addActionListener(this);
		B1.setContentAreaFilled(false);
		B1.setBorderPainted(false);
		B1.setActionCommand("EASY");
		BgLabel.add(B1);

		ImageIcon backgroundImages2= new ImageIcon("MEDIUM.jpg");
		B2=new JButton("");
		B2.setBounds(50,180,185,39);
		Dimension sizel1=B2.getSize();
		B2.setIcon(new ImageIcon(backgroundImages2.getImage().getScaledInstance((int) sizel.getWidth(), (int) sizel.getHeight(), Image.SCALE_SMOOTH)));
		B2.addActionListener(this);
		B2.setContentAreaFilled(false);
		B2.setBorderPainted(false);
		B2.setActionCommand("MEDIUM");
		BgLabel.add(B2);

		ImageIcon backgroundImages3= new ImageIcon("HARD.jpg");
		B3=new JButton("");
		B3.setBounds(50,240,185,40);
		Dimension sizel2=B2.getSize();
		B3.setIcon(new ImageIcon(backgroundImages3.getImage().getScaledInstance((int) sizel.getWidth(), (int) sizel.getHeight(), Image.SCALE_SMOOTH)));
		B3.addActionListener(this);
		B3.setContentAreaFilled(false);
		B3.setBorderPainted(false);
		B3.setActionCommand("HARD");
		BgLabel.add(B3);
		
		ImageIcon backgroundImages4= new ImageIcon("EXPERT.jpg");
		B4=new JButton("EXPERT");
		B4.setBounds(53,300,190,45);
		Dimension sizel3=B2.getSize();
		B4.setIcon(new ImageIcon(backgroundImages4.getImage().getScaledInstance((int) sizel.getWidth(), (int) sizel.getHeight(), Image.SCALE_SMOOTH)));
		B4.addActionListener(this);
		B4.setContentAreaFilled(false);
		B4.setBorderPainted(false);
		B4.setActionCommand("HARD");
		//B4.addActionListener(this);
		BgLabel.add(B4);

		//f.setBackground(Color.gray);
		f.setVisible(true);
		// TODO Auto-generated constructor stub
	}

	private JLabel createBackgroundLabel() {
		Dimension size = f.getSize();
        ImageIcon backgroundImage = new ImageIcon("level.JPG");
        JLabel backgroundLabel = new JLabel();
        backgroundLabel.setBounds(0, 0, (int) size.getWidth(), (int) size.getHeight());
        backgroundLabel.setIcon(new ImageIcon(backgroundImage.getImage().getScaledInstance((int) size.getWidth(), (int) size.getHeight(), Image.SCALE_SMOOTH)));
        return backgroundLabel;
		// TODO Auto-generated method stub
		
	}

	//public static void main(String[] args) {
		
		//new Second();
		// TODO Auto-generated method stub

	//}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getActionCommand().equals("EASY"))
		{
			Fourth s=new Fourth();
			f.setVisible(false);
		}

		if(ae.getActionCommand().equals("MEDIUM"))
		{
			Fifth s=new Fifth();
			f.setVisible(false);
		}

		if(ae.getActionCommand().equals("HARD"))
		{
			Sixth s=new Sixth();
			f.setVisible(false);
		}
		
		if(ae.getActionCommand().equals("EXPERT"))
		{
			Seventh s=new Seventh();
			f.setVisible(false);
		}
		
		// TODO Auto-generated method stub
		
	}

}
