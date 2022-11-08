package class_Files;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Lesson29 extends JFrame implements ActionListener{
    
    JButton but1, but2, but3, but4, but5, but6,
        but7, but8, but9, but0, butPlus, butMinus,butEqu,butMul,
        clearAll;
    
    JTextField textResult;
    
    int num1, num2;
    
   public Lesson29(){
        
        // Create the frame, position it and handle closing it
        
        this.setSize(400,400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Calculator");
        
        JPanel thePanel = new JPanel();
        
    
        thePanel.setLayout(new GridBagLayout());
        

        
        GridBagConstraints gridConstraints = new GridBagConstraints();
        
        // Define the x position of the component
        
        gridConstraints.gridx = 1;
        
        // Define the y position of the component
        
        gridConstraints.gridy = 1;
        
        // Number of columns the component takes up
        
        gridConstraints.gridwidth = 1;
        
        // Number of rows the component takes up
        
        gridConstraints.gridheight = 1;
        
        gridConstraints.weightx = 50;

        gridConstraints.weighty = 100;
        
        // Defines padding top, left, bottom, right
        
        gridConstraints.insets = new Insets(5,5,5,5);
        

        gridConstraints.anchor = GridBagConstraints.CENTER;
        

        gridConstraints.fill = GridBagConstraints.BOTH;
        
        textResult = new JTextField(20);
        
        // Defines the font to use in the text field
        
        Font font = new Font("Helvetica", Font.PLAIN, 18);
        textResult.setFont(font);
        
        but1 = new JButton("1");
        but2 = new JButton("2");
        but3 = new JButton("3");
        but4 = new JButton("4");
        but5 = new JButton("5");
        but6 = new JButton("6");
        but7 = new JButton("7");
        but8 = new JButton("8");
        but9 = new JButton("9");
        butPlus = new JButton("+");
        but0 = new JButton("0");
        butMinus = new JButton("-");
        clearAll = new JButton("C");
        butEqu = new JButton("=");
        butMul = new JButton("x");
        
        but1.addActionListener(this);
        but2.addActionListener(this);
        but3.addActionListener(this);
        but4.addActionListener(this);
        but5.addActionListener(this);
        but6.addActionListener(this);
        but7.addActionListener(this);
        but8.addActionListener(this);
        but9.addActionListener(this);
        but0.addActionListener(this);
        butPlus.addActionListener(this);
        butMinus.addActionListener(this);
        clearAll.addActionListener(this);
        
        thePanel.add(clearAll,gridConstraints);
        gridConstraints.gridwidth = 20;
        gridConstraints.gridx = 5;
        thePanel.add(textResult,gridConstraints);
        gridConstraints.gridwidth = 1;
        gridConstraints.gridx = 1;
        gridConstraints.gridy = 2;
        thePanel.add(but1,gridConstraints);
        gridConstraints.gridx = 5;
        thePanel.add(but2,gridConstraints);
        gridConstraints.gridx = 9;
        thePanel.add(but3,gridConstraints);
        gridConstraints.gridx = 1;
        gridConstraints.gridy = 3;
        thePanel.add(but4,gridConstraints);
        gridConstraints.gridx = 5;
        thePanel.add(but5,gridConstraints);
        gridConstraints.gridx = 9;
        thePanel.add(but6,gridConstraints);
        gridConstraints.gridx = 1;
        gridConstraints.gridy = 4;
        thePanel.add(but7,gridConstraints);
        gridConstraints.gridx = 5;
        thePanel.add(but8,gridConstraints);
        gridConstraints.gridx = 9;
        thePanel.add(but9,gridConstraints);
        gridConstraints.gridx = 1;
        gridConstraints.gridy = 5;
        thePanel.add(butMul,gridConstraints);
        gridConstraints.gridx = 3;
        thePanel.add(butPlus,gridConstraints);
        gridConstraints.gridx = 5;
        thePanel.add(but0,gridConstraints);
        gridConstraints.gridx = 9;
        thePanel.add(butMinus,gridConstraints);
        gridConstraints.gridx = 13;
        thePanel.add(butEqu,gridConstraints);
        this.add(thePanel);
        
        this.setVisible(true);
        
    } // END OF Lesson29 CONSTRUCTOR
   
   public void actionPerformed(ActionEvent e)
   {
       if( e.getSource() == but1 )
       {
            String one = textResult.getText();
            textResult.setText(one += "1");
       }
       else if( e.getSource() == but2 )
       {
            String one = textResult.getText();
            textResult.setText(one += "2");
       }
       else if( e.getSource() == but3 )
       {
            String one = textResult.getText();
            textResult.setText(one += "3");
       }
       else if( e.getSource() == but4 )
       {
            String one = textResult.getText();
            textResult.setText(one += "4");
       }
       else if( e.getSource() == but5 )
       {
            String one = textResult.getText();
            textResult.setText(one += "5");
       }
       else if( e.getSource() == but6 )
       {
            String one = textResult.getText();
            textResult.setText(one += "6");
       }
       else if( e.getSource() == but7 )
       {
            String one = textResult.getText();
            textResult.setText(one += "7");
       }
       else if( e.getSource() == but8 )
       {
            String one = textResult.getText();
            textResult.setText(one += "8");
       }
       else if( e.getSource() == but9 )
       {
            String one = textResult.getText();
            textResult.setText(one += "9");
       }
       else if( e.getSource() == but0 )
       {
            String one = textResult.getText();
            textResult.setText(one += "0");
       }
       else if( e.getSource() == butPlus )
       {
            String one = textResult.getText();
            textResult.setText(one += "+");
       }
       else if( e.getSource() == butMinus )
       {
            String one = textResult.getText();
            textResult.setText(one += "-");
       }
       else if( e.getSource() == clearAll )
       {
            String one = textResult.getText();
            textResult.setText("");
       }
   }
   
       public static void main(String[] args){
        
        new Lesson29();
        
    }
    
} // END OF Lesson29 CLASS
