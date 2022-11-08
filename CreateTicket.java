package class_Files;
    
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import static javax.swing.BorderFactory.createLineBorder;

public class CreateTicket extends JFrame implements ActionListener
{
	JFrame jf;
    JPanel p1, p2, p3, p4, p5, formpanel;
	JMenuBar mbar;
    JMenu fileMenu, utilitiesMenu, operationMenu, helpMenu;
    JMenuItem openItem, backItem, exitItem;
	JMenuItem gameItem, calculatorItem, timeItem;
	JMenuItem createItem, searchItem;
    JMenuItem aboutItem, contactItem;
	JLabel lbCustomer, lbFooter, lbTicketID, lbCustomerName, lbCustomerEmail, lbCustomerPhone, lbCustomerAddress, lbProductDetails,lbCustomerComplaint, lbPriority;
	JTextArea txtCustomerAddress, txtProductDetails, txtCustomerComplaint;
	JTextField txtTicketID, txtCustomerName, txtCustomerEmail, txtCustomerPhone;
    JComboBox prority;
        JButton btnSave, btnBack;
	
    public CreateTicket()
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
            formpanel.setBounds( 10, 10, 650, 560 );
                    formpanel.setBorder(createLineBorder(new Color(0,0,0),1));

                    lbTicketID = new JLabel( "Ticket ID:" );
                    lbTicketID.setForeground( Color.BLACK );
            lbTicketID.setFont( new Font("Javanese Text", Font.PLAIN, 17) );
                    lbTicketID.setBounds( 303, 80, 100, 30 );

                    txtTicketID = new JTextField();
                    txtTicketID.setBounds( 380, 80, 100, 30 );
                    txtTicketID.setForeground( Color.BLACK );
            txtTicketID.setFont( new Font("Javanese Text", Font.PLAIN, 17) );
                    txtTicketID.setBorder(createLineBorder(new Color(0,0,0),1));

                    lbCustomerName = new JLabel( "Customer's Name:" );
                    lbCustomerName.setForeground( Color.BLACK );
            lbCustomerName.setFont( new Font("Javanese Text", Font.PLAIN, 17) );
                    lbCustomerName.setBounds( 95, 130, 250, 50 );

                    txtCustomerName = new JTextField();
                    txtCustomerName.setBounds( 230, 140, 400, 30 );
                    txtCustomerName.setForeground( Color.BLACK );
            txtCustomerName.setFont( new Font("Javanese Text", Font.PLAIN, 17) );
                    txtCustomerName.setBorder(createLineBorder(new Color(0,0,0),1));

                    lbCustomerEmail = new JLabel( "Customer's Email:" );
                    lbCustomerEmail.setForeground( Color.BLACK );
            lbCustomerEmail.setFont( new Font("Javanese Text", Font.PLAIN, 17) );
                    lbCustomerEmail.setBounds( 94, 180, 250, 50 );

                    txtCustomerEmail = new JTextField();
                    txtCustomerEmail.setBounds( 230, 190, 400, 30 );
                    txtCustomerEmail.setForeground( Color.BLACK );
            txtCustomerEmail.setFont( new Font("Javanese Text", Font.PLAIN, 17) );
                    txtCustomerEmail.setBorder(createLineBorder(new Color(0,0,0),1));

                    lbCustomerPhone = new JLabel( "Customer's Phone Number:" );
                    lbCustomerPhone.setForeground( Color.BLACK );
            lbCustomerPhone.setFont( new Font("Javanese Text", Font.PLAIN, 17) );
                    lbCustomerPhone.setBounds( 28, 230, 200, 50 );

                    txtCustomerPhone = new JTextField();
                    txtCustomerPhone.setBounds( 230, 240, 400, 30 );
                    txtCustomerPhone.setForeground( Color.BLACK );
            txtCustomerPhone.setFont( new Font("Javanese Text", Font.PLAIN, 17) );
                    txtCustomerPhone.setBorder(createLineBorder(new Color(0,0,0),1));

