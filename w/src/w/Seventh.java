package w;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

public class Seventh implements ActionListener {
	JFrame f;
	JLabel l1,l2,l3,l4,timer,label;
	JButton B1,B2,B3,B4,B5,B6,l15,l26,l37,l48,l59,l60,HomeButton;
	
	private JLabel BgLabel;
	private TreeMap hm;

	public Seventh() {
		
		hm=new TreeMap();
		hm.put("l15", "-1");
		hm.put("l26","-1");
		hm.put("l37", "-1");
		hm.put("l48", "-1");
		hm.put("l59", "-1");
		hm.put("l60","-1");
		
		
		
		f=new JFrame("Fithh");
		f.setSize(350,400);
		f.setResizable(false);
		f.setLayout(null);
		BgLabel= createBackgroundLabel();
		f.add(BgLabel);

		l1=new JLabel("00");
		l1.setBounds(8, 8, 35, 50);
		l1.setForeground(Color.red);
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setFont(new Font("Tahoma", Font.BOLD, 20));
		BgLabel.add(l1);

		l3=new JLabel("Score");
		l3.setBounds(3, 28, 60, 50);
		l3.setForeground(Color.red);
		l3.setHorizontalAlignment(SwingConstants.CENTER);
		l3.setFont(new Font("Tahoma", Font.BOLD, 20));
		BgLabel.add(l3);

		l2=new JLabel("00");
		l2.setBounds(280, 8, 50, 50);
		l2.setForeground(Color.red);
		l2.setHorizontalAlignment(SwingConstants.CENTER);
		l2.setFont(new Font("Tahoma", Font.BOLD, 20));
		BgLabel.add(l2);

		l4=new JLabel("Best");
		l4.setBounds(280, 28, 50, 50);
		l4.setForeground(Color.red);
		l4.setHorizontalAlignment(SwingConstants.CENTER);
		l4.setFont(new Font("Tahoma", Font.BOLD, 20));
		BgLabel.add(l4);

		l15=new JButton("");
		l15.setBounds(6, 88, 50, 50);
		l15.addActionListener(this);
		l15.setActionCommand("l15");
		BgLabel.add(l15);

		l26=new JButton("");
		l26.setBounds(68, 88, 50, 50);
		l26.addActionListener(this);
		l26.setActionCommand("l26");
		BgLabel.add(l26);

		l37=new JButton("");
		l37.setBounds(128, 88, 50, 50);
		l37.addActionListener(this);
		l37.setActionCommand("l37");
		BgLabel.add(l37);

		l48=new JButton("");
		l48.setBounds(187, 88, 50, 50);
		l48.addActionListener(this);
		l48.setActionCommand("l48");
		BgLabel.add(l48);

		l59=new JButton("");
		l59.setBounds(245, 88, 50, 50);
		l59.addActionListener(this);
		l59.setActionCommand("l59");
		BgLabel.add(l59);
		
		l60=new JButton("");
		l60.setBounds(300, 88, 50, 50);
		l60.addActionListener(this);
		l60.setActionCommand("l60");
		BgLabel.add(l60);
		




		B1=new JButton("B1");
		B1.setBounds(45, 150, 50, 50);
		B1.addActionListener(this);
		BgLabel.add(B1);

		B2=new JButton("B2");
		B2.setBounds(190, 150, 50, 50);
		B2.addActionListener(this);
		BgLabel.add(B2);

		B3=new JButton("B3");
		B3.setBounds(45, 270, 50, 50);
		B3.addActionListener(this);
		BgLabel.add(B3);

		B4=new JButton("B4");
		B4.setBounds(190, 270, 50, 50);
		B4.addActionListener(this);
		BgLabel.add(B4);

		B5=new JButton("B5");
		B5.setBounds(90, 210, 50, 50);
		B5.addActionListener(this);
		BgLabel.add(B5);
		
		B6=new JButton("B6");
		B6.setBounds(145, 210, 50, 50);
		B6.addActionListener(this);
		BgLabel.add(B6);

		ImageIcon backgroundImages1= new ImageIcon("tt.jpg");
		HomeButton=new JButton("Home");
		HomeButton.setBounds(3,338, 70, 30);
		Dimension sizel=HomeButton.getSize();
		HomeButton.addActionListener(this);
		HomeButton.setIcon(new ImageIcon(backgroundImages1.getImage().getScaledInstance((int) sizel.getWidth(), (int) sizel.getHeight(), Image.SCALE_SMOOTH)));
		HomeButton.setContentAreaFilled(false);
		HomeButton.setBorderPainted(false);
		HomeButton.setActionCommand("Home");
		BgLabel.add(HomeButton);
		
		label=new JLabel("count:0");
		BgLabel.add(label);
		label.setBounds(270,330,60,40);
		label.setForeground(Color.orange);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		MyListener listener =new MyListener(label);
	
	
		 Timer timer = new Timer(1000,listener);
		 timer.start();
		
		f.setVisible(true);
		// TODO Auto-generated constructor stub
	}

