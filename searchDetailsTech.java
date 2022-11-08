package class_Files;
    
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import static javax.swing.BorderFactory.createLineBorder;

public class searchDetailsTech extends JFrame implements ActionListener
{
	JFrame jf;
    JPanel p1, p2, p3, p4, p5, formpanel;
	JMenuBar mbar;
    JMenu fileMenu, utilitiesMenu, operationMenu, helpMenu;
    JMenuItem openItem, backItem, exitItem;
	JMenuItem gameItem, calculatorItem, timeItem;
	JMenuItem searchItem;
    JMenuItem aboutItem, contactItem;
	JLabel lbCustomer, lbFooter, Tick1, Tick2, Tick3, Tick4, Tick5, Tick6, Tick7, Tick8;
	JButton v1, v2, v3, v4, v5, v6, v7, v8;
	// JScrollPane pane1;
	
	public searchDetailsTech()
	{
		mbar = new JMenuBar();
        
        //JMenu
        fileMenu = new JMenu( "File" );
        fileMenu.setMnemonic( KeyEvent.VK_F );
        fileMenu.setFont(new Font( "Javanese Text", Font.PLAIN, 12 ));
		
		utilitiesMenu = new JMenu( "Utilities" );
                utilitiesMenu.setFont(new Font( "Javanese Text", Font.PLAIN, 12 ));
		operationMenu = new JMenu( "Operation");
                operationMenu.setFont(new Font( "Javanese Text", Font.PLAIN, 12 ));
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
		
		//Items on the operation menu....
		searchItem = new JMenuItem( "Search for a Ticket" );
                searchItem.setFont(new Font( "Javanese Text", Font.PLAIN, 12 ));

        //Items on the View Menu....
        aboutItem = new JMenuItem( "About Us" );
                aboutItem.setFont(new Font( "Javanese Text", Font.PLAIN, 12 ));
        contactItem = new JMenuItem( "Contact Us" );
                contactItem.setFont(new Font( "Javanese Text", Font.PLAIN, 12 ));
		
		searchItem.addActionListener(this);
		gameItem.addActionListener(this);
		exitItem.addActionListener(this);
		backItem.addActionListener(this);
        
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
		
		// pane1 = new JScrollPane();
		// pane1.setVerticalScrollBarPolicy(VERTICAL_SCROLLBAR_ALWAYS);
		
		formpanel = new JPanel();
        formpanel.setBackground( Color.WHITE );
        formpanel.setBounds( 80, 10, 510, 560 );
		formpanel.setBorder(createLineBorder(new Color(0,0,0),1));
		
		Tick1 = new JLabel( "<TicketID:>" );
		Tick1.setForeground( Color.BLACK );
		Tick1.setBounds( 140, 60, 150, 60 );
        Tick1.setFont( new Font( "Javanese Text", Font.PLAIN, 17 ) );
		
		Tick2 = new JLabel( "<TicketID:>" );
		Tick2.setForeground( Color.BLACK );
		Tick2.setBounds( 140, 130, 150, 60 );
        Tick2.setFont( new Font( "Javanese Text", Font.PLAIN, 17 ) );

		Tick3 = new JLabel( "<TicketID:>" );
		Tick3.setForeground( Color.BLACK );
		Tick3.setBounds( 140, 200, 150, 60 );
        Tick3.setFont( new Font( "Javanese Text", Font.PLAIN, 17 ) );
		
		Tick4 = new JLabel( "<TicketID:>" );
		Tick4.setForeground( Color.BLACK );
		Tick4.setBounds( 140, 270, 150, 60 );
        Tick4.setFont( new Font( "Javanese Text", Font.PLAIN, 17 ) );
		
		Tick5 = new JLabel( "<TicketID:>" );
		Tick5.setForeground( Color.BLACK );
		Tick5.setBounds( 140, 340, 150, 60 );
        Tick5.setFont( new Font( "Javanese Text", Font.PLAIN, 17 ) );
		
		Tick6 = new JLabel( "<TicketID:>" );
		Tick6.setForeground( Color.BLACK );
		Tick6.setBounds( 140, 410, 150, 60 );
        Tick6.setFont( new Font( "Javanese Text", Font.PLAIN, 17 ) );
		
		Tick7 = new JLabel( "<TicketID:>" );
		Tick7.setForeground( Color.BLACK );
		Tick7.setBounds( 140, 490, 150, 60 );
        Tick7.setFont( new Font( "Javanese Text", Font.PLAIN, 17 ) );
		
		v1 = new JButton( "View Details" );
		v1.setForeground( Color.WHITE );
		v1.setBackground( Color.ORANGE );
		v1.setBounds( 400, 70, 130, 40 );
        v1.setFont( new Font( "Javanese Text", Font.PLAIN, 17 ) );
		v1.setBorder(createLineBorder(new Color(0,0,0),1));
		
		v2 = new JButton( "View Details" );
		v2.setForeground( Color.WHITE );
		v2.setBackground( Color.DARK_GRAY );
		v2.setBounds( 400, 140, 130, 40 );
        v2.setFont( new Font( "Javanese Text", Font.PLAIN, 17 ) );
		v2.setBorder(createLineBorder(new Color(0,0,0),1));
		
		v3 = new JButton( "View Details" );
		v3.setForeground( Color.WHITE );
		v3.setBackground( Color.ORANGE );
		v3.setBounds( 400, 210, 130, 40 );
        v3.setFont( new Font( "Javanese Text", Font.PLAIN, 17 ) );
		v3.setBorder(createLineBorder(new Color(0,0,0),1));
		
		v4 = new JButton( "View Details" );
		v4.setForeground( Color.WHITE );
		v4.setBackground( Color.DARK_GRAY );
		v4.setBounds( 400, 280, 130, 40 );
        v4.setFont( new Font( "Javanese Text", Font.PLAIN, 17 ) );
		v4.setBorder(createLineBorder(new Color(0,0,0),1));
		
		v5 = new JButton( "View Details" );
		v5.setForeground( Color.WHITE );
		v5.setBackground( Color.ORANGE );
		v5.setBounds( 400, 350, 130, 40 );
        v5.setFont( new Font( "Javanese Text", Font.PLAIN, 17 ) );
		v5.setBorder(createLineBorder(new Color(0,0,0),1));
		
		v6 = new JButton( "View Details" );
		v6.setForeground( Color.WHITE );
		v6.setBackground( Color.DARK_GRAY );
		v6.setBounds( 400, 420, 130, 40 );
        v6.setFont( new Font( "Javanese Text", Font.PLAIN, 17 ) );
		v6.setBorder(createLineBorder(new Color(0,0,0),1));
		
		v7 = new JButton( "View Details" );
		v7.setForeground( Color.WHITE );
		v7.setBackground( Color.ORANGE );
		v7.setBounds( 400, 500, 130, 40 );
        v7.setFont( new Font( "Javanese Text", Font.PLAIN, 17 ) );
		v7.setBorder(createLineBorder(new Color(0,0,0),1));
		
		v1.addActionListener(this);
		v2.addActionListener(this);
		v3.addActionListener(this);
		v4.addActionListener(this);
		v5.addActionListener(this);
		v6.addActionListener(this);
		v7.addActionListener(this);
		
		lbCustomer = new JLabel( "SEARCH DETAILS" );
        lbCustomer.setForeground( Color.WHITE );
        lbCustomer.setFont( new Font( "Javanese Text", Font.BOLD, 17 ) );
        
        lbFooter = new JLabel( "Copyright © 2018 - All Rights Reserved" );
        lbFooter.setForeground( Color.WHITE );
        lbFooter.setFont( new Font( "Javanese Text", Font.PLAIN, 17 ) );
		
	setJMenuBar( mbar );
        
        mbar.add( fileMenu );
	mbar.add( utilitiesMenu );
	mbar.add( operationMenu );
        mbar.add( helpMenu );

        fileMenu.add( openItem );
	fileMenu.add( backItem );
        fileMenu.add( exitItem );
		
	utilitiesMenu.add( gameItem );
	utilitiesMenu.add( calculatorItem );
	utilitiesMenu.add( timeItem );
		
	operationMenu.add( searchItem );

        helpMenu.add( aboutItem );
        helpMenu.add( contactItem );
        
        p1.setLayout( null );
        
        add( p1,( new BorderLayout().CENTER ) );
        add( p2,( new BorderLayout().NORTH ) );
        add( p3,( new BorderLayout().SOUTH ) );
        add( p4,( new BorderLayout().EAST ) );
        add( p5,( new BorderLayout().WEST ) );
        
		p1.add( Tick1 );
		p1.add( Tick2 );
		p1.add( Tick3 );
		p1.add( Tick4 );
		p1.add( Tick5 );
		p1.add( Tick6 );
		p1.add( Tick7 );
		p1.add( v1 );
		p1.add( v2 );
		p1.add( v3 );
		p1.add( v4 );
		p1.add( v5 );
		p1.add( v6 );
		p1.add( v7 );
		p1.add( formpanel );
		// formpanel.add( pane1 );
        p2.add( lbCustomer );
        p3.add( lbFooter );
	}
        public void actionPerformed( ActionEvent e )
        {
			if( e.getSource() == gameItem )
			{
				Menu obj = new Menu();
				obj.addComponent();
				obj.setLocationRelativeTo(null);
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
			else if( e.getSource() == searchItem )
			{
				Dashboard_for_Technicians i = new Dashboard_for_Technicians();
				i.setVisible( true );
				i.setSize( 700, 700 );
				i.setLocationRelativeTo( null );
				i.setResizable( false );
				i.setTitle( "DASHBOARD FOR TECHNICIANS - Michael's Tech" );
				i.setDefaultCloseOperation( EXIT_ON_CLOSE );
				this.dispose();
			}
			else if( e.getSource() == backItem )
			{
				Dashboard_for_Technicians i = new Dashboard_for_Technicians();
                                                                            i.setVisible( true );
                                                                            i.setSize( 700, 750 );
                                                                            i.setLocationRelativeTo( null );
                                                                            i.setResizable( false );
                                                                            i.setTitle( "DASHBOARD FOR TECHNICIANS - Michael's Tech" );
                                                                            i.setDefaultCloseOperation( EXIT_ON_CLOSE );
				this.dispose();
			}
			else if( e.getSource() == v1 )
			{
				resultDetailsTech i = new resultDetailsTech();
				i.setVisible( true );
				i.setSize( 700, 750 );
				i.setLocationRelativeTo( null );
				i.setResizable( false );
				i.setTitle( "RESULT DETAILS - Michael's Tech" );
				i.setDefaultCloseOperation( EXIT_ON_CLOSE );
				this.dispose();
			}
			else if( e.getSource() == v2 )
			{
				resultDetailsTech i = new resultDetailsTech();
				i.setVisible( true );
				i.setSize( 700, 750 );
				i.setLocationRelativeTo( null );
				i.setResizable( false );
				i.setTitle( "RESULT DETAILS - Michael's Tech" );
				i.setDefaultCloseOperation( EXIT_ON_CLOSE );
				this.dispose();
			}
			else if( e.getSource() == v3 )
			{
				resultDetailsTech i = new resultDetailsTech();
				i.setVisible( true );
				i.setSize( 700, 750 );
				i.setLocationRelativeTo( null );
				i.setResizable( false );
				i.setTitle( "RESULT DETAILS - Michael's Tech" );
				i.setDefaultCloseOperation( EXIT_ON_CLOSE );
				this.dispose();
			}
			else if( e.getSource() == v4 )
			{
				resultDetailsTech i = new resultDetailsTech();
				i.setVisible( true );
				i.setSize( 700, 750 );
				i.setLocationRelativeTo( null );
				i.setResizable( false );
				i.setTitle( "RESULT DETAILS - Michael's Tech" );
				i.setDefaultCloseOperation( EXIT_ON_CLOSE );
				this.dispose();
			}
			else if( e.getSource() == v5 )
			{
				resultDetailsTech i = new resultDetailsTech();
				i.setVisible( true );
				i.setSize( 700, 750 );
				i.setLocationRelativeTo( null );
				i.setResizable( false );
				i.setTitle( "RESULT DETAILS - Michael's Tech" );
				i.setDefaultCloseOperation( EXIT_ON_CLOSE );
				this.dispose();
			}
			else if( e.getSource() == v6 )
			{
				resultDetailsTech i = new resultDetailsTech();
				i.setVisible( true );
				i.setSize( 700, 750 );
				i.setLocationRelativeTo( null );
				i.setResizable( false );
				i.setTitle( "RESULT DETAILS - Michael's Tech" );
				i.setDefaultCloseOperation( EXIT_ON_CLOSE );
				this.dispose();
			}
			else if( e.getSource() == v7 )
			{
				resultDetailsTech i = new resultDetailsTech();
				i.setVisible( true );
				i.setSize( 700, 750 );
				i.setLocationRelativeTo( null );
				i.setResizable( false );
				i.setTitle( "RESULT DETAILS - Michael's Tech" );
				i.setDefaultCloseOperation( EXIT_ON_CLOSE );
				this.dispose();
			}
        }
    public static void main( String[] args ){
        searchDetailsTech i = new searchDetailsTech();
        i.setVisible( true );
        i.setSize( 700, 750 );
        i.setLocationRelativeTo( null );
        i.setResizable( false );
        i.setTitle( "SEARCH DETAILS - Michael's Tech" );
        i.setDefaultCloseOperation( EXIT_ON_CLOSE );
    }
}