import javax.swing.*;

class table {
    public static void main(String[] args) {
        JFrame  f= new JFrame("Table Example");
       
        String data[][]={{"om","20","male"},
                         {"avi","19","male"},
                         {"sai","21","male"}};

        String column[]={"name","marks","gemder"};

        JTable TB=new JTable(data,column);

        TB.setBounds(30,40,200,300);          
        JScrollPane sp=new JScrollPane(TB);    
        f.add(sp);          
        f.setSize(300,400);    
        f.setVisible(true);    

    }
    
}
