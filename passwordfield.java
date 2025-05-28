import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class passwordfield {
    public static void main (String []args){
    
    
    JFrame f=new JFrame("login details");
    f.setLayout(null);
   


    JTextField tf =new JTextField();
    tf.setBounds(120, 20, 150, 30);

    JPasswordField pf = new JPasswordField();
    pf.setBounds(120, 60, 150, 30); 

    JLabel l1,l2;
    l1=new JLabel("username");
    l1.setBounds(20, 20, 100, 30);
    
    l2=new JLabel("password");
    l2.setBounds(20, 60, 100, 30); 

    JButton b=new JButton("login");
    b.setBounds(120, 100, 100, 30);

    JButton u=new JButton("cancel");
    u.setBounds(230, 100, 100, 30); 

    
    
        f.add(l1);
        f.add(tf);
        f.add(l2);
        f.add(pf);
        f.add(b);
        f.add(u);

   
    

    b.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String s1=tf.getText();
            String s2=new String(pf.getPassword());

            JOptionPane.showMessageDialog(f,"login successfull\n"+"username :" +s1 +"password:"+s2);
        }
    });

    u.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            tf.setText("");
            pf.setText("");
        }
    });

    f.setSize(400,200);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    f.setVisible(true);  


    
}

}  


