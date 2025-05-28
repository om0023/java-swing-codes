import javax.swing.*;

class combobox {
    public static void main(String[] args) {
        JFrame f=new JFrame("Combobox Example");

        String students[]={"om","avi","shivam","rakhi"};
        JComboBox jcb=new JComboBox(students);    
        jcb.setBounds(50, 50,90,20);    
        f.add(jcb);        
        f.setLayout(null);    
        f.setSize(400,500);    
        f.setVisible(true);      
        
    }
      
}