                    lbCustomerAddress = new JLabel( "Customer's Address:" );
                    lbCustomerAddress.setForeground( Color.BLACK );
            lbCustomerAddress.setFont( new Font("Javanese Text", Font.PLAIN, 17) );
                    lbCustomerAddress.setBounds( 75, 290, 200, 50 );

                    txtCustomerAddress = new JTextArea(30,30);
                    txtCustomerAddress.setBounds( 230, 290, 400, 50 );
                    txtCustomerAddress.setForeground( Color.BLACK );
            txtCustomerAddress.setFont( new Font("Javanese Text", Font.PLAIN, 17) );
                    txtCustomerAddress.setBorder(createLineBorder(new Color(0,0,0),1));
                    txtCustomerAddress.setLineWrap(true);

                    lbProductDetails = new JLabel( "Product Details:" );
                    lbProductDetails.setForeground( Color.BLACK );
            lbProductDetails.setFont( new Font("Javanese Text", Font.PLAIN, 17) );
                    lbProductDetails.setBounds( 105, 360, 200, 50 );

                    txtProductDetails = new JTextArea(30,30);
                    txtProductDetails.setBounds( 230, 360, 400, 50 );
                    txtProductDetails.setForeground( Color.BLACK );
            txtProductDetails.setFont( new Font("Javanese Text", Font.PLAIN, 17) );
                    txtProductDetails.setBorder(createLineBorder(new Color(0,0,0),1));
                    txtProductDetails.setLineWrap(true);

                    lbCustomerComplaint = new JLabel( "Customer's Complaint:" );
                    lbCustomerComplaint.setForeground( Color.BLACK );
            lbCustomerComplaint.setFont( new Font("Javanese Text", Font.PLAIN, 17) );
                    lbCustomerComplaint.setBounds( 60, 430, 200, 50 );

                    txtCustomerComplaint = new JTextArea(30,30);
                    txtCustomerComplaint.setBounds( 230, 430, 400, 50 );
                    txtCustomerComplaint.setForeground( Color.BLACK );
            txtCustomerComplaint.setFont( new Font("Javanese Text", Font.PLAIN, 17) );
                    txtCustomerComplaint.setBorder(createLineBorder(new Color(0,0,0),1));
                    txtCustomerComplaint.setLineWrap(true);

            prority = new JComboBox();
            prority.addItem( "High" );
            prority.addItem( "Medium" );
            prority.addItem( "Low" );
            prority.setBounds( 230, 500, 100, 35 );
            prority.setForeground( Color.BLACK );
            prority.setFont( new Font("Javanese Text", Font.PLAIN, 17) );
            prority.setBorder(createLineBorder(new Color(0,0,0),1));

            btnSave = new JButton( "Save" );
            btnSave.setBounds( 530, 500, 100, 35 );
            btnSave.setForeground( Color.WHITE );
            btnSave.setBackground( Color.ORANGE );
            btnSave.setFont( new Font("SANS_SERIF", Font.BOLD, 15) );
                    btnSave.setBorder(createLineBorder(new Color(0,0,0),1));

                    btnSave.addActionListener(this);

            btnBack = new JButton( "Cancel" );
            btnBack.setBounds( 400, 500, 100, 35 );
            btnBack.setForeground( Color.WHITE );
            btnBack.setBackground( Color.DARK_GRAY );
            btnBack.setFont( new Font("Exotc350 DmBd BT", Font.BOLD, 15) );
            btnBack.setBorder(createLineBorder(new Color(0,0,0),1));

            btnBack.addActionListener( this );

            lbCustomer = new JLabel( "CREATE A NEW TICKET" );
            lbCustomer.setForeground( Color.WHITE );
            lbCustomer.setFont( new Font("SANS_SERIF", Font.BOLD, 20) );

