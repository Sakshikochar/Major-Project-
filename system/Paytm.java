/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travel.management.system;
import java.awt.event.*;
import javax.swing.*;
public class Paytm extends JFrame implements ActionListener{
    
    Paytm(){
        setBounds(500,200,800,600);
        
        JEditorPane pane = new JEditorPane();
        pane.setEditable(false);
        try{
            pane.setPage("https://paytm.com/rent-payment");
        }catch (Exception e){
            pane.setContentType("text/html");
            pane.setText("<html>Could not load Error 404 </html>");
        }
        JScrollPane sp = new JScrollPane(pane);
        getContentPane().add(sp);
        
        JButton back = new JButton("Back");
        back.setBounds(610,20,80,40);
        back.addActionListener(this);
        pane.add(back);
        
        
        setVisible(true);
     }
    
    public void actionPerformed (ActionEvent ae ){
        setVisible (false);
        new Payements();
    }
    
    public static void main(String []args){
        new Paytm();
    }
}