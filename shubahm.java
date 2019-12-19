
import java.awt.*;
import java.awt.event.*;


class shubham extends frame implements ActionListener
{
		Button b1,b2,b3;
		
		shubham()
		{
			this.setLayout(null);
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


		add windowListener(new window.Adoptor())
		{
			public void windowClosing(windowEvent we)
			{
				sy.exit();
			}		
		};

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
		public static void main(String [] args)

		{
			shubham s=new shubham();'		
			s.setTitle("my color");
			s.setSize(400,400);		
			s.setVisible
		}
}


		

