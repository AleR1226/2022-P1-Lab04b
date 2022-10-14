// Lab04bvst.java
// The AWT Graphics Program
// This is the student, starting version of Lab04b.


import java.awt.*;
import java.applet.*;


public class Lab04bvst extends Applet
{

    public void paint(Graphics g)
    {
        // DRAW CUBE
        g.drawRect (25, 50, 175, 175 );
        g.drawRect (75, 100, 175, 175 );
        g.drawLine(25,50,75,100);
        g.drawLine(200,50,250,100);
        g.drawLine(25,225,75,275);
        g.drawLine(200,225,250,275);
        // DRAW SPHERE
        g.drawOval(50,75,175,175);
        g.drawOval(50,100,175,125);
        g.drawOval(78,75,120,175);
        g.drawOval(50,125,175,75);
        g.drawOval(100,75,75,175);
        g.drawOval(50,150,175,25);
        g.drawOval(125,75,25,175);
        // DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE

        g.drawOval(650,300,250,250);
        g.drawLine(650, 425, 775, 550);
        g.drawLine(650, 425, 860, 333);
        g.drawLine(775, 550, 860, 333);
        g.drawOval(694, 386, 117, 117);
        // DRAW A
        g.fillRect(75, 425, 25, 125);
        g.fillRect(100, 425, 25, 25);
        g.fillRect(100, 475, 25, 25);
        g.fillRect(125, 425, 25, 125);
        // Draw P
        g.fillRect(175, 425, 25, 125);
        g.fillRect(200, 425, 25, 25);
        g.fillRect(225, 425, 25, 75);
        g.fillRect(200, 475, 25, 25);
        //Draw C
        g.fillRect(275, 425, 25, 125);
        g.fillRect(300, 425, 50, 25);
        g.fillRect(300, 525, 50, 25);
        //Draw S
        g.fillRect(375, 425, 25, 75);
        g.fillRect(400, 425, 50, 25);
        g.fillRect(400, 475, 50, 25);
        g.fillRect(425, 475, 25, 75);
        g.fillRect(375, 525, 50, 25);
        // DRAW PACMEN FLOWER
        g.fillOval(525,125, 75, 75);
        g.fillOval(575,75, 75, 75);
        g.fillOval(625,125, 75, 75);
        g.fillOval(575,175, 75, 75);
        g.setColor(Color.white);
        g.fillArc(525,125, 76, 76, 135, 90);
        g.fillArc(575,175, 76, 76, 225, 90);
        g.fillArc(625,125, 76, 76, 315, 90);
        g.fillArc(575,75, 76, 76, 48, 90);



    }

}