	private JLabel createBackgroundLabel() {
		Dimension size = f.getSize();
        ImageIcon backgroundImage = new ImageIcon("study.png");
        JLabel backgroundLabel = new JLabel();
        backgroundLabel.setBounds(0, 0, (int) size.getWidth(), (int) size.getHeight());
        backgroundLabel.setIcon(new ImageIcon(backgroundImage.getImage().getScaledInstance((int) size.getWidth(), (int) size.getHeight(), Image.SCALE_SMOOTH)));
        return backgroundLabel;
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		new Seventh();
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getActionCommand().equals("B1"))
		{
			String object=null;
			Set s=hm.keySet();
			Iterator i=s.iterator();
			while (i.hasNext()) {
				object = (String) i.next();
				if(hm.get(object).equals("-1")){
					hm.put(object, "B1");
					break;
				}
			}
			System.out.println(object);
			if(l15.getActionCommand().equals(object)){

				l15.setText(B1.getText());
				B1.setEnabled(false);
				//System.out.println(l5.getText());
			}
			else if(l26.getActionCommand().equals(object)){

				l26.setText(B1.getText());
				B1.setEnabled(false);
			}

			else if(l37.getActionCommand().equals(object)){

				l37.setText(B1.getText());
				B1.setEnabled(false);
			}

			else if(l48.getActionCommand().equals(object)){

				l48.setText(B1.getText());
				B1.setEnabled(false);
		}
			
			else if(l59.getActionCommand().equals(object)){

				l59.setText(B1.getText());
				B1.setEnabled(false);
		}
			else if(l60.getActionCommand().equals(object)){

				l60.setText(B1.getText());
				B1.setEnabled(false);
		}
			}



		else if(ae.getActionCommand().equals("B2"))
		{
			String object=null;
			Set s=hm.keySet();
			Iterator i=s.iterator();
			while (i.hasNext()) {
				object = (String) i.next();
				if(hm.get(object).equals("-1")){
					hm.put(object, "B2");
					break;
				}
			}
			System.out.println(object);
			if(l15.getActionCommand().equals(object)){

				l15.setText(B2.getText());
				B2.setEnabled(false);
				System.out.println(l15.getText());
			}
			else if(l26.getActionCommand().equals(object)){

				l26.setText(B2.getText());
				B2.setEnabled(false);
			}

			else if(l37.getActionCommand().equals(object)){

				l37.setText(B2.getText());
				B2.setEnabled(false);
			}

			else if(l48.getActionCommand().equals(object)){

				l48.setText(B2.getText());
				B2.setEnabled(false);
		}
			else if(l59.getActionCommand().equals(object)){

				l59.setText(B2.getText());
				B2.setEnabled(false);
		}
			else if(l60.getActionCommand().equals(object)){

				l60.setText(B2.getText());
				B2.setEnabled(false);
		}
		}


		else if(ae.getActionCommand().equals("B3"))
		{
			String object=null;
			Set s=hm.keySet();
			Iterator i=s.iterator();
			while (i.hasNext()) {
				object = (String) i.next();
				if(hm.get(object).equals("-1")){
					hm.put(object, "B3");
					break;
				}
			}
			System.out.println(object);
			if(l15.getActionCommand().equals(object)){

				l15.setText(B3.getText());
				B3.setEnabled(false);
				System.out.println(l15.getText());
			}
			else if(l26.getActionCommand().equals(object)){

				l26.setText(B3.getText());
				B3.setEnabled(false);
			}

			else if(l37.getActionCommand().equals(object)){

				l37.setText(B3.getText());
				B3.setEnabled(false);
			}

			else if(l48.getActionCommand().equals(object)){

				l48.setText(B3.getText());
				B3.setEnabled(false);
		}
			else if(l59.getActionCommand().equals(object)){

				l59.setText(B3.getText());
				B3.setEnabled(false);
		}
			else if(l60.getActionCommand().equals(object)){

				l60.setText(B3.getText());
				B3.setEnabled(false);
		}
		}



