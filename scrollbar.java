import javax.swing.*;
public class scrollbar {
    public static void main(String[] args) {
        JFrame f = new JFrame("Scrollbar");
        JScrollBar s=new JScrollBar();

        f.add(s);
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true); 
        s.setBounds(100,100, 50,100);  

    }
    
}
