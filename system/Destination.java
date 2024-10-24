package travel.management.system;
import javax.swing.*;
import java.awt.*;

public class Destination extends JFrame implements Runnable{

    Thread t1 ;
    JLabel caption ;
    JLabel[] label = new JLabel[10];
public void run (){
    String[]  text =new String [] {"Baros Maldives","One&Only Reethi Rah","Gili Lankanfushi","Cheval Blanc Randheli","Velaa Private Island","Conrad Maldives Rangali Island","Six Senses Laamu","W Maldives","Kurumba Maldives","Cocoa Island by COMO"};
    
    try {
        for (int i = 0; i<=9 ; i++){
            label[i].setVisible(true);
            caption.setText(text[i]);
            Thread.sleep(2500);
            label[i].setVisible(false);
        }
    }catch(Exception e ){
        e.printStackTrace();
    }
}
    
    
    Destination() {
        
        caption = new JLabel();
        caption.setBounds(50,500,1000,70);
        caption.setFont(new Font ("Tahoma", Font.PLAIN, 40));
        caption.setForeground(Color.WHITE);
        add(caption);
        
        setBounds(500, 200, 800, 600);

        ImageIcon[] image = new ImageIcon[10];

        Image[] jimage = new Image[10];

        ImageIcon[] kimage = new ImageIcon[10];

        for (int i = 0; i <= 9; i++) {
            image[i] = new ImageIcon(ClassLoader.getSystemResource("icons/dest" + (i + 1) + ".jpg"));
            jimage[i] = image[i].getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
            kimage[i] = new ImageIcon(jimage[i]);
            label[i] = new JLabel(kimage[i]);
            label[i].setBounds(0, 0, 800, 600);
            add(label[i]);
        }

        t1 = new Thread(this);
        t1.start();
        
        setVisible(true);
    }

    public static void main(String[] args) {
        new Destination();
    }
}
