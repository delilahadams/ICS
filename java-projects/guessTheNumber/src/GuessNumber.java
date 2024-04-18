import javax.swing.JOptionPane;

public class GuessNumber {
    public static void main(String[] args) throws Exception {
        
        boolean awnserValueNum = false;
        int correctNumber = (int)Math.round(Math.random()*100+1);
        int numberGuess;
        while(awnserValueNum == false) {
            numberGuess = Integer.parseInt(JOptionPane.showInputDialog("Guess a random number between 1 and 100"));

                if(numberGuess < correctNumber) JOptionPane.showMessageDialog(null, "Higher.");
                else if(numberGuess > correctNumber) JOptionPane.showMessageDialog(null, "Lower.");
                else JOptionPane.showMessageDialog(null, "Congradulations you got it!");
            awnserValueNum = (numberGuess == correctNumber);
        
        };
    }
    

}
