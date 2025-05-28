import javax.swing.*;

import java.awt.event.*; 

public class labelexp1 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Label Example");

        JLabel l1;
        l1 = new JLabel();
        l1.setBounds(50,100,250,20);

        JTextField tf=new JTextField();
        tf.setBounds(50,50, 150,20);

        JButton b=new JButton("find ip ");
        b.setBounds(50,150,95,30);

        f.add(l1);
        f.add(b);
        f.add(tf);

        f.setSize(400,400);
        f.setLayout(null);  
        f.setVisible(true);  
        
    
        b.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            try{
                String host=tf.getText();
                String ip=java.net.InetAddress.getByName(host).getHostAddress();  
                l1.setText("IP of "+host+" is: "+ip);  
            }catch(Exception ex ){System.out.println(ex);}
            }
    });
}  
}
