import javax.swing.*;  
public class Jpanel {  
    public static void main (String[]args){
    JFrame frame = new JFrame("Panel demo"); //Create the frame.             
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    frame.setSize(300,300);
    JLabel label = new JLabel("Enter your name");
    JTextField userName = new JTextField(20);
    JPanel Panel= new JPanel();
    JButton buttonLogin = new JButton("Login");
    Panel.add(label);
    Panel.add(userName);
    Panel.add(buttonLogin);
    frame.add(Panel);
    frame.pack();
    frame.setVisible(true);
    }
}