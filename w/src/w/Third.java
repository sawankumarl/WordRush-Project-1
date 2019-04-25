package w;
import java.awt.*;
import javax.swing.*;


public class Third {
	JFrame f;
 	JTextField tf;
 	JButton B;
 	JLabel l;
 	
 	private JLabel BgLabel;

	public Third() {
		f=new JFrame("Thrid");
		f.setSize(300,400);
		f.setResizable(false);
		f.setLayout(null);
		BgLabel= createBackgroundLabel();
		f.add(BgLabel);

		l=new JLabel("ENTER WORD TO ADD IN DATABASE");
		l.setForeground(Color.orange);
		l.setFont(new Font("Tahoma", Font.BOLD, 14));
		l.setBounds(15,50,280,60);
		BgLabel.add(l);

		tf=new JTextField(10);
		tf.setBounds(68, 160, 160, 30);
		f.add(tf);

		B=new JButton("ADD");
		B.setBounds(68,210,160,30);
		B.setForeground(Color.BLUE);
		BgLabel.add(B);

		f.setVisible(true);
		// TODO Auto-generated constructor stub
	}

	private JLabel createBackgroundLabel() {
		Dimension size = f.getSize();
        ImageIcon backgroundImage = new ImageIcon("Dictionary.gif");
        JLabel backgroundLabel = new JLabel();
        backgroundLabel.setBounds(0, 0, (int) size.getWidth(), (int) size.getHeight());
        backgroundLabel.setIcon(new ImageIcon(backgroundImage.getImage().getScaledInstance((int) size.getWidth(), (int) size.getHeight(), Image.SCALE_SMOOTH)));
        return backgroundLabel;
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		
		new Third();
		// TODO Auto-generated method stub

	}

}
