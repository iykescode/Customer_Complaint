package class_Files;
    
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import static javax.swing.BorderFactory.createLineBorder;

public class SearchTicket extends JFrame implements ActionListener
{
	JFrame jf;
    JPanel p1, p2, p3, p4, p5, formpanel;
	JMenuBar mbar;
    JMenu fileMenu, utilitiesMenu, operationMenu, helpMenu;
    JMenuItem openItem, backItem, exitItem;
	JMenuItem gameItem, calculatorItem, timeItem;
	JMenuItem createItem, searchItem;
    JMenuItem aboutItem, contactItem;
	JLabel lbCustomer, lbFooter, lbTicketID, lbpriority;
    JTextField txtTicketID;
    JComboBox priority;
    JButton btnSearch;
	
	public SearchTicket()
	{
		mbar = new JMenuBar();
        
        //JMenu
        fileMenu = new JMenu( "File" );
        fileMenu.setFont(new Font( "Javanese Text", Font.PLAIN, 12 ));
        fileMenu.setMnemonic( KeyEvent.VK_F );
		
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
		createItem = new JMenuItem( "Create a New Ticket" );
                createItem.setFont(new Font( "Javanese Text", Font.PLAIN, 12 ));
		searchItem = new JMenuItem( "Search for a Ticket" );
                searchItem.setFont(new Font( "Javanese Text", Font.PLAIN, 12 ));

        //Items on the View Menu....
        aboutItem = new JMenuItem( "About Us" );
        aboutItem.setFont(new Font( "Javanese Text", Font.PLAIN, 12 ));
        contactItem = new JMenuItem( "Contact Us" );
        contactItem.setFont(new Font( "Javanese Text", Font.PLAIN, 12 ));
        
                     createItem.addActionListener(this);
                    searchItem.addActionListener(this);
                    gameItem.addActionListener(this);
                    exitItem.addActionListener(this);
                    backItem.addActionListener(this);
                    calculatorItem.addActionListener(this);
                    timeItem.addActionListener(this);
        
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
        formpanel.setBounds( 10, 200, 650, 190 );
		formpanel.setBorder(createLineBorder(new Color(0,0,0),1));
                
                lbTicketID = new JLabel( "TicketID:" );
        lbTicketID.setForeground( Color.BLACK );
        lbTicketID.setBounds( 140, 170, 650, 190 );
	lbTicketID.setFont( new Font( "Javanese Text", Font.PLAIN, 17 ) );
        
                txtTicketID = new JTextField();
        txtTicketID.setForeground( Color.BLACK );
        txtTicketID.setBounds( 60, 280, 250, 35 );
        txtTicketID.setFont( new Font( "Javanese Text", Font.PLAIN, 17 ) );
		txtTicketID.setBorder(createLineBorder(new Color(0,0,0),1));
                
                lbpriority = new JLabel( "Priority:" );
        lbpriority.setForeground( Color.BLACK );
        lbpriority.setBounds( 460, 170, 650, 190 );
	lbpriority.setFont( new Font( "Javanese Text", Font.PLAIN, 17 ) );
                
                priority = new JComboBox();
                priority.addItem( "High" );
                priority.addItem( "Medium" );
                priority.addItem( "Low" );
                priority.setForeground( Color.BLACK );
        priority.setBounds( 370, 280, 250, 35 );
        priority.setFont( new Font ("Javanese Text", Font.PLAIN, 17 ) );
		priority.setBorder(createLineBorder(new Color(0,0,0),1));
                
                btnSearch = new JButton( "Search" );
                btnSearch.setForeground( Color.WHITE );
                btnSearch.setBackground( Color.ORANGE );
        btnSearch.setBounds( 280, 340, 140, 45 );
        btnSearch.setFont( new Font( "Javanese Text", Font.PLAIN, 17 ) );
		btnSearch.setBorder(createLineBorder(new Color(0,0,0),1));
		
		btnSearch.addActionListener( this );
		
                    lbCustomer = new JLabel( "SEARCH FOR A TICKET" );
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
			
		operationMenu.add( createItem );
		operationMenu.add( searchItem );

        helpMenu.add( aboutItem );
        helpMenu.add( contactItem );
        
        p1.setLayout( null );
        
        add( p1,( new BorderLayout().CENTER ) );
        add( p2,( new BorderLayout().NORTH ) );
        add( p3,( new BorderLayout().SOUTH ) );
        add( p4,( new BorderLayout().EAST ) );
        add( p5,( new BorderLayout().WEST ) );
        
                p1.add( lbTicketID );
                p1.add( txtTicketID );
                p1.add( lbpriority );
                p1.add( priority );
                p1.add( btnSearch );
		p1.add( formpanel );         
        p2.add( lbCustomer );
        p3.add( lbFooter );
	}
        public void actionPerformed( ActionEvent e )
        {
           if( e.getSource() == backItem )
           {
	Dashboard_for_Executives d = new Dashboard_for_Executives();
                   d.setVisible( true );
                   d.setSize( 700, 700 );
                   d.setLocationRelativeTo( null );
	d.setResizable( false );
                   d.setTitle( "DASHBOARD FOR EXECUTIVES - Michael's Tech" );
                   d.setDefaultCloseOperation( EXIT_ON_CLOSE );
                   this.dispose();
           }
           else if( e.getSource() == gameItem )
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
        else if( e.getSource() == createItem )
        {
                CreateTicket i = new CreateTicket();
                i.setVisible( true );
                i.setSize( 700, 700 );
                i.setLocationRelativeTo( null );
                i.setResizable( false );
                i.setTitle( "CREATE A NEW TICKET - Michael's Tech" );
                i.setDefaultCloseOperation( EXIT_ON_CLOSE );
                this.dispose();
        }
        else if( e.getSource() == searchItem )
        {
                SearchTicket i = new SearchTicket();
                i.setVisible( true );
                i.setSize( 700, 700 );
                i.setLocationRelativeTo( null );
                i.setResizable( false );
                i.setTitle( "SEARCH FOR A TICKET - Michael's Tech" );
                i.setDefaultCloseOperation( EXIT_ON_CLOSE );
                this.dispose();
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
        else if( e.getSource() == calculatorItem)
        {
            Calculator c = new Calculator();
            c.setVisible(true);
            c.setLocationRelativeTo(null);
            c.setResizable(true);
            c.setTitle("Calculator");
        }
            else if( e.getSource() == btnSearch )
            {
                String TicketID = txtTicketID.getText();
                if(TicketID.equals(""))
                {
                    JOptionPane.showMessageDialog(jf, "The TicketID field is empty!");
                }
                else
                {
                         searchDetails i = new searchDetails();
                         i.setVisible( true );
                         i.setSize( 700, 700 );
                         i.setLocationRelativeTo( null );
                         i.setResizable( false );
                         i.setTitle( "SEARCH DETAILS - Michael's Tech" );
                         i.setDefaultCloseOperation( EXIT_ON_CLOSE );
                         this.dispose();
                }
            }
        }
    public static void main( String[] args )
    {
        SearchTicket i = new SearchTicket();
        i.setVisible( true );
        i.setSize( 700, 700 );
        i.setLocationRelativeTo( null );
        i.setResizable( false );
        i.setTitle( "SEARCH FOR A TICKET - Michael's Tech" );
        i.setDefaultCloseOperation( EXIT_ON_CLOSE );
    }
}