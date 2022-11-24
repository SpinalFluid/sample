package EBS;
import javax.swing.*;
import java.awt.*;

public class splash_screen extends JFrame implements Runnable{
    Thread t;
    splash_screen(){
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("EBS/Icons/Screenshot 2022-11-08 231917.png"));
       Image i2 = i1.getImage().getScaledInstance(1026, 672, Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
       JLabel image = new JLabel(i3); 
       add(image);
       
       setUndecorated(true);   
       setVisible(true);
       setLocation(500,200);
       setSize(1026,672);   
       // we create a Thread object which allows us to execute the run function
       // the start function internally initializes run 
       t = new Thread(this); // refers to current class
       t.start();  
    }
    public void run() {
        try{
            Thread.sleep(6000);
            setVisible(false);
            // login frame
            new Login();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main (String args[]){
         new splash_screen();

    }
}
