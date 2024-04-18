import javax.swing.JOptionPane;

public class Jrafics {
    public static void main(String[] args) throws Exception {
        String name = JOptionPane.showInputDialog("Enter your name");
        
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        
        JOptionPane.showMessageDialog(null, "You are "+age+" year(s) old and your name is "+name+".", "Doxxed!", 0);
    }
}
