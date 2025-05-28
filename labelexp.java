import javax.swing.*;
public class labelexp {
    public static void main(String[] args) {
        JFrame frame =new JFrame("labelexp");

        JLabel label =new JLabel("FIRST LABEL");
        label.setBounds(50,50,100,30);

        frame.add(label);
        frame.setSize(400,300);
        frame.setLayout(null);  
        frame.setVisible(true);  


    
}
}