            lbFooter = new JLabel( "Copyright © 2018 - All Rights Reserved" );
            lbFooter.setForeground( Color.WHITE );
            lbFooter.setFont( new Font( "SANS_SERIF", Font.BOLD, 15 ) );

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
                    p1.add( lbCustomerName );
                    p1.add( txtCustomerName );
                    p1.add( lbCustomerEmail );
                    p1.add( txtCustomerEmail );
                    p1.add( lbCustomerPhone );
                    p1.add( txtCustomerPhone );
                    p1.add( lbCustomerAddress );
                    p1.add( txtCustomerAddress );
                    p1.add( lbProductDetails );
                    p1.add( txtProductDetails );
                    p1.add( lbCustomerComplaint );
                    p1.add( txtCustomerComplaint );
                    p1.add( prority );
                    p1.add( btnSave );
                    p1.add( btnBack );
                    p1.add( formpanel );
            p2.add( lbCustomer );
            p3.add( lbFooter );
    }
    public void actionPerformed( ActionEvent e )
    {
        if( e.getSource() == btnBack )
        {
            int n = JOptionPane.showConfirmDialog(jf, "Do you want to close this window?", "Confirmation", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (n == JOptionPane.YES_OPTION) 
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
                            Dashboard_for_Executives d = new Dashboard_for_Executives();
                            d.setVisible( true );
                            d.setSize( 700, 700 );
                            d.setLocationRelativeTo( null );
                            d.setResizable( false );
                            d.setTitle( "DASHBOARD FOR EXECUTIVES - Michael's Tech" );
                            d.setDefaultCloseOperation( EXIT_ON_CLOSE );
                            this.dispose();
                    }
                    else if( e.getSource() == btnSave )
                    {
                        String one = txtCustomerAddress.getText();
                        String two = txtCustomerComplaint.getText();
                        String three = txtCustomerEmail.getText();
                        String four = txtCustomerName.getText();
                        String five = txtCustomerPhone.getText();
                        String six = txtProductDetails.getText();
                        String seven = txtTicketID.getText();
                        String p = (String) prority.getSelectedItem();

                            if( one.equals("") && two.equals("") && three.equals("") && four.equals("") && five.equals("") && six.equals("") && seven.equals("") && (p.equals("Medium")||p.equals("High")||p.equals("Low")) )
                            {
                                    JOptionPane.showMessageDialog(jf,"Make sure the fields are not empty!");
                            }
                            else if( !one.equals("") && !two.equals("") && !three.equals("") && !four.equals("") && !five.equals("") && !six.equals("") && !seven.equals("") && (p.equals("Medium")||p.equals("High")||p.equals("Low")) )
                            {
                                String[] CustomerDetails = new String[100];
                                CustomerDetails[0] = one;
                                CustomerDetails[1] = two;
                                CustomerDetails[2] = three;
                                CustomerDetails[3] = four;
                                CustomerDetails[4] = five;
                                CustomerDetails[5] = six;
                                CustomerDetails[6] = seven;
                                CustomerDetails[7] = p;
                                     //saving the data into an array
                                JOptionPane.showMessageDialog(jf,"Your Data has been Saved!");
                     int n = JOptionPane.showConfirmDialog(jf, "Would you like to Create another Ticket?", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                            if (n == JOptionPane.YES_OPTION) 
                            {
                                txtCustomerAddress.setText("");
                                txtCustomerComplaint.setText("");
                                txtCustomerEmail.setText("");
                                txtCustomerName.setText("");
                                txtCustomerPhone.setText("");
                                txtProductDetails.setText("");
                                txtTicketID.setText("");
                            }
                            else if (n == JOptionPane.NO_OPTION) 
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
                    }
        }
    }
    public static void main( String[] args ){
        CreateTicket i = new CreateTicket();
        i.setVisible( true );
        i.setSize( 700, 700 );
        i.setLocationRelativeTo( null );
        i.setResizable( false );
        i.setTitle( "CREATE A NEW TICKET - Michael's Tech" );
        i.setDefaultCloseOperation( EXIT_ON_CLOSE );
    }
}