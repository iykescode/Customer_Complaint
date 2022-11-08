package class_Files;

import java.awt.*;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Clock extends Canvas{
	public static final Font BTN_FONT = new Font(Font.DIALOG_INPUT, Font.BOLD, 30);
	public static final Font POINT = new Font(Font.DIALOG_INPUT, Font.BOLD, 50);
	
    public void paint(Graphics g){
	g.fillOval(130, 110, 420, 420);
	
	g.setColor(Color.BLACK);
    g.fillOval(140, 120, 400, 400);

	g.setColor(Color.RED);
	g.fillOval(170, 160, 340, 320);
	
	g.setColor(Color.BLACK);
	g.fillOval(290, 277, 100, 100);
	
	g.setColor(Color.WHITE);
	g.setFont(BTN_FONT);
	g.drawString("12", 320, 150);
	g.drawString("6", 330, 510);
	g.drawString("9", 147, 330);
	g.drawString("3", 515, 330);
	
	g.setColor(Color.WHITE);
	g.setFont(POINT);
	g.drawLine(340,170,340,350);
        g.drawLine(480,380,340,350);
    //g.drawLine(25, 15, 166, 175);
	g.drawString(".", 325, 330);
	
	//g.drawLine(400, 300, 200, 500);
        
	setForeground(Color.LIGHT_GRAY);
    setBackground(Color.BLACK);
    }
    public static void main(String[] args)
    {
        Clock m=new Clock();  
        JFrame f=new JFrame();  
        f.add(m);  
        f.setSize(700,700);
        f.setResizable(false);
        //f.setLayout(null);  
        f.setVisible(true);  
        f.setTitle("Clock");
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }  
}