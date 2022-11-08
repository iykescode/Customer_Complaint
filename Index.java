package class_Files;
    
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import static javax.swing.BorderFactory.createLineBorder;

public class Index extends JFrame implements ActionListener{
    JFrame jf;
    JPanel p1, p2, p3, p4, p5, btnpanel;
    JLabel lbCustomer, lbFooter, lbWelcome;
    JMenuBar mbar;
    JMenu fileMenu, helpMenu;
    JMenuItem openItem, exitItem;
    JMenuItem aboutItem, contactItem;
    JButton btnContinue;
    
    public Index(){
        mbar = new JMenuBar();
        
        //JMenu
        fileMenu = new JMenu( "File" );
        fileMenu.setFont(new Font( "Javanese Text", Font.PLAIN, 12 ));
        fileMenu.setMnemonic( KeyEvent.VK_F );

        helpMenu = new JMenu( "Help" );
        helpMenu.setFont(new Font( "Javanese Text", Font.PLAIN, 12 ));

        //Items on the File Menu....
        openItem = new JMenuItem( "Open...           Ctrl+O" );
        openItem.setFont(new Font( "Javanese Text", Font.PLAIN, 12 ));
        exitItem = new JMenuItem( "Exit" );
        exitItem.setFont(new Font( "Javanese Text", Font.PLAIN, 12 ));

        //Items on the View Menu....
        aboutItem = new JMenuItem( "About Us" );
        aboutItem.setFont(new Font( "Javanese Text", Font.PLAIN, 12 ));
        contactItem = new JMenuItem( "Contact Us" );
        contactItem.setFont(new Font( "Javanese Text", Font.PLAIN, 12 ));
		
		exitItem.addActionListener( this );
        
        p1 = new JPanel();
        p1.setBackground( Color.DARK_GRAY );
        
        p2 = new JPanel();
        p2.setBackground( Color.ORANGE );
		p2.setBorder(createLineBorder(new Color(0,0,0),1));
        
        p3 = new JPanel();
        p3.setBackground( Color.ORANGE );
		p3.setBorder(createLineBorder(new Color(0,0,0),1));
        
        p4 = new JPanel();
        p4.setBackground( Color.ORANGE );
		p4.setBorder(createLineBorder(new Color(0,0,0),1));
        
        p5 = new JPanel();
        p5.setBackground( Color.ORANGE );
		p5.setBorder(createLineBorder(new Color(0,0,0),1));
        
        btnpanel = new JPanel();
        btnpanel.setBackground( Color.WHITE );
        btnpanel.setBounds( 100, 300, 480, 150 );
		btnpanel.setBorder(createLineBorder(new Color(0,0,0),1));
        
        btnContinue = new JButton( "Continue" );
        btnContinue.setForeground( Color.WHITE );
        btnContinue.setBackground( Color.ORANGE );
        btnContinue.setBounds( 140, 325, 400, 100 );
        btnContinue.setFont( new Font("Javanese Text", Font.PLAIN, 17) );
		btnContinue.setBorder(createLineBorder(new Color(0,0,0),1));
        
        btnContinue.addActionListener(this);
        
        lbWelcome = new JLabel( "Welcome to Michael's Tech Customer Complaint" );
        lbWelcome.setForeground( Color.WHITE );
        lbWelcome.setFont( new Font("SANS_SERIF", Font.BOLD, 25) );
        lbWelcome.setBounds( 50, 50, 650, 150 );
        
        lbCustomer = new JLabel( "CUSTOMER COMPLAINT" );
        lbCustomer.setForeground( Color.WHITE );
        lbCustomer.setFont( new Font("Javanese Text", Font.BOLD, 17) );
        
        lbFooter = new JLabel( "Copyright © 2018 - All Rights Reserved" );
        lbFooter.setForeground( Color.WHITE );
        lbFooter.setFont( new Font( "Javanese Text", Font.PLAIN, 17) );
        
        setJMenuBar( mbar );
        
        mbar.add( fileMenu );
        mbar.add( helpMenu );

        fileMenu.add( openItem );
        fileMenu.add( exitItem );

        helpMenu.add( aboutItem );
        helpMenu.add( contactItem );
        
        p1.setLayout( null );
        
        add( p1,( new BorderLayout().CENTER ) );
        add( p2,( new BorderLayout().NORTH ) );
        add( p3,( new BorderLayout().SOUTH ) );
        add( p4,( new BorderLayout().EAST ) );
        add( p5,( new BorderLayout().WEST ) );
        
        p1.add( lbWelcome );
        p1.add( btnpanel );
        p1.add( btnContinue );
        p2.add( lbCustomer );
        p3.add( lbFooter );
    }
    public void actionPerformed( ActionEvent e ){
        if( e.getSource() == btnContinue ){
            Login l = new Login();
            l.setVisible( true );
            l.setSize( 700, 700 );
            l.setLocationRelativeTo( null );
            l.setResizable( false );
            l.setTitle( "" );
            l.setDefaultCloseOperation( EXIT_ON_CLOSE );
			this.dispose();
        }
		else if( e.getSource() == exitItem )
			{	
				int n = JOptionPane.showConfirmDialog(jf, "Are u sure you want to Quit?", "Confirmation", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
						if (n == JOptionPane.YES_OPTION) 
						{
							System.exit(0);
						}
			}
    }
    public static void main( String[] args ){
        Index i = new Index();
        i.setVisible( true );
        i.setSize( 700, 700 );
        i.setLocationRelativeTo( null );
        i.setResizable( false );
        i.setTitle( "Michael's Tech" );
        i.setDefaultCloseOperation( EXIT_ON_CLOSE );
    }
}