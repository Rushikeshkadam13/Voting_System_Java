import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.*;
import javax.swing.*;
public class p2 extends JFrame implements ActionListener {
   JPanel panel;
   JLabel user_label, message;
   JTextField userName_text;
   JButton submit, cancel;
   private JLabel lbla;
   private JLabel lblb;
   private JLabel lblc;
   private JLabel lbld;
   private JLabel lbld_1;
   p2() {
      // Username Label
      user_label = new JLabel();
      user_label.setBounds(161, 52, 167, 81);
      user_label.setFont(new Font("Tahoma", Font.BOLD, 15));
      user_label.setHorizontalAlignment(SwingConstants.CENTER);
      user_label.setText("Enter vote");
      userName_text = new JTextField();
      userName_text.setBounds(333, 76, 145, 38);
      // Submit
      submit = new JButton("SUBMIT");
      submit.setBounds(318, 157, 192, 51);
      panel = new JPanel();
      panel.setBackground(Color.WHITE);
      panel.setLayout(null);
      panel.add(user_label);
      panel.add(userName_text);
      message = new JLabel();
      message.setBounds(260, 222, 218, 104);
      panel.add(message);
      panel.add(submit);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      // Adding the listeners to components..
      submit.addActionListener(this);
      getContentPane().add(panel, BorderLayout.CENTER);
      
      lbla = new JLabel("1.A");
      lbla.setBounds(64, 69, 45, 13);
      lbla.setFont(new Font("Tahoma", Font.PLAIN, 15));
      lbla.setBackground(Color.YELLOW);
      panel.add(lbla);
      
      lblb = new JLabel("2.B");
      lblb.setBounds(64, 119, 45, 13);
      lblb.setFont(new Font("Tahoma", Font.PLAIN, 15));
      lblb.setBackground(Color.YELLOW);
      panel.add(lblb);
      
 
      lbld = new JLabel("3.C");
      lbld.setBounds(64, 157, 45, 13);
      lbld.setFont(new Font("Tahoma", Font.PLAIN, 15));
      lbld.setBackground(Color.YELLOW);
      panel.add(lbld);
      
      lbld_1 = new JLabel("4.D");
      lbld_1.setBounds(64, 198, 45, 13);
      lbld_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
      lbld_1.setBackground(Color.YELLOW);
      panel.add(lbld_1);
      setTitle("enter vote");
      setSize(617,393);
      setVisible(true);
   }
  
   public static void main(String[] args) {
      new p2();
   }
   @Override
   public void actionPerformed(ActionEvent ae) {
      String userName = userName_text.getText();
      int a=0,b=0,c=0,d=0;
      if (userName.trim().equals("1"))
      {
         message.setText("Your vote is counted");
         a=a+1;
         System.out.println(a);
         try {
             FileWriter writer = new FileWriter("MyFileA.txt", true);
             writer.write("1");
             writer.write("\r\n");   // write new line
             writer.close();
         } catch (IOException e) {
             e.printStackTrace();
         }
        new p3();
         dispose();
         
      } 
      else if(userName.trim().equals("2")){
         message.setText("Your vote is counted");
         b=b+1;
         try {
             FileWriter writer = new FileWriter("MyFileB.txt", true);
             writer.write("1");
             writer.write("\r\n");   // write new line
             writer.close();
         } catch (IOException e) {
             e.printStackTrace();
         }
         new p3();
         dispose();
      }
      else if(userName.trim().equals("3")){
          message.setText("Your vote is counted");
          c=c+1;
          try {
              FileWriter writer = new FileWriter("MyFileC.txt", true);
              writer.write("1");
              writer.write("\r\n");   // write new line
              writer.close();
          } catch (IOException e) {
              e.printStackTrace();
          }
          new p3();
          dispose();
       }
      else if(userName.trim().equals("4")){
          message.setText("Your vote is counted");
          d=d+1;
          try {
              FileWriter writer = new FileWriter("MyFileD.txt", true);
              writer.write("1");
              writer.write("\r\n");   // write new line
              writer.close();
          } catch (IOException e) {
              e.printStackTrace();
          }
          new p3();
          dispose();
       }
      else
      {
    	  message.setText("enter valid choice");
      }
      
   }
}