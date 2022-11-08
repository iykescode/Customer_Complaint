package class_Files;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import static javax.swing.BorderFactory.createLineBorder;
import javax.swing.ButtonGroup;

public class Login extends JFrame implements ActionListener
{
    JFrame jf;
    JPanel p1, p2, p3, p4, p5, userpanel;
    JLabel lbLoginPage, lbFooter, lbUsername, lbPassword;
    JMenuBar mbar;
    JMenu fileMenu, helpMenu;
    JMenuItem openItem, exitItem;
    JMenuItem aboutItem, contactItem;
    JTextField txtUsername;
	JPasswordField txtPassword;
    JRadioButton radExecutive, radTechnician;
    JButton btnSignIn;
    ButtonGroup Group;
    
    public Login()
    {
        mbar = new JMenuBar();

        Group = new ButtonGroup();
        
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
        
        userpanel = new JPanel();
        userpanel.setBackground( Color.WHITE );
        userpanel.setBounds( 100, 200, 480, 250 );
		userpanel.setBorder(createLineBorder(new Color(0,0,0),1));
        
        btnSignIn = new JButton( "Sign In" );
        btnSignIn.setForeground( Color.WHITE );
        btnSignIn.setBackground( Color.ORANGE );
        btnSignIn.setBounds( 320, 395, 100, 40 );
        btnSignIn.setFont( new Font("Javanese Text", Font.PLAIN, 17) );
		btnSignIn.setBorder(createLineBorder(new Color(0,0,0),1));
        
        btnSignIn.addActionListener(this);
        
        lbLoginPage = new JLabel( "LOGIN PAGE" );
        lbLoginPage.setForeground( Color.WHITE );
        lbLoginPage.setFont( new Font("Javanese Text", Font.BOLD, 17) );
		
		lbUsername = new JLabel( "Username:" );
        lbUsername.setForeground( Color.BLACK );
        lbUsername.setFont( new Font("Javanese Text", Font.PLAIN, 17) );
		lbUsername.setBounds( 140, 230, 280, 100 );
		
		txtUsername = new JTextField();
        txtUsername.setForeground( Color.BLACK );
        txtUsername.setFont( new Font("Javanese Text", Font.PLAIN, 17) );
		txtUsername.setBounds( 230, 265, 300, 30 );
		txtUsername.setBorder(createLineBorder(new Color(0,0,0),1));
		
		lbPassword = new JLabel( "Password:" );
        lbPassword.setForeground( Color.BLACK );
        lbPassword.setFont( new Font("Javanese Text", Font.PLAIN, 17) );
		lbPassword.setBounds( 140, 280, 280, 100 );
		
		txtPassword = new JPasswordField();
        txtPassword.setForeground( Color.BLACK );
        txtPassword.setFont( new Font("Javanese Text", Font.PLAIN, 17) );
		txtPassword.setBounds( 230, 315, 300, 30 );
		txtPassword.setBorder(createLineBorder(new Color(0,0,0),1));
		
		radExecutive = new JRadioButton( "Executive" );
        radExecutive.setForeground( Color.BLACK );
        radExecutive.setFont( new Font("Javanese Text", Font.PLAIN, 17) );
		radExecutive.setBounds( 230, 345, 100, 30 );
		
		radTechnician = new JRadioButton( "Technician" );
        radTechnician.setForeground( Color.BLACK );
        radTechnician.setFont( new Font("Javanese Text", Font.PLAIN, 17) );
		radTechnician.setBounds( 410, 345, 120, 30 );
        
        lbFooter = new JLabel( "Copyright © 2018 - All Rights Reserved" );
        lbFooter.setForeground( Color.WHITE );
        lbFooter.setFont( new Font( "Javanese Text", Font.PLAIN, 17 ) );
        
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
        
		p1.add( lbUsername );
		p1.add( txtUsername );
		p1.add( lbPassword );
		p1.add( txtPassword );
		p1.add( radExecutive );
		p1.add( radTechnician );
		Group.add( radTechnician ); Group.add(radExecutive);
		p1.add( btnSignIn );
        p1.add( userpanel );
        p2.add( lbLoginPage );
        p3.add( lbFooter );
    }
    public void actionPerformed( ActionEvent e )
	{
		String Username = txtUsername.getText(); String Password = txtPassword.getText();
        if( e.getSource() == btnSignIn )
		{
			if( Username.equals("Admin") && Password.equals("1234") && radExecutive.isSelected() )
			{
				JOptionPane.showMessageDialog(jf,"Welcome Admin!!!");
				Dashboard_for_Executives d = new Dashboard_for_Executives();
				d.setVisible( true );
				d.setSize( 700, 700 );
				d.setLocationRelativeTo( null );
				d.setResizable( false );
				d.setTitle( "DASHBOARD FOR EXECUTIVES - Michael's Tech" );
				d.setDefaultCloseOperation( EXIT_ON_CLOSE );
				this.dispose();
			}
			else if( !Username.equals("Admin") && !Password.equals("1234") && radExecutive.isSelected() )
			{
				JOptionPane.showMessageDialog(jf,"Username and Password is incorrect");
				Login l = new Login();
				l.setVisible( true );
				l.setSize( 700, 700 );
				l.setLocationRelativeTo( null );
				l.setResizable( false );
				l.setTitle( "" );
				l.setDefaultCloseOperation( EXIT_ON_CLOSE );
				this.dispose();
			}
			else if( Username.equals("Admin") && Password.equals("1234") && !radExecutive.isSelected() )
			{
				JOptionPane.showMessageDialog(jf,"Make sure the right category is ticked!");
				Login l = new Login();
				l.setVisible( true );
				l.setSize( 700, 700 );
				l.setLocationRelativeTo( null );
				l.setResizable( false );
				l.setTitle( "" );
				l.setDefaultCloseOperation( EXIT_ON_CLOSE );
				this.dispose();
			}
			else if( !Username.equals("Admin") && Password.equals("1234") && radExecutive.isSelected() )
			{
				JOptionPane.showMessageDialog(jf,"Username is incorrect!");
				Login l = new Login();
				l.setVisible( true );
				l.setSize( 700, 700 );
				l.setLocationRelativeTo( null );
				l.setResizable( false );
				l.setTitle( "" );
				l.setDefaultCloseOperation( EXIT_ON_CLOSE );
				this.dispose();
			}
			else if( Username.equals("Admin") && !Password.equals("1234") && radExecutive.isSelected() )
			{
				JOptionPane.showMessageDialog(jf,"Password is incorrect!");
				Login l = new Login();
				l.setVisible( true );
				l.setSize( 700, 700 );
				l.setLocationRelativeTo( null );
				l.setResizable( false );
				l.setTitle( "" );
				l.setDefaultCloseOperation( EXIT_ON_CLOSE );
				this.dispose();
			}
			else if( Username.equals("Admin") && Password.equals("012345") && radTechnician.isSelected() )
			{
				JOptionPane.showMessageDialog(jf,"Welcome Admin!!!");
				Dashboard_for_Technicians i = new Dashboard_for_Technicians();
				i.setVisible( true );
				i.setSize( 700, 700 );
				i.setLocationRelativeTo( null );
				i.setResizable( false );
				i.setTitle( "DASHBOARD FOR TECHNICIANS - Michael's Tech" );
				i.setDefaultCloseOperation( EXIT_ON_CLOSE );
				this.dispose();
			}
			else if( !Username.equals("Admin") && !Password.equals("012345") && radTechnician.isSelected() )
			{
				JOptionPane.showMessageDialog(jf,"Username and Password is incorrect!");
				Login l = new Login();
				l.setVisible( true );
				l.setSize( 700, 700 );
				l.setLocationRelativeTo( null );
				l.setResizable( false );
				l.setTitle( "" );
				l.setDefaultCloseOperation( EXIT_ON_CLOSE );
				this.dispose();
			}
			else if( Username.equals("Admin") && !Password.equals("012345") && radTechnician.isSelected() )
			{
				JOptionPane.showMessageDialog(jf,"Password is incorrect!");
				Login l = new Login();
				l.setVisible( true );
				l.setSize( 700, 700 );
				l.setLocationRelativeTo( null );
				l.setResizable( false );
				l.setTitle( "" );
				l.setDefaultCloseOperation( EXIT_ON_CLOSE );
				this.dispose();
			}
			else if( !Username.equals("Admin") && Password.equals("012345") && radTechnician.isSelected() )
			{
				JOptionPane.showMessageDialog(jf,"Username is incorrect!");
				Login l = new Login();
				l.setVisible( true );
				l.setSize( 700, 700 );
				l.setLocationRelativeTo( null );
				l.setResizable( false );
				l.setTitle( "" );
				l.setDefaultCloseOperation( EXIT_ON_CLOSE );
				this.dispose();
			}
			else if( Username.equals("") && Password.equals("") && radExecutive.isSelected())
			{
				JOptionPane.showMessageDialog(jf,"Username and password fields are Empty!");
				Login l = new Login();
				l.setVisible( true );
				l.setSize( 700, 700 );
				l.setLocationRelativeTo( null );
				l.setResizable( false );
				l.setTitle( "" );
				l.setDefaultCloseOperation( EXIT_ON_CLOSE );
				this.dispose();
			}
			else if( Username.equals("Admin") && Password.equals("012345") && !radExecutive.isSelected())
			{
				JOptionPane.showMessageDialog(jf,"Make you tick the right category!");
				Login l = new Login();
				l.setVisible( true );
				l.setSize( 700, 700 );
				l.setLocationRelativeTo( null );
				l.setResizable( false );
				l.setTitle( "" );
				l.setDefaultCloseOperation( EXIT_ON_CLOSE );
				this.dispose();
			}
			else if( Username.equals("") && Password.equals("") && !radExecutive.isSelected() || !radTechnician.isSelected())
			{
				JOptionPane.showMessageDialog(jf,"Make sure the fields are not empty!");
				Login l = new Login();
				l.setVisible( true );
				l.setSize( 700, 700 );
				l.setLocationRelativeTo( null );
				l.setResizable( false );
				l.setTitle( "" );
				l.setDefaultCloseOperation( EXIT_ON_CLOSE );
				this.dispose();
			}
        }
        if( e.getSource() == exitItem )
			{	
				int n = JOptionPane.showConfirmDialog(jf, "Are u sure you want to Quit?", "Confirmation", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
						if (n == JOptionPane.YES_OPTION) 
						{
							System.exit(0);
						}
			}
    }
    public static void main( String[] args ){
        Login l = new Login();
        l.setVisible( true );
        l.setSize( 700, 700 );
        l.setLocationRelativeTo( null );
        l.setResizable( false );
        l.setTitle( "LOGIN PAGE - Michael's Tech" );
        l.setDefaultCloseOperation( EXIT_ON_CLOSE );
    }
}