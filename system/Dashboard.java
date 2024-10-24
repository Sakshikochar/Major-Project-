package travel.management.system;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener{
   
    String username;
    JButton addPersonalDetails , viewPersonalDetails ,about, deletePersonalDetails,updatePersonalDetails,notepad,calculators ,checkpackages , bookpackage,payments , viewpackage , viewhotels , destinations ,bookhotel,viewBookedhotel ;
   
    Dashboard(String username)
    {
        this.username=username;
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setBounds(0,0,1200,720);
        setLayout(null);
       
        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0,0,102));
        p1.setBounds(0,0,1600,65);
        add(p1);
       
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2=i1.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel icon = new JLabel(i3);
        icon.setBounds(5,0,70,70);
        p1.add(icon);
       
       
       JLabel heading=new JLabel("Dashboard");
       heading.setBounds(80,10,300,40);
       heading.setForeground(Color.WHITE);
       heading.setFont(new Font("Tahoma",Font.BOLD,30));
       p1.add(heading);
       
       
        JPanel p2=new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0,0,102));
        p2.setBounds(0,65,280,900);
        add(p2);
       
        addPersonalDetails= new JButton("Add Personal Details");
        addPersonalDetails.setBounds(0,0,280,42);
        addPersonalDetails.setBackground(new Color(0,0,102));
        addPersonalDetails.setForeground(Color.WHITE);
        addPersonalDetails.setFont(new Font("Tahoma",Font.BOLD,18));
        addPersonalDetails.setMargin(new Insets(0,0,0,60));
        addPersonalDetails.addActionListener(this);
        p2.add(addPersonalDetails);
       
       
        updatePersonalDetails= new JButton("Update Personal Details");
        updatePersonalDetails.setBounds(0,42,280,42);
        updatePersonalDetails.setBackground(new Color(0,0,102));
        updatePersonalDetails.setForeground(Color.WHITE);
        updatePersonalDetails.setFont(new Font("Tahoma",Font.BOLD,18));
        updatePersonalDetails.addActionListener(this);
        updatePersonalDetails.setMargin(new Insets(0,0,0,30));
        
        p2.add(updatePersonalDetails);
       
       
        viewPersonalDetails= new JButton("View Details");
        viewPersonalDetails.setBounds(0,84,300,42);
        viewPersonalDetails.setBackground(new Color(0,0,102));
        viewPersonalDetails.setForeground(Color.WHITE);
        viewPersonalDetails.setFont(new Font("Tahoma",Font.BOLD,18));
        viewPersonalDetails.setMargin(new Insets(0,0,0,130));
        viewPersonalDetails.addActionListener(this);
        p2.add(viewPersonalDetails);
       
               
        deletePersonalDetails= new JButton("Delete personal Details");
        deletePersonalDetails.setBounds(0,126,280,42);
        deletePersonalDetails.setBackground(new Color(0,0,102));
        deletePersonalDetails.setForeground(Color.WHITE);
        deletePersonalDetails.setFont(new Font("Tahoma",Font.BOLD,18));
        deletePersonalDetails.setMargin(new Insets(0,0,0,40));
        deletePersonalDetails.addActionListener(this);
        p2.add(deletePersonalDetails);
       
               
        checkpackages= new JButton("Check packages");
        checkpackages.setBounds(0,168,280,42);
        checkpackages.setBackground(new Color(0,0,102));
        checkpackages.setForeground(Color.WHITE);
        checkpackages.setFont(new Font("Tahoma",Font.BOLD,18));
        checkpackages.setMargin(new Insets(0,0,0,110));
        checkpackages.addActionListener(this);
        p2.add(checkpackages);
       
        bookpackage= new JButton("Book package");
        bookpackage.setBounds(0,210,280,42);
        bookpackage.setBackground(new Color(0,0,102));
        bookpackage.setForeground(Color.WHITE);
        bookpackage.setFont(new Font("Tahoma",Font.BOLD,18));
        bookpackage.setMargin(new Insets(0,0,0,120));
        bookpackage.addActionListener(this);
        p2.add(bookpackage);
       
        viewpackage= new JButton("View package");
        viewpackage.setBounds(0,252,280,42);
        viewpackage.setBackground(new Color(0,0,102));
        viewpackage.setForeground(Color.WHITE);
        viewpackage.setFont(new Font("Tahoma",Font.BOLD,18));
        viewpackage.setMargin(new Insets(0,0,0,120));
        viewpackage.addActionListener(this);
        p2.add(viewpackage);
       
       
        viewhotels= new JButton("View Hotels");
        viewhotels.setBounds(0,294,280,42);
        viewhotels.setBackground(new Color(0,0,102));
        viewhotels.setForeground(Color.WHITE);
        viewhotels.setFont(new Font("Tahoma",Font.BOLD,18));
        viewhotels.setMargin(new Insets(0,0,0,130));
        viewhotels.addActionListener(this);
        p2.add(viewhotels);
       
        bookhotel= new JButton("Book Hotel");
        bookhotel.setBounds(0,336,280,42);
        bookhotel.setBackground(new Color(0,0,102));
        bookhotel.setForeground(Color.WHITE);
        bookhotel.setFont(new Font("Tahoma",Font.BOLD,18));
        bookhotel.setMargin(new Insets(0,0,0,140));
        bookhotel.addActionListener(this);
        p2.add(bookhotel);
       
        viewBookedhotel= new JButton("View Booked Hotels");
        viewBookedhotel.setBounds(0,378,280,42);
        viewBookedhotel.setBackground(new Color(0,0,102));
        viewBookedhotel.setForeground(Color.WHITE);
        viewBookedhotel.setFont(new Font("Tahoma",Font.BOLD,18));
        viewBookedhotel.setMargin(new Insets(0,0,0,70));
        viewBookedhotel.addActionListener(this);
        p2.add(viewBookedhotel);
       
        destinations= new JButton("Destinations");
        destinations.setBounds(0,420,280,42);
        destinations.setBackground(new Color(0,0,102));
        destinations.setForeground(Color.WHITE);
        destinations.setFont(new Font("Tahoma",Font.BOLD,18));
        destinations.setMargin(new Insets(0,0,0,125));
        destinations.addActionListener(this);
        p2.add(destinations);
       
        payments = new JButton("Payments");
        payments.setBounds(0,462,280,42);
        payments.setBackground(new Color(0,0,102));
        payments.setForeground(Color.WHITE);
        payments.setFont(new Font("Tahoma",Font.BOLD,18));
        payments.setMargin(new Insets(0,0,0,155));
        payments.addActionListener(this);
        p2.add(payments);
       
        calculators= new JButton("Calculator");
        calculators.setBounds(0,504,280,42);
        calculators.setBackground(new Color(0,0,102));
        calculators.setForeground(Color.WHITE);
        calculators.setFont(new Font("Tahoma",Font.BOLD,18));
        calculators.setMargin(new Insets(0,0,0,145));
        calculators.addActionListener(this);
        p2.add(calculators);
       
        notepad= new JButton("Notepad");
        notepad.setBounds(0,546,280,42);
        notepad.setBackground(new Color(0,0,102));
        notepad.setForeground(Color.WHITE);
        notepad.setFont(new Font("Tahoma",Font.BOLD,18));
        notepad.setMargin(new Insets(0,0,0,145));
        notepad.addActionListener(this);
        p2.add(notepad);
       
        about= new JButton("About");
        about.setBounds(0,588,280,42);
        about.setBackground(new Color(0,0,102));
        about.setForeground(Color.WHITE);
        about.setFont(new Font("Tahoma",Font.BOLD,18));
        about.setMargin(new Insets(0,0,0,175));
        about.addActionListener(this);
        p2.add(about);
       
        ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i5=i4.getImage().getScaledInstance(1650,1000,Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel image = new JLabel(i6);
        image.setBounds(0,0,1650,1000);
        add(image);
       
       
       JLabel text=new JLabel("Travel Tourism Management System");
       text.setBounds(375,70,1200,70);
       text.setForeground(Color.WHITE);
       text.setFont(new Font("Tahoma",Font.BOLD,53));
       image.add(text);
       
       
       
       
       
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==addPersonalDetails)
        {
            new AddCustomer(username);
        }
        else if (ae.getSource() == viewPersonalDetails){
            new ViewCustomer(username);
        }
        else if (ae.getSource() == updatePersonalDetails){
            new UpdateCustomer(username);
        }
        else if(ae.getSource() == checkpackages){
            new CheckPackage();
        }
        else if(ae.getSource() == bookpackage){
            new BookPackage(username);
        }
        else if (ae.getSource() == viewpackage ){
            new ViewPackage(username);
        }
        else if (ae.getSource() == viewhotels  ){
            new ViewHotels();
        }
        else if (ae.getSource() == destinations ){
            new Destination();
        }
        else if (ae.getSource() == bookhotel){
            new BookHotel(username);
        }
        else if (ae.getSource() == viewBookedhotel){
            new ViewBookedHotel(username);
        }
        else if(ae.getSource() == payments){
            new Payements();
        }
        else if (ae.getSource() == calculators){
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        else if (ae.getSource() == notepad){
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        else if (ae.getSource() == about){
            new About();
        }
        else if(ae.getSource() == deletePersonalDetails){
            new DeleteDetails(username);
        }
        
        
        
    }
   
    public static void main(String[] args)
    {
        new Dashboard("");
    }
   
}