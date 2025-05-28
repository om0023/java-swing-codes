import javax.swing.*;
public class buttonexp{
    public static void main(String[] args) {
        JFrame f=new JFrame("button exp");
        JButton b=new JButton("click here");
        b.setBounds(50,100,95,30);
        f.add(b);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }

}