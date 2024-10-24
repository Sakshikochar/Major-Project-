
package travel.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class About extends JFrame implements ActionListener {
    
    About(){
        setBounds(600,200,500,550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel l1 = new JLabel("ABOUT");
        l1.setBounds(150,10,100,40);
        l1.setForeground(Color.red);
        l1.setFont(new Font("Tahoma",Font.PLAIN, 20));
        add(l1);
        
        String S = "Welcome to the Travel Management System!\n\n"
                + "Our mission is to make your travel experiences enjoyable and hassle-free. "
                + "With our user-friendly platform, you can easily plan and manage your trips, "
                + "book hotels, and explore exciting destinations.\n\n"
                + "Key Features:\n"
                + "- Hotel Booking: Browse and book hotels based on your preferences.\n"
                + "- Trip Planning: Plan your trips with ease and keep track of your itinerary.\n"
                + "- Destination Exploration: Discover new and exciting travel destinations.\n"
                + "- User-Friendly Interface: Our platform is designed to be intuitive and easy to use.\n\n"
                + "Thank you for choosing Travel Management System for your travel needs. "
                + "We are dedicated to providing you with a seamless travel experience.\n";
        
        
        TextArea area = new TextArea(S,10,40,Scrollbar.VERTICAL);
        area.setEditable(false);
        area.setBounds(20,100,450,300);
        add(area);
        
        JButton back = new JButton("Back");
        back.setBounds(200,420,100,25);
        back.addActionListener(this);
        add(back);
        
        
        setVisible(true);
    }
    
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
    }
    
    
    public static void main(String [] args){
     new About();   
    }
}
