import javax.swing.*;

public class spinner {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Spinner");
       
        SpinnerModel value = new SpinnerNumberModel(5,0,10,1) ;
        JSpinner sp = new JSpinner(value);

        frame.add(sp);

        sp.setBounds(100,100,50,30);
        frame.setSize(300,300);
        frame .setLayout(null);    
        frame.setVisible(true);  
            
    
    }
    
}
