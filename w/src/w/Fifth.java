package w;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import java.util.*;

public class Fifth extends JFrame implements ActionListener{
	JFrame f;
	JLabel l1,l2,l3,l4,label;
	JButton B1,B2,B3,B4,B5,HomeButton,l5,l6,l7,l8,l9;
	
	private JLabel BgLabel;
	private TreeMap hm;

	public Fifth() {
		hm=new TreeMap();
		hm.put("l5", "-1");
		hm.put("l6","-1");
		hm.put("l7", "-1");
		hm.put("l8", "-1");
		hm.put("l9", "-1");
		
		new JFrame("Fifth");
		setSize(350,400);
		setResizable(false);
		setLayout(null);
		BgLabel= createBackgroundLabel();
		add(BgLabel);

		l1=new JLabel("00");
		l1.setBounds(8, 8, 25, 50);
		l1.setForeground(Color.blue);
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setFont(new Font("Tahoma", Font.BOLD, 16));
		BgLabel.add(l1);

		l3=new JLabel("Score");
		l3.setBounds(8, 28, 50, 50);
		l3.setForeground(Color.GREEN);
		l3.setHorizontalAlignment(SwingConstants.CENTER);
		l3.setFont(new Font("Tahoma", Font.BOLD, 16));
		BgLabel.add(l3);

		l2=new JLabel("00");
		l2.setBounds(250, 8, 25, 50);
		l2.setForeground(Color.GREEN);
		l2.setHorizontalAlignment(SwingConstants.CENTER);
		l2.setFont(new Font("Tahoma", Font.BOLD, 16));
		BgLabel.add(l2);

		l4=new JLabel("Best");
		l4.setBounds(250, 28, 50, 50);
		l4.setForeground(Color.GREEN);
		l4.setHorizontalAlignment(SwingConstants.CENTER);
		l4.setFont(new Font("Tahoma", Font.BOLD, 16));
		BgLabel.add(l4);

		l5=new JButton("");
		l5.setBounds(10, 88, 50, 50);
		l5.addActionListener(this);
		l5.setActionCommand("l5");
		BgLabel.add(l5);

		l6=new JButton("");
		l6.setBounds(80, 88, 50, 50);
		l6.addActionListener(this);
		l6.setActionCommand("l6");
		BgLabel.add(l6);

		l7=new JButton("");
		l7.setBounds(150, 88, 50, 50);
		l7.addActionListener(this);
		l7.setActionCommand("l7");
		BgLabel.add(l7);

		l8=new JButton("");
		l8.setBounds(210, 88, 50, 50);
		l8.addActionListener(this);
		l8.setActionCommand("l8");
		BgLabel.add(l8);

		l9=new JButton("");
		l9.setBounds(280, 88, 50, 50);
		l9.addActionListener(this);
		l9.setActionCommand("l9");
		BgLabel.add(l9);

		B1=new JButton("B1");
		B1.setBounds(45, 150, 50, 50);
		B1.addActionListener(this);
		BgLabel.add(B1);

		B2=new JButton("B2");
		B2.setBounds(190, 150, 50, 50);
		B2.addActionListener(this);
		BgLabel.add(B2);

		B3=new JButton("B3");
		B3.setBounds(45, 250, 50, 50);
		B3.addActionListener(this);
		BgLabel.add(B3);

		B4=new JButton("B4");
		B4.setBounds(190, 250, 50, 50);
		B4.addActionListener(this);
		BgLabel.add(B4);

		B5=new JButton("B5");
		B5.setBounds(120, 200, 50, 50);
		B5.addActionListener(this);
		BgLabel.add(B5);

		HomeButton=new JButton("Home");
		HomeButton.setBounds(0,350, 70, 20);
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
		


		setVisible(true);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Fifth();
	}

