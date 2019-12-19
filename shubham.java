
import java.awt.*;
import java.awt.event.*;


class shubham extends Frame implements ActionListener
{
		Button b1,b2,b3;
		
		shubham()
		{
			this.setLayout(null);
			
			b1=new Button("red");
			b2=new Button("green");
			b3=new Button("yellow");

			
			b1.setBounds(100,100,70,40);
			b2.setBounds(100,160,70,40);
			b3.setBounds(100,220,70,40);

			add(b1);
			add(b2);
			add(b3);

			b1.addActionListener(this);
			b2.addActionListener(this);
			b3.addActionListener(this);
		


			addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent we)
				{
					System.exit(0);
				}		
			});

		}

		public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==b1)
			{
				this.setBackground(Color.red);
			}
			if(ae.getSource()==b2)
			{
				this.setBackground(Color.green);
			}
			if(ae.getSource()==b3)
			{
				this.setBackground(Color.yellow);
			}
		}
		public static void main(String[] args)
		{
			shubham s=new shubham();		
			s.setTitle("my color");
			s.setSize(400,400);		
			s.setVisible(true);
		}
}


		