		else if(ae.getActionCommand().equals("B4"))
		{
			String object=null;
			Set s=hm.keySet();
			Iterator i=s.iterator();
			while (i.hasNext()) {
				object = (String) i.next();
				if(hm.get(object).equals("-1")){
					hm.put(object, "B4");
					break;
				}
			}
			System.out.println(object);
			if(l15.getActionCommand().equals(object)){

				l15.setText(B4.getText());
				B4.setEnabled(false);
				System.out.println(l15.getText());
			}
			else if(l26.getActionCommand().equals(object)){

				l26.setText(B4.getText());
				B4.setEnabled(false);
			}

			else if(l37.getActionCommand().equals(object)){

				l37.setText(B4.getText());
				B4.setEnabled(false);
			}

			else if(l48.getActionCommand().equals(object)){

				l48.setText(B4.getText());
				B4.setEnabled(false);
		}
			else if(l59.getActionCommand().equals(object)){

				l59.setText(B4.getText());
				B4.setEnabled(false);
		}
			else if(l60.getActionCommand().equals(object)){

				l60.setText(B4.getText());
				B4.setEnabled(false);
		}
		}


		else if(ae.getActionCommand().equals("B5"))
		{
			String object=null;
			Set s=hm.keySet();
			Iterator i=s.iterator();
			while (i.hasNext()) {
				object = (String) i.next();
				if(hm.get(object).equals("-1")){
					hm.put(object, "B5");
					break;
				}
			}
			System.out.println(object);
			if(l15.getActionCommand().equals(object)){

				l15.setText(B5.getText());
				B5.setEnabled(false);
				System.out.println(l15.getText());
			}
			else if(l26.getActionCommand().equals(object)){

				l26.setText(B5.getText());
				B5.setEnabled(false);
			}

			else if(l37.getActionCommand().equals(object)){

				l37.setText(B5.getText());
				B5.setEnabled(false);
			}

			else if(l48.getActionCommand().equals(object)){

				l48.setText(B5.getText());
				B5.setEnabled(false);
		}
			else if(l59.getActionCommand().equals(object)){

				l59.setText(B1.getText());
				B5.setEnabled(false);
		}
			else if(l60.getActionCommand().equals(object)){

				l60.setText(B5.getText());
				B5.setEnabled(false);
		}
		}

		
		else if(ae.getActionCommand().equals("B6"))
		{
			String object=null;
			Set s=hm.keySet();
			Iterator i=s.iterator();
			while (i.hasNext()) {
				object = (String) i.next();
				if(hm.get(object).equals("-1")){
					hm.put(object, "B6");
					break;
				}
			}
			System.out.println(object);
			if(l15.getActionCommand().equals(object)){

				l15.setText(B6.getText());
				B6.setEnabled(false);
				System.out.println(l15.getText());
			}
			else if(l26.getActionCommand().equals(object)){

				l26.setText(B6.getText());
				B6.setEnabled(false);
			}

			else if(l37.getActionCommand().equals(object)){

				l37.setText(B6.getText());
				B6.setEnabled(false);
			}

			else if(l48.getActionCommand().equals(object)){

				l48.setText(B6.getText());
				B6.setEnabled(false);
		}
			else if(l59.getActionCommand().equals(object)){

				l59.setText(B6.getText());
				B6.setEnabled(false);
		}
			else if(l60.getActionCommand().equals(object)){

				l60.setText(B6.getText());
				B6.setEnabled(false);
		}
		}


		
		

		if(ae.getActionCommand().equals("l15")){
				String object;
				System.out.println("here");
			 object=(String) hm.get("l15");
			 System.out.println(object);
			 l15.setText("");
			if(B1.getActionCommand().equals(object)){
				hm.put("l15", "-1");
				B1.setEnabled(true);
			}
			else if(B2.getActionCommand().equals(object)){
				hm.put("l15", "-1");
				B2.setEnabled(true);
			}

			else if(B3.getActionCommand().equals(object)){
				hm.put("l15", "-1");
				B3.setEnabled(true);
			}

			else if(B4.getActionCommand().equals(object)){
				hm.put("l15", "-1");
				B4.setEnabled(true);
			}
			
			else if(B5.getActionCommand().equals(object)){
				hm.put("l15", "-1");
				B5.setEnabled(true);
			}
				
			else if(B6.getActionCommand().equals(object)){
				hm.put("l15", "-1");
				B6.setEnabled(true);
			}


		}



