import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/* <applet code="shubhu" width="500" height="500">
</applet> */

public class shubhu extends Applet implements ActionListener
{
		Button b1,b2,b3;
		
		public void init()
		{
			b1=new Button("red");
			b2=new Button("green");
			b3=new Button("yellow");

			add(b1);
			add(b2);
			add(b3);
			
			b1.addActionListener(this);
			b2.addActionListener(this);
			b3.addActionListener(this);
		}

		public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==b1)
			{
				setBackground(Color.red);
			}
			if(ae.getSource()==b2)
			{
				setBackground(Color.green);
			}
			if(ae.getSource()==b3)
			{
				setBackground(Color.yellow);
			}
		}
}


		

