//Programmer's name: Lucas Siqueira
//Course:	CPSC 223j
//Assignment number: 3
//Due date: Oct  20, 2014
//Title: Tic Tac Toe on the Web

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JApplet;
import java.awt.Graphics;

public class mainapplet extends JApplet
{
    private JFrame appletframe;
    
    public void init()
    {
        Container contentpane = this.getContentPane();
        appletframe = new tictacframe(this); //this is a pointer to the applet created by the browser
                                                 //The pointer is passed to the constructor of the frame owned by the applet.
        appletframe.setVisible (true);
        appletframe.setEnabled (true);
    }//End of init
    
    public void paint(Graphics graphicalareaoftheapplet)
    {
        super.paint(graphicalareaoftheapplet);
        graphicalareaoftheapplet.drawRect(15,10,270,20);
        graphicalareaoftheapplet.drawString("This gray area is the applet itself.",25,25);
        graphicalareaoftheapplet.drawString("This area is all graphical -- no direct text can be displayed here.",25,45);
        graphicalareaoftheapplet.drawString("No button or other object can be attached to the applet area.",25,60);
        graphicalareaoftheapplet.drawString("The applet will disappear when the html page is removed.",25,75);
    }//End of method paint

    public void close()
    {
        appletframe.dispose();
        appletframe=null;
    }


	
}
