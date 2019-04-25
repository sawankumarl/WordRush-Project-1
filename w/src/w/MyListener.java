package w;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComponent;
import javax.swing.JLabel;

public class MyListener implements ActionListener {
	private int count=0;
	private JLabel label;
	
	
	
	
		public MyListener(JLabel label) {
		this.label=label;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent a) {
		count++;
		label.setText("count"+count);
		
		
		//if(count==10)
			//	{
				//	label.setText("hi");
					 
					//Eigth f=new Eigth();
				//}
				
		// TODO Auto-generated method stub
		
	}

	public int getCount() {
		return count;
	}

	

}
