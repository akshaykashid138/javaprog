import java.applet.*;
import java.awt.*;
/* <applet code="MyApplet" height="400" width="400">
   </applet>	
*/

public class MyApplet extends Applet
{
	Label l1,l2;
	TextField t1,t2;
	Button b1,b2;

	public void init()
	{
	   l1=new Label("User");
	   l2=new Label("Password");
	   t1=new TextField(20);
	  t2=new TextField(20);            
	    b1=new Button("Save");
	    b2=new Button("Clear");
		
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b1);
		add(b2);
	}
}