	private JLabel createBackgroundLabel() {
		Dimension size = getSize();
        ImageIcon backgroundImage = new ImageIcon("kids.jpg");
        JLabel backgroundLabel = new JLabel();
        backgroundLabel.setBounds(0, 0, (int) size.getWidth(), (int) size.getHeight());
        backgroundLabel.setIcon(new ImageIcon(backgroundImage.getImage().getScaledInstance((int) size.getWidth(), (int) size.getHeight(), Image.SCALE_SMOOTH)));
        return backgroundLabel;
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
			//System.out.println(object);
			if(l5.getActionCommand().equals(object)){

				l5.setText(B1.getText());
				B1.setEnabled(false);
				//System.out.println(l5.getText());
			}
			else if(l6.getActionCommand().equals(object)){

				l6.setText(B1.getText());
				B1.setEnabled(false);
			}

			else if(l7.getActionCommand().equals(object)){

				l7.setText(B1.getText());
				B1.setEnabled(false);
			}

			else if(l8.getActionCommand().equals(object)){

				l8.setText(B1.getText());
				B1.setEnabled(false);
		}
			
			else if(l9.getActionCommand().equals(object)){

				l9.setText(B1.getText());
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
			if(l5.getActionCommand().equals(object)){

				l5.setText(B2.getText());
				B2.setEnabled(false);
				System.out.println(l5.getText());
			}
			else if(l6.getActionCommand().equals(object)){

				l6.setText(B2.getText());
				B2.setEnabled(false);
			}

			else if(l7.getActionCommand().equals(object)){

				l7.setText(B2.getText());
				B2.setEnabled(false);
			}

			else if(l8.getActionCommand().equals(object)){

				l8.setText(B2.getText());
				B2.setEnabled(false);
		}
			else if(l9.getActionCommand().equals(object)){

				l9.setText(B1.getText());
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
			if(l5.getActionCommand().equals(object)){

				l5.setText(B3.getText());
				B3.setEnabled(false);
				System.out.println(l5.getText());
			}
			else if(l6.getActionCommand().equals(object)){

				l6.setText(B3.getText());
				B3.setEnabled(false);
			}

			else if(l7.getActionCommand().equals(object)){

				l7.setText(B3.getText());
				B3.setEnabled(false);
			}

			else if(l8.getActionCommand().equals(object)){

				l8.setText(B3.getText());
				B3.setEnabled(false);
		}
			else if(l9.getActionCommand().equals(object)){

				l9.setText(B1.getText());
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
			if(l5.getActionCommand().equals(object)){

				l5.setText(B4.getText());
				B4.setEnabled(false);
				System.out.println(l5.getText());
			}
			else if(l6.getActionCommand().equals(object)){

				l6.setText(B4.getText());
				B4.setEnabled(false);
			}

			else if(l7.getActionCommand().equals(object)){

				l7.setText(B4.getText());
				B4.setEnabled(false);
			}

			else if(l8.getActionCommand().equals(object)){

				l8.setText(B4.getText());
				B4.setEnabled(false);
		}
			else if(l9.getActionCommand().equals(object)){

				l9.setText(B1.getText());
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
			if(l5.getActionCommand().equals(object)){

				l5.setText(B5.getText());
				B5.setEnabled(false);
				System.out.println(l5.getText());
			}
			else if(l6.getActionCommand().equals(object)){

				l6.setText(B5.getText());
				B5.setEnabled(false);
			}

			else if(l7.getActionCommand().equals(object)){

				l7.setText(B5.getText());
				B5.setEnabled(false);
			}

			else if(l8.getActionCommand().equals(object)){

				l8.setText(B5.getText());
				B5.setEnabled(false);
		}
			else if(l9.getActionCommand().equals(object)){

				l9.setText(B1.getText());
				B5.setEnabled(false);
		}
		}



		if(ae.getActionCommand().equals("l5")){
				String object;
				System.out.println("here");
			 object=(String) hm.get("l5");
			 System.out.println(object);
			 l5.setText("");
			if(B1.getActionCommand().equals(object)){
				hm.put("l5", "-1");
				B1.setEnabled(true);
			}
			else if(B2.getActionCommand().equals(object)){
				hm.put("l5", "-1");
				B2.setEnabled(true);
			}

			else if(B3.getActionCommand().equals(object)){
				hm.put("l5", "-1");
				B3.setEnabled(true);
			}

			else if(B4.getActionCommand().equals(object)){
				hm.put("l5", "-1");
				B4.setEnabled(true);
			}
			
			else if(B5.getActionCommand().equals(object)){
				hm.put("l5", "-1");
				B5.setEnabled(true);
			}


		}



		else if(ae.getActionCommand().equals("l6")){
			String object;
			System.out.println("here");
		 object=(String) hm.get("l6");
		 System.out.println(object);
		 l6.setText("");
		if(B1.getActionCommand().equals(object)){
			hm.put("l6", "-1");
			B1.setEnabled(true);
		}
		else if(B2.getActionCommand().equals(object)){
			hm.put("l6", "-1");
			B2.setEnabled(true);
		}

		else if(B3.getActionCommand().equals(object)){
			hm.put("l6", "-1");
			B3.setEnabled(true);
		}

		else if(B4.getActionCommand().equals(object)){
			hm.put("l6", "-1");
			B4.setEnabled(true);
		}
		else if(B5.getActionCommand().equals(object)){
			hm.put("l6", "-1");
			B5.setEnabled(true);
		}


	}
	
			
		else if(ae.getActionCommand().equals("l7")){
			String object;
			System.out.println("here");
		 object=(String) hm.get("l7");
		 System.out.println(object);
		 l7.setText("");
		if(B1.getActionCommand().equals(object)){
			hm.put("l7", "-1");
			B1.setEnabled(true);
		}
		else if(B2.getActionCommand().equals(object)){
			hm.put("l7", "-1");
			B2.setEnabled(true);
		}

		else if(B3.getActionCommand().equals(object)){
			hm.put("l7", "-1");
			B3.setEnabled(true);
		}

		else if(B4.getActionCommand().equals(object)){
			hm.put("l7", "-1");
			B4.setEnabled(true);
		}
		else if(B5.getActionCommand().equals(object)){
			hm.put("l7", "-1");
			B5.setEnabled(true);
		}


	}
		
		else if(ae.getActionCommand().equals("l8")){
			String object;
			System.out.println("here");
		 object=(String) hm.get("l8");
		 System.out.println(object);
		 l8.setText("");
		if(B1.getActionCommand().equals(object)){
			hm.put("l8", "-1");
			B1.setEnabled(true);
		}
		else if(B2.getActionCommand().equals(object)){
			hm.put("l8", "-1");
			B2.setEnabled(true);
		}

		else if(B3.getActionCommand().equals(object)){
			hm.put("l8", "-1");
			B3.setEnabled(true);
		}

		else if(B4.getActionCommand().equals(object)){
			hm.put("l8", "-1");
			B4.setEnabled(true);
		}
		else if(B5.getActionCommand().equals(object)){
			hm.put("l8", "-1");
			B5.setEnabled(true);
		}


	}
		
		
		else if(ae.getActionCommand().equals("l9")){
			String object;
			System.out.println("here");
		 object=(String) hm.get("l9");
		 System.out.println(object);
		 l9.setText("");
		if(B1.getActionCommand().equals(object)){
			hm.put("l9", "-1");
			B1.setEnabled(true);
		}
		else if(B2.getActionCommand().equals(object)){
			hm.put("l9", "-1");
			B2.setEnabled(true);
		}

		else if(B3.getActionCommand().equals(object)){
			hm.put("l9", "-1");
			B3.setEnabled(true);
		}

		else if(B4.getActionCommand().equals(object)){
			hm.put("l9", "-1");
			B4.setEnabled(true);
		}
		else if(B5.getActionCommand().equals(object)){
			hm.put("l9", "-1");
			B5.setEnabled(true);
		}


	}
		

		
		if(ae.getActionCommand().equals("Home"))
		{
			First f=new First();


		}

}
		
		
	}


