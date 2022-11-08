package class_Files;
    
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import static javax.swing.BorderFactory.createLineBorder;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class resultDetailsTech extends JFrame implements ActionListener
{
	JFrame jf;
    JPanel p1, p2, p3, p4, p5, formpanel;
	JMenuBar mbar;
    JMenu fileMenu, utilitiesMenu, operationMenu, helpMenu;
    JMenuItem openItem, backItem, exitItem;
	JMenuItem gameItem, calculatorItem, timeItem;
	JMenuItem createItem, searchItem;
    JMenuItem aboutItem, contactItem;
	JLabel lbCustomer, lbFooter, lbTicketID,lb1,lbCustomerEx,lb2,lbDate,lb3,lbCustomerName,lb4,lbCustomerPhone,lb5,lbCustomerEmail,lb6,lbCustomerAddr,lb7,lbProductDet,lb8,lbCustomerComp,lb9,lbPriority,lb10;
	
	public resultDetailsTech()
	{
		mbar = new JMenuBar();
                mbar.setBorder(createLineBorder(new Color(Color.TRANSLUCENT),1));
        
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
        formpanel.setBounds( 60, 40, 550, 500 );
		formpanel.setBorder(createLineBorder(new Color(0,0,0),1));
		
		lbTicketID = new JLabel( "Ticket ID:" );
        lbTicketID.setForeground( Color.BLACK );
        lbTicketID.setFont( new Font("Javanese Text", Font.PLAIN, 17) );
		lbTicketID.setBounds( 100, 50, 100, 50 );
                
                                       lb1 = new JLabel( "T187" );
        lb1.setForeground( Color.BLACK );
        lb1.setFont( new Font("Javanese Text", Font.PLAIN, 17) );
		lb1.setBounds( 400, 50, 100, 50 );
                
                                      lbCustomerEx = new JLabel( "Customer Care Executive:" );
        lbCustomerEx.setForeground( Color.BLACK );
        lbCustomerEx.setFont( new Font("Javanese Text", Font.PLAIN, 17) );
		lbCustomerEx.setBounds( 100, 100, 190, 50 );
                
                                      lb2 = new JLabel( "John M." );
        lb2.setForeground( Color.BLACK );
        lb2.setFont( new Font("Javanese Text", Font.PLAIN, 17) );
		lb2.setBounds( 400, 100, 100, 50 );
                
                                      lbDate = new JLabel( "Date of Creation:" );
        lbDate.setForeground( Color.BLACK );
        lbDate.setFont( new Font("Javanese Text", Font.PLAIN, 17) );
		lbDate.setBounds( 100, 150, 190, 50 );
                
                                      lb3 = new JLabel( "7-jul-09" );
        lb3.setForeground( Color.BLACK );
        lb3.setFont( new Font("Javanese Text", Font.PLAIN, 17) );
		lb3.setBounds( 400, 150, 100, 50 );
                
                lbCustomerName = new JLabel( "Customer Name:" );
        lbCustomerName.setForeground( Color.BLACK );
        lbCustomerName.setFont( new Font("Javanese Text", Font.PLAIN, 17) );
		lbCustomerName.setBounds( 100, 200, 190, 50 );
                
                lb4 = new JLabel( "Martha Collins" );
        lb4.setForeground( Color.BLACK );
        lb4.setFont( new Font("Javanese Text", Font.PLAIN, 17) );
		lb4.setBounds( 400, 200, 170, 50 );
                
                lbCustomerPhone = new JLabel( "Customer Phone:" );
        lbCustomerPhone.setForeground( Color.BLACK );
        lbCustomerPhone.setFont( new Font("Javanese Text", Font.PLAIN, 17) );
		lbCustomerPhone.setBounds( 100, 250, 190, 50 );
                
                lb5 = new JLabel( "515-909-2987" );
        lb5.setForeground( Color.BLACK );
        lb5.setFont( new Font("Javanese Text", Font.PLAIN, 17) );
		lb5.setBounds( 400, 250, 170, 50 );
                
                lbCustomerEmail = new JLabel( "Customer E-mail:" );
        lbCustomerEmail.setForeground( Color.BLACK );
        lbCustomerEmail.setFont( new Font("Javanese Text", Font.PLAIN, 17) );
		lbCustomerEmail.setBounds( 100, 300, 190, 50 );
                
                lb6 = new JLabel( "mc@gmail.com" );
        lb6.setForeground( Color.BLACK );
        lb6.setFont( new Font("Javanese Text", Font.PLAIN, 17) );
		lb6.setBounds( 400, 300, 170, 50 );
                
                lbCustomerAddr = new JLabel( "Customer Address:" );
        lbCustomerAddr.setForeground( Color.BLACK );
        lbCustomerAddr.setFont( new Font("Javanese Text", Font.PLAIN, 17) );
		lbCustomerAddr.setBounds( 100, 350, 190, 50 );
                
                lb7 = new JLabel( "8, Redmond Road, Pick Str" );
        lb7.setForeground( Color.BLACK );
        lb7.setFont( new Font("Javanese Text", Font.PLAIN, 17) );
		lb7.setBounds( 400, 350, 290, 50 );
                
                lbProductDet = new JLabel( "Product Details:" );
        lbProductDet.setForeground( Color.BLACK );
        lbProductDet.setFont( new Font("Javanese Text", Font.PLAIN, 17) );
		lbProductDet.setBounds( 100, 400, 190, 50 );
                
                lb8 = new JLabel( "HP978 BONY Speakers" );
        lb8.setForeground( Color.BLACK );
        lb8.setFont( new Font("Javanese Text", Font.PLAIN, 17) );
		lb8.setBounds( 400, 400, 290, 50 );
                
                lbCustomerComp = new JLabel( "Customer Complaint:" );
        lbCustomerComp.setForeground( Color.BLACK );
        lbCustomerComp.setFont( new Font("Javanese Text", Font.PLAIN, 17) );
		lbCustomerComp.setBounds( 100, 445, 190, 50 );
                
                lb9 = new JLabel( "Sound is not clear" );
        lb9.setForeground( Color.BLACK );
        lb9.setFont( new Font("Javanese Text", Font.PLAIN, 17) );
		lb9.setBounds( 400, 445, 290, 50 );
                
                lbPriority = new JLabel( "Priority:" );
        lbPriority.setForeground( Color.BLACK );
        lbPriority.setFont( new Font("Javanese Text", Font.PLAIN, 17) );
		lbPriority.setBounds( 100, 490, 190, 50 );
                
                lb10 = new JLabel( "Medium" );
        lb10.setForeground( Color.BLACK );
        lb10.setFont( new Font("Javanese Text", Font.PLAIN, 17) );
		lb10.setBounds( 400, 490, 290, 50 );
		
		lbCustomer = new JLabel( "RESULT DETAILS" );
        lbCustomer.setForeground( Color.WHITE );
        lbCustomer.setFont( new Font("Javanese Text", Font.BOLD, 17) );
        
        lbFooter = new JLabel( "Copyright © 2018 - All Rights Reserved" );
        lbFooter.setForeground( Color.WHITE );
        lbFooter.setFont( new Font("Javanese Text", Font.PLAIN, 17) );
		
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
                                      p1.add( lb1 );
                                      p1.add( lbCustomerEx );
                                      p1.add( lb2 );
                                      p1.add( lbDate );
                                      p1.add( lb3 );
                                      p1.add( lbCustomerName);
                                      p1.add( lb4 );
                                      p1.add( lbCustomerPhone );
                                      p1.add( lb5 );
                                      p1.add( lbCustomerEmail );
                                      p1.add( lb6 );
                                      p1.add( lbCustomerAddr );
                                      p1.add( lb7 );
                                      p1.add( lbProductDet );
                                      p1.add( lb8 );
                                      p1.add( lbCustomerComp );
                                      p1.add( lb9 );
                                      p1.add( lbPriority);
                                      p1.add( lb10 );
		p1.add( formpanel );
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
			else if( e.getSource() == backItem )
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
        }
    public static void main( String[] args ){
        resultDetailsTech i = new resultDetailsTech();
        i.setVisible( true );
        i.setSize( 700, 750 );
        i.setLocationRelativeTo( null );
        i.setResizable( false );
        i.setTitle( "RESULT DETAILS - Michael's Tech" );
        i.setDefaultCloseOperation( EXIT_ON_CLOSE );
    }
}