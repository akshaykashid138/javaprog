import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/* <applet code="demoo" width="500" height="500">
</applet> */

public class demoo extends Applet implements ItemListener
{
   	String msg="";
	Choice ch;

	public void init()
	{
		this.setBackground(Color.red);
		ch=new Choice();
		ch.add("Marathi");
		ch.add("Hindi");
		ch.add("English");

		add(ch);
		ch.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie)
	{
	    repaint();
	}

	public void paint(Graphics g)
	{
		g.drawString("Select language:",100,100);
		msg=ch.getSelectedItem();
		g.drawString(msg,10,120);
		
	}
}