package class_Files;
    
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import static javax.swing.BorderFactory.createLineBorder;

public class Dashboard_for_Technicians extends JFrame implements ActionListener
{
	JFrame jf;
    JPanel p1, p2, p3, p4, p5, formpanel, searchp1, searchp2, searchp3, searchp4;
	JMenuBar mbar;
    JMenu fileMenu, utilitiesMenu, helpMenu;
    JMenuItem openItem, backItem, exitItem;
	JMenuItem gameItem, calculatorItem, timeItem;
    JMenuItem aboutItem, contactItem;
	JLabel lbCustomer, lbFooter, lbPriority, pr1, pr2, pr3, pr4, lbTicketID1, lbTicketID2, lbTicketID3, lbTicketID4;
	JTextField txtSearch;
	JButton btnSearch, view1, view2, view3, view4;
	JComboBox boxPriority;
	
	public Dashboard_for_Technicians()
	{
		mbar = new JMenuBar();
        
       //JMenu
        fileMenu = new JMenu( "File" );
        fileMenu.setFont(new Font( "Javanese Text", Font.PLAIN, 12 ));
        fileMenu.setMnemonic( KeyEvent.VK_F );
		
		utilitiesMenu = new JMenu( "Utilities" );
                utilitiesMenu.setFont(new Font( "Javanese Text", Font.PLAIN, 12 ));
        helpMenu = new JMenu( "Help" );
        helpMenu.setFont(new Font( "Javanese Text", Font.PLAIN, 12 ));

        //Items on the File Menu....
        openItem = new JMenuItem( "Open...           Ctrl+O" );
        openItem.setFont(new Font( "Javanese Text", Font.PLAIN, 12 ));
		backItem = new JMenuItem( "Back" );
                backItem.setFont(new Font( "Javanese Text", Font.PLAIN, 12 ));
        exitItem = new JMenuItem( "Exit" );
        exitItem.setFont(new Font( "Javanese Text", Font.PLAIN, 12 ));
		
		//Items on the Utilities Menu....
		gameItem = new JMenuItem( "Game" );
                gameItem.setFont(new Font( "Javanese Text", Font.PLAIN, 12 ));
		calculatorItem = new JMenuItem ( "Calculator" );
                calculatorItem.setFont(new Font( "Javanese Text", Font.PLAIN, 12 ));
		timeItem = new JMenuItem( "Time" );
                timeItem.setFont(new Font( "Javanese Text", Font.PLAIN, 12 ));

        //Items on the View Menu....
        aboutItem = new JMenuItem( "About Us" );
        aboutItem.setFont(new Font( "Javanese Text", Font.PLAIN, 12 ));
        contactItem = new JMenuItem( "Contact Us" );
        contactItem.setFont(new Font( "Javanese Text", Font.PLAIN, 12 ));
		
		backItem.addActionListener( this );
		exitItem.addActionListener( this );
		gameItem.addActionListener( this );
                calculatorItem.addActionListener( this );
                timeItem.addActionListener( this );
        
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
		
		formpanel = new JPanel();
        formpanel.setBackground( Color.WHITE );
        formpanel.setBounds( 10, 10, 650, 560 );
		formpanel.setBorder(createLineBorder(new Color(0,0,0),1));
		
		searchp1 = new JPanel();
        searchp1.setBackground( Color.WHITE );
        searchp1.setBounds( 30, 100, 610, 100 );
		searchp1.setBorder(createLineBorder(new Color(0,0,0),1));
		
		searchp2 = new JPanel();
        searchp2.setBackground( Color.WHITE );
        searchp2.setBounds( 30, 220, 610, 100 );
		searchp2.setBorder(createLineBorder(new Color(0,0,0),1));
		
		searchp3 = new JPanel();
        searchp3.setBackground( Color.WHITE );
        searchp3.setBounds( 30, 340, 610, 100 );
		searchp3.setBorder(createLineBorder(new Color(0,0,0),1));
		
		searchp4 = new JPanel();
        searchp4.setBackground( Color.WHITE );
        searchp4.setBounds( 30, 460, 610, 100 );
		searchp4.setBorder(createLineBorder(new Color(0,0,0),1));
		
		lbTicketID1 = new JLabel( "<Ticket ID>" );
		lbTicketID1.setForeground( Color.BLACK );
		lbTicketID1.setFont( new Font("Javanese Text", Font.PLAIN, 17) );
        lbTicketID1.setBounds( 50, 135, 100, 40 );
		
		lbTicketID2 = new JLabel( "<Ticket ID>" );
		lbTicketID2.setForeground( Color.BLACK );
		lbTicketID2.setFont( new Font("Javanese Text", Font.PLAIN, 17) );
        lbTicketID2.setBounds( 50, 255, 100, 40 );
		
		lbTicketID3 = new JLabel( "<Ticket ID>" );
		lbTicketID3.setForeground( Color.BLACK );
		lbTicketID3.setFont( new Font("Javanese Text", Font.PLAIN, 17) );
        lbTicketID3.setBounds( 50, 375, 100, 40 );
		
		lbTicketID4 = new JLabel( "<Ticket ID>" );
		lbTicketID4.setForeground( Color.BLACK );
		lbTicketID4.setFont( new Font("Javanese Text", Font.PLAIN, 17) );
        lbTicketID4.setBounds( 50, 495, 100, 40 );
		
		view1 = new JButton( "View Details" );
		view1.setBackground( Color.ORANGE );
		view1.setForeground( Color.WHITE );
		view1.setFont( new Font("Javanese Text", Font.PLAIN, 17) );
        view1.setBounds( 530, 135, 100, 40 );
		view1.setBorder(createLineBorder(new Color(0,0,0),1));
		
		view2 = new JButton( "View Details" );
		view2.setBackground( Color.DARK_GRAY );
		view2.setForeground( Color.WHITE );
		view2.setFont( new Font("Javanese Text", Font.PLAIN, 17) );
        view2.setBounds( 530, 255, 100, 40 );
		view2.setBorder(createLineBorder(new Color(0,0,0),1));
		
		view3 = new JButton( "View Details" );
		view3.setBackground( Color.ORANGE );
		view3.setForeground( Color.WHITE );
		view3.setFont( new Font("Javanese Text", Font.PLAIN, 17) );
        view3.setBounds( 530, 375, 100, 40 );
		view3.setBorder(createLineBorder(new Color(0,0,0),1));
		
		view4 = new JButton( "View Details" );
		view4.setBackground( Color.DARK_GRAY );
		view4.setForeground( Color.WHITE );
		view4.setFont( new Font("Javanese Text", Font.PLAIN, 17) );
        view4.setBounds( 530, 495, 100, 40 );
		view4.setBorder(createLineBorder(new Color(0,0,0),1));
		
		view1.addActionListener(this);
		view2.addActionListener(this);
		view3.addActionListener(this);
		view4.addActionListener(this);
		
		pr1 = new JLabel( "High" );
		pr1.setForeground( Color.BLACK );
		pr1.setFont( new Font("Javanese Text", Font.PLAIN, 17) );
        pr1.setBounds( 400, 135, 150, 40 );
		
		pr2 = new JLabel( "Low" );
		pr2.setForeground( Color.BLACK );
		pr2.setFont( new Font("Javanese Text", Font.PLAIN, 17) );
        pr2.setBounds( 400, 255, 150, 40 );
		
		pr3 = new JLabel( "Medium" );
		pr3.setForeground( Color.BLACK );
		pr3.setFont( new Font("Javanese Text", Font.PLAIN, 17) );
        pr3.setBounds( 390, 375, 150, 40 );
		
		pr4 = new JLabel( "Low" );
		pr4.setForeground( Color.BLACK );
		pr4.setFont( new Font("Javanese Text", Font.PLAIN, 17) );
        pr4.setBounds( 400, 495, 150, 40 );

		txtSearch = new JTextField();
		txtSearch.setBackground( Color.WHITE );
		txtSearch.setFont( new Font("Javanese Text", Font.PLAIN, 17) );
        txtSearch.setBounds( 30, 30, 250, 40 );
		txtSearch.setBorder(createLineBorder(new Color(0,0,0),1));
		
		lbPriority = new JLabel( "Priority:" );
		lbPriority.setForeground( Color.BLACK );
		lbPriority.setFont( new Font("Javanese Text", Font.PLAIN, 17) );
        lbPriority.setBounds( 475, 28, 150, 40 );
		
		btnSearch = new JButton( "Search" );
		btnSearch.setBackground( Color.WHITE );
		btnSearch.setForeground( Color.BLACK );
		btnSearch.setFont( new Font("Javanese Text", Font.PLAIN, 17) );
        btnSearch.setBounds( 282, 30, 100, 40 );
		btnSearch.setBorder(createLineBorder(new Color(0,0,0),1));
		
		btnSearch.addActionListener( this );
		
		boxPriority = new JComboBox();
		boxPriority.addItem( "High" );
		boxPriority.addItem( "Medium" );
		boxPriority.addItem( "Low" );
		boxPriority.setBackground( Color.WHITE );
		boxPriority.setForeground( Color.BLACK );
		boxPriority.setFont( new Font("Javanese Text", Font.PLAIN, 17) );
        boxPriority.setBounds( 540, 30, 100, 40 );
		boxPriority.setBorder(createLineBorder(new Color(0,0,0),1));
		
	lbCustomer = new JLabel( "DASHBOARD FOR TECHNICIANS" );
        lbCustomer.setForeground( Color.WHITE );
        lbCustomer.setFont( new Font("Javanese Text", Font.BOLD, 17) );
        
        lbFooter = new JLabel( "Copyright © 2018 - All Rights Reserved" );
        lbFooter.setForeground( Color.WHITE );
        lbFooter.setFont( new Font("Javanese Text", Font.PLAIN, 17) );
		
	setJMenuBar( mbar );
        
        mbar.add( fileMenu );
	mbar.add( utilitiesMenu );
        mbar.add( helpMenu );

        fileMenu.add( openItem );
	fileMenu.add( backItem );
        fileMenu.add( exitItem );
		
	utilitiesMenu.add( gameItem );
	utilitiesMenu.add( calculatorItem );
	utilitiesMenu.add( timeItem );

        helpMenu.add( aboutItem );
        helpMenu.add( contactItem );
        
        p1.setLayout( null );
        
        add( p1,( new BorderLayout().CENTER ) );
        add( p2,( new BorderLayout().NORTH ) );
        add( p3,( new BorderLayout().SOUTH ) );
        add( p4,( new BorderLayout().EAST ) );
        add( p5,( new BorderLayout().WEST ) );
        
		p1.add( txtSearch );
		p1.add( btnSearch );
		p1.add( lbPriority );
		p1.add( boxPriority );
		p1.add( lbTicketID1 );
		p1.add( lbTicketID2 );
		p1.add( lbTicketID3 );
		p1.add( lbTicketID4 );
		p1.add( view1 );
		p1.add( view2 );
		p1.add( view3 );
		p1.add( view4 );
		p1.add( pr1 );
		p1.add( pr2 );
		p1.add( pr3 );
		p1.add( pr4 );
		p1.add( searchp1 );
		p1.add( searchp2 );
		p1.add( searchp3 );
		p1.add( searchp4 );
		p1.add( formpanel );
        p2.add( lbCustomer );
        p3.add( lbFooter );
	}
        public void actionPerformed( ActionEvent e )
        {
                    if( e.getSource() == btnSearch )
                    {
                            String result = txtSearch.getText();
                            if( result.equals("") )
                            {
                                    JOptionPane.showMessageDialog(jf,"Make sure the TextField isn't empty!");
                            }
                            else if( !result.equals("") )
                            {
                                    searchDetailsTech i = new searchDetailsTech();
                                    i.setVisible( true );
                                    i.setSize( 700, 750 );
                                    i.setLocationRelativeTo( null );
                                    i.setResizable( false );
                                    i.setTitle( "SEARCH DETAILS - Michael's Tech" );
                                    i.setDefaultCloseOperation( EXIT_ON_CLOSE );
                                                                                            this.dispose();
                            }
                    }
                    else if( e.getSource() == gameItem )
                    {
                            Menu obj = new Menu();
                            obj.addComponent();
                            obj.setLocationRelativeTo(null);
                            this.dispose();
                    }
                     else if( e.getSource() == calculatorItem )
                    {
                            Calculator c = new Calculator();
                            c.setVisible(true);
                            c.setLocationRelativeTo(null);
                            c.setResizable(true);
                            c.setTitle("Calculator");
                    }
                    else if( e.getSource() == timeItem )
                    {
                            Clock m=new Clock();  
                            JFrame f=new JFrame();  
                            f.add(m);  
                            f.setSize(700,700);
                            f.setResizable(false);
                            //f.setLayout(null);  
                            f.setVisible(true);  
                            f.setTitle("Clock");
                    }
					else if( e.getSource() == view1 )
                    {
                            searchDetailsTech i = new searchDetailsTech();
							i.setVisible( true );
							i.setSize( 700, 750 );
							i.setLocationRelativeTo( null );
							i.setResizable( false );
							i.setTitle( "SEARCH DETAILS - Michael's Tech" );
							i.setDefaultCloseOperation( EXIT_ON_CLOSE );
							this.dispose();
                    }
					else if( e.getSource() == view2 )
                    {
                            searchDetailsTech i = new searchDetailsTech();
							i.setVisible( true );
							i.setSize( 700, 750 );
							i.setLocationRelativeTo( null );
							i.setResizable( false );
							i.setTitle( "SEARCH DETAILS - Michael's Tech" );
							i.setDefaultCloseOperation( EXIT_ON_CLOSE );
							this.dispose();
                    }
					else if( e.getSource() == view3 )
                    {
                            searchDetailsTech i = new searchDetailsTech();
							i.setVisible( true );
							i.setSize( 700, 750 );
							i.setLocationRelativeTo( null );
							i.setResizable( false );
							i.setTitle( "SEARCH DETAILS - Michael's Tech" );
							i.setDefaultCloseOperation( EXIT_ON_CLOSE );
							this.dispose();
                    }
					else if( e.getSource() == view4 )
                    {
                            searchDetailsTech i = new searchDetailsTech();
							i.setVisible( true );
							i.setSize( 700, 750 );
							i.setLocationRelativeTo( null );
							i.setResizable( false );
							i.setTitle( "SEARCH DETAILS - Michael's Tech" );
							i.setDefaultCloseOperation( EXIT_ON_CLOSE );
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
                    else if( e.getSource() == backItem )
                    {
                            int n = JOptionPane.showConfirmDialog(jf, "Are u sure you want to Logout?", "Confirmation", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
                                    if (n == JOptionPane.YES_OPTION) 
                                    {
                                            Login l = new Login();
                                            l.setVisible( true );
                                            l.setSize( 700, 700 );
                                            l.setLocationRelativeTo( null );
                                            l.setResizable( false );
                                            l.setTitle( "LOGIN PAGE - Michael's Tech" );
                                            l.setDefaultCloseOperation( EXIT_ON_CLOSE );
                                            this.dispose();
                                    }
                    }
        }
    public static void main( String[] args ){
        Dashboard_for_Technicians i = new Dashboard_for_Technicians();
        i.setVisible( true );
        i.setSize( 700, 750 );
        i.setLocationRelativeTo( null );
        i.setResizable( false );
        i.setTitle( "DASHBOARD FOR TECHNICIANS - Michael's Tech" );
        i.setDefaultCloseOperation( EXIT_ON_CLOSE );
    }
}