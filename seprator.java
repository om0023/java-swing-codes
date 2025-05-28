import javax.swing.*;

public class seprator {
    public static void main(String[] args) {
        JFrame f=new JFrame("seprator");
        JMenuBar mb= new JMenuBar();
        
        JMenu menu, submenu;    
        JMenuItem i1, i2, i3, i4, i5;    

        menu=new JMenu("menu");
        i1=new JMenuItem("ITEM 1");
        i2=new JMenuItem("item 2");
        i3=new JMenuItem("ITEM 3");
        i4=new JMenuItem("ITEM 4");

        menu.add(i1);  
        menu.addSeparator();  
        menu.add(i2);
        menu.addSeparator();  
        menu.add(i3);
       
        mb.add(menu);    
        f.setJMenuBar(mb);    
        f.setSize(400,400);    
        f.setLayout(null);    
        f.setVisible(true);    




    }
    
}
