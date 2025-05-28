import javax.swing.*;
public class buttonexp2 {
    public static void main(String[] args) {
        JFrame f=new JFrame("imagebox");
        JButton b=new JButton(new ImageIcon("C:\\Users\\aaj\\OneDrive\\Desktop\\swing\\banner.webp"));

        b.setBounds(500,500,500,100);
        f.add(b);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    }   
}      

    

