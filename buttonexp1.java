import java.awt.event.*;  
import javax.swing.*;

public class buttonexp1 {
    public static void main(String[] args) {
        JFrame f=new JFrame("button exp");
       
        final JTextField tf=new JTextField();
        tf.setBounds(50,50,120,20);

        JButton b=new JButton("click here");
        b.setBounds(50,100,120,20);

        b.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                        tf.setText("Welcome to Javatpoint.");  
                    }  
                });  
    f.add(b);
    f.add(tf);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);   


    }

    
}
