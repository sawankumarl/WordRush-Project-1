package w;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.*;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

public class Fourth extends JFrame implements ActionListener{

	JFrame f;
	JLabel l1,l2,l3,l4,label;
	JButton B1,B2,B3,B4,HomeButton,l5,l6,l7,l8;
	Connection con;
	java.sql.Statement st;
	ResultSet rs;


	private JLabel BgLabel;
	private TreeMap hm;

	public Fourth() {

		hm=new TreeMap();
		hm.put("l5", "-1");
		hm.put("l6","-1");
		hm.put("l7", "-1");
		hm.put("l8", "-1");



		setSize(305,400);
		setResizable(false);
		setLayout(null);
		BgLabel= createBackgroundLabel();
		add(BgLabel);

		l1=new JLabel("00");
		l1.setBounds(8, 8, 25, 50);
		BgLabel.add(l1);

		l3=new JLabel("Score");
		l3.setBounds(5, 28, 50, 50);
		l3.setForeground(Color.DARK_GRAY);
		l3.setHorizontalAlignment(SwingConstants.CENTER);
		l3.setFont(new Font("Tahoma", Font.BOLD, 16));
		BgLabel.add(l3);

		l2=new JLabel("00");
		l2.setBounds(250, 8, 260, 50);
		BgLabel.add(l2);

		l4=new JLabel("Best");
		l4.setBounds(230, 28, 50, 50);
		l4.setForeground(Color.DARK_GRAY);
		l4.setHorizontalAlignment(SwingConstants.CENTER);
		l4.setFont(new Font("Tahoma", Font.BOLD, 16));
		BgLabel.add(l4);

		l5=new JButton("");
		l5.setBounds(10, 88, 60, 50);
		l5.addActionListener(this);
		l5.setActionCommand("l5");
		BgLabel.add(l5);

		l6=new JButton("");
		l6.setBounds(90, 88, 60, 50);
		l6.addActionListener(this);
		l6.setActionCommand("l6");
		BgLabel.add(l6);

		l7=new JButton("");
		l7.setBounds(170, 88, 60, 50);
		l7.addActionListener(this);
		l7.setActionCommand("l7");
		BgLabel.add(l7);

		l8=new JButton("");
		l8.setBounds(250, 88, 60, 50);
		l8.addActionListener(this);
		l8.setActionCommand("l8");
		BgLabel.add(l8);


		B1=new JButton("B1");
		B1.setBounds(50, 150, 70, 50);
		B1.addActionListener(this);
		B1.setActionCommand("B1");
		BgLabel.add(B1);

		B2=new JButton("B2");
		B2.setBounds(150, 150, 70, 50);
		B2.addActionListener(this);
		B2.setActionCommand("B2");
		BgLabel.add(B2);

		B3=new JButton("B3");
		B3.setBounds(50, 230, 70, 50);
		B3.addActionListener(this);
		B3.setActionCommand("B3");
		BgLabel.add(B3);

		B4=new JButton("B4");
		B4.setBounds(150, 230, 70, 50);
		B4.addActionListener(this);
		B4.setActionCommand("B4");
		BgLabel.add(B4);

		ImageIcon backgroundImages1= new ImageIcon("tt.jpg");
		HomeButton=new JButton("Home");
		HomeButton.setBounds(5,330, 70, 40);
		Dimension sizel=HomeButton.getSize();
		HomeButton.addActionListener(this);
		HomeButton.setIcon(new ImageIcon(backgroundImages1.getImage().getScaledInstance((int) sizel.getWidth(), (int) sizel.getHeight(), Image.SCALE_SMOOTH)));
		HomeButton.setContentAreaFilled(false);
		HomeButton.setBorderPainted(false);
		HomeButton.setActionCommand("Home");
		BgLabel.add(HomeButton);


		label=new JLabel("count:0");
		BgLabel.add(label);
		label.setBounds(230,330,50,50);

		MyListener listener =new MyListener(label);


		 Timer timer = new Timer(1000,listener);
		 timer.start();


		setVisible(true);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Fourth F=new Fourth();
	//	F.createConnection();
		//F.getWord();
		// TODO Auto-generated method stub

	}


/*	private void getWord() {
		try {
			st= con .createStatement();
			rs=null;
			rs=((java.sql.Statement) st).executeQuery("Select * from Database");
			ResultSetMetaData rsmd=rs.getMetaData();
			int column=rsmd.getColumnCount();

			while(rs.next())
			{
				int i;

			}

		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
		// TODO Auto-generated method stub

	}

	public void createConnection(){
		try {
			Class.forName("org.postgresql.Driver");
			con= DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","123456789");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

*/





	private JLabel createBackgroundLabel() {
		Dimension size = getSize();
        ImageIcon backgroundImage = new ImageIcon("first.jpg");
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

	}
		
		if(ae.getActionCommand().equals("Home"))
		{
			First E=new First();
			f.setVisible(false);


		}
		// TODO Auto-generated method stub


}
}


