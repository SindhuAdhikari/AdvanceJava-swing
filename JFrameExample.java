
import javax.swing.JFrame;
import javax.swing.JTextField;


public class JFrameExample {  
    public static void main(String s[]) {
        
        JFrame frame = new JFrame("sindhuDon"); //creating instances of jframe

        JTextField t1,t2;
        t1= new JTextField("Advance java");
        t1.setBounds(50, 100, 200, 30);
        t2=new JTextField("swing tutorial");
        t2.setBounds(50, 100, 200, 30);

        //JButton button=new JButton("login"); //creating istance of jbutton
        //button.setBounds(130, 100, 100, 40);
        
        
        frame.setSize(400, 500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(t1);frame.add(t2);
        
        

        
}  
}