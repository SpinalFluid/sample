package EBS;
import javax.swing.*;

import java.awt.*;
public class Login extends JFrame{
      Login(){

        super("Login");
        setLayout(null);
        
        JLabel labeluser = new JLabel("Username");
        add(labeluser);
        labeluser.setBounds(200,20, 100, 20  );

        JLabel labelpass = new JLabel("Password");
        add(labelpass);
        
        labelpass.setBounds(200, 50, 100, 20 );

        JLabel label_as = new JLabel("Login as");
        add(label_as);
        label_as.setBounds(200, 80, 50, 20 );

        JTextField username = new JTextField();
        add(username);
        username.setBounds(280, 20, 150, 20);

        JTextField password = new JTextField();
        add(password);
        password.setBounds(280, 50, 150, 20);

        Choice loginas = new Choice();
        loginas.add("Admin");
        loginas.add("Customer");
        loginas.setBounds(280, 80, 150, 20); 
        add(loginas);

        JButton login = new JButton("Login");
        login.setBounds(240, 110, 75, 30);
        add(login); 

        setSize(640, 300);  
        setLocation(600,400);
        setVisible(true);
        getContentPane().setBackground(Color.WHITE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      }
    public static void main(String[] args){
        new Login();
    }

}

