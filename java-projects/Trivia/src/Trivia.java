import javax.swing.JOptionPane;

 

public class Trivia {
    public static void main(String[] args) throws Exception {
        boolean awnserValue = false;
        while(awnserValue == false) {

            String awnser = JOptionPane.showInputDialog("Did any U.S. federal intelligence agencies have any part in the death of J.F.Kennedy?(y/n)");

            awnserValue = awnser.equals("y");

        };
        
        JOptionPane.showMessageDialog(null, "The Central Ineligence Agency would like to offer you the highest award in investigative journalism", "Correct.", 0);

        
        GuessNumber.main(args);
    }

}
