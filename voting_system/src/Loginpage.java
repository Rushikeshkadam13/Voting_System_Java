import java.awt.*;
import java.awt.event.WindowEvent;  
import java.awt.event.WindowListener;  
import java.awt.event.*;
import javax.swing.*;
public class Loginpage extends JFrame implements ActionListener {
   JPanel panel; //(from javax.swing) provides space in which application attach 
   JLabel user_label, password_label, message;
   JTextField userName_text;
   JPasswordField password_text;
   JButton submit, cancel;
   Loginpage() {
      // Username Label
      user_label = new JLabel();
      user_label.setForeground(Color.BLUE);
      user_label.setHorizontalAlignment(SwingConstants.CENTER);
      user_label.setBounds(10, 56, 114, 38);
      user_label.setText("Voter ID:");
      userName_text = new JTextField();
      userName_text.setBounds(145, 57, 135, 38);
      // Password Label
      password_label = new JLabel();
      password_label.setForeground(Color.BLUE);
      password_label.setHorizontalAlignment(SwingConstants.CENTER);
      password_label.setBounds(10, 127, 114, 38);
      password_label.setText("Password :");
      password_text = new JPasswordField();
      password_text.setBounds(145, 127, 135, 38);
      // Submit
      submit = new JButton("SUBMIT");
      submit.setBounds(155, 208, 91, 38);
      panel = new JPanel();
      panel.setForeground(Color.BLUE);
      panel.setLayout(null);
      panel.add(user_label);
      panel.add(userName_text);
      panel.add(password_label);
      panel.add(password_text);
      message = new JLabel();
      message.setForeground(Color.BLUE);
      message.setBounds(0, 208, 218, 104);
      panel.add(message);
      panel.add(submit);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      // Adding the listeners to components..
      submit.addActionListener(this);
      getContentPane().add(panel, BorderLayout.CENTER);
      setTitle("Please Login Here !");
      setSize(450,350);
      setVisible(true);
   }
   public class Np extends JFrame 
   {
	   JPanel panel;
	   JLabel user_label, password_label, message;
	   JTextField userName_text;
	   JButton submit1, cancel;
	   
   }
   public static void main(String[] args) {
      new Loginpage();
   }
   @Override
   public void actionPerformed(ActionEvent ae) {
      String userName = userName_text.getText();
      String password = password_text.getText();
      
       {if   ((userName.trim().equals("123456") && password.trim().equals("123456"))||(userName.trim().equals("1") && password.trim().equals("1"))||(userName.trim().equals("15154") && password.trim().equals("48641561"))||(userName.trim().equals("5616545") && password.trim().equals("566545"))) 
      {
         message.setText(" Hello " + userName + "");
         new p2();
         dispose();
         
       
      } else {
         message.setText(" Invalid user.. ");
      }
      }
      
   }
}