import java.util.jar.Attributes.Name;

import javax.swing.JOptionPane;

public class GUI {
    public static void main(String[] args) {
        
        String name = JOptionPane.showInputDialog("Enter you're name");
        JOptionPane.showMessageDialog(null, "Hello "+name+"!");

    int age = Integer.parseInt(JOptionPane.showInputDialog("Enter you're age"));
        JOptionPane.showMessageDialog(null, "You're "+age+" years old!");

    double height = Double.parseDouble(JOptionPane.showInputDialog("Enter you're height"));
        JOptionPane.showMessageDialog(null, "You're height is:"+height+" m tall");

    }
}