		else if(ae.getActionCommand().equals("l26")){
			String object;
			System.out.println("here");
		 object=(String) hm.get("l26");
		 System.out.println(object);
		 l26.setText("");
		if(B1.getActionCommand().equals(object)){
			hm.put("l26", "-1");
			B1.setEnabled(true);
		}
		else if(B2.getActionCommand().equals(object)){
			hm.put("l26", "-1");
			B2.setEnabled(true);
		}

		else if(B3.getActionCommand().equals(object)){
			hm.put("l26", "-1");
			B3.setEnabled(true);
		}

		else if(B4.getActionCommand().equals(object)){
			hm.put("l26", "-1");
			B4.setEnabled(true);
		}
		else if(B5.getActionCommand().equals(object)){
			hm.put("l26", "-1");
			B5.setEnabled(true);
		}

		else if(B6.getActionCommand().equals(object)){
			hm.put("l26", "-1");
			B6.setEnabled(true);
		}
	}
	
			
		else if(ae.getActionCommand().equals("l37")){
			String object;
			System.out.println("here");
		 object=(String) hm.get("l37");
		 System.out.println(object);
		 l37.setText("");
		if(B1.getActionCommand().equals(object)){
			hm.put("l37", "-1");
			B1.setEnabled(true);
		}
		else if(B2.getActionCommand().equals(object)){
			hm.put("l37", "-1");
			B2.setEnabled(true);
		}

		else if(B3.getActionCommand().equals(object)){
			hm.put("l37", "-1");
			B3.setEnabled(true);
		}

		else if(B4.getActionCommand().equals(object)){
			hm.put("l37", "-1");
			B4.setEnabled(true);
		}
		else if(B5.getActionCommand().equals(object)){
			hm.put("l37", "-1");
			B5.setEnabled(true);
		}

		else if(B6.getActionCommand().equals(object)){
			hm.put("l37", "-1");
			B6.setEnabled(true);
		}
	}
		
		else if(ae.getActionCommand().equals("l48")){
			String object;
			System.out.println("here");
		 object=(String) hm.get("l48");
		 System.out.println(object);
		 l48.setText("");
		if(B1.getActionCommand().equals(object)){
			hm.put("l48", "-1");
			B1.setEnabled(true);
		}
		else if(B2.getActionCommand().equals(object)){
			hm.put("l48", "-1");
			B2.setEnabled(true);
		}

		else if(B3.getActionCommand().equals(object)){
			hm.put("l48", "-1");
			B3.setEnabled(true);
		}

		else if(B4.getActionCommand().equals(object)){
			hm.put("l48", "-1");
			B4.setEnabled(true);
		}
		else if(B5.getActionCommand().equals(object)){
			hm.put("l48", "-1");
			B5.setEnabled(true);
		}
		else if(B6.getActionCommand().equals(object)){
			hm.put("l48", "-1");
			B6.setEnabled(true);
		}

	}
		
		
		else if(ae.getActionCommand().equals("l59")){
			String object;
			System.out.println("here");
		 object=(String) hm.get("l59");
		 System.out.println(object);
		 l59.setText("");
		if(B1.getActionCommand().equals(object)){
			hm.put("l59", "-1");
			B1.setEnabled(true);
		}
		else if(B2.getActionCommand().equals(object)){
			hm.put("l59", "-1");
			B2.setEnabled(true);
		}

		else if(B3.getActionCommand().equals(object)){
			hm.put("l59", "-1");
			B3.setEnabled(true);
		}

		else if(B4.getActionCommand().equals(object)){
			hm.put("l59", "-1");
			B4.setEnabled(true);
		}
		else if(B5.getActionCommand().equals(object)){
			hm.put("l59", "-1");
			B5.setEnabled(true);
		}
		else if(B6.getActionCommand().equals(object)){
			hm.put("l59", "-1");
			B6.setEnabled(true);
		}

	}
		
		else if(ae.getActionCommand().equals("l60")){
			String object;
			System.out.println("here");
		 object=(String) hm.get("l60");
		 System.out.println(object);
		 l60.setText("");
		if(B1.getActionCommand().equals(object)){
			hm.put("l60", "-1");
			B1.setEnabled(true);
		}
		else if(B2.getActionCommand().equals(object)){
			hm.put("l60", "-1");
			B2.setEnabled(true);
		}

		else if(B3.getActionCommand().equals(object)){
			hm.put("l60", "-1");
			B3.setEnabled(true);
		}

		else if(B4.getActionCommand().equals(object)){
			hm.put("l60", "-1");
			B4.setEnabled(true);
		}
		else if(B5.getActionCommand().equals(object)){
			hm.put("l60", "-1");
			B5.setEnabled(true);
		}
		else if(B6.getActionCommand().equals(object)){
			hm.put("l60", "-1");
			B6.setEnabled(true);
		}

	}
		

		
		if(ae.getActionCommand().equals("Home"))
		{
			First f=new First();


		}
		// TODO Auto-generated method stub
		
	}

}
