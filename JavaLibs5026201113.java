package homework2;
import javax.swing.JOptionPane;

public class JavaLibs5026201113 {

    public static void main(String[] args) {
    	JOptionPane.showMessageDialog(null,"Welcome to this little Q&A game, I will give you several question for you to answer");

		String input1 = JOptionPane.showInputDialog("Mmm, How's your day?");
		JOptionPane.showMessageDialog(null,"well then...");

		String input2 = JOptionPane.showInputDialog("Btw, what's your name?");
		String input3 = JOptionPane.showInputDialog(null,"What's your favourite mall?");
		String input4 = JOptionPane.showInputDialog(null,"What's your most favourite restaurant?");

		double ips = Double.parseDouble(JOptionPane.showInputDialog(null,"How much your last semester's IPS?"));
		int birthnum = Integer.parseInt(JOptionPane.showInputDialog(null,"How about your Mom's birthday date?"));
		int	tall = Integer.parseInt(JOptionPane.showInputDialog(null,"How many sisters/brothers do you have?"));
		double favnumber = Integer.parseInt(JOptionPane.showInputDialog(null,"What about your favourite number?"));
		double total = favnumber + tall;
		String input5 = JOptionPane.showInputDialog(null,"What's your best birthday gift?");
		String input6 =	JOptionPane.showInputDialog(null,"And how do you feel?");

		JOptionPane.showMessageDialog(null,"Before you end it, I heard that you just went from a holiday with your love."
									+"\nIt's a text from your love, you have to see it!");

		JOptionPane.showMessageDialog(null,"So I went for a holiday with " + input2 + " and I felt so " + input1 + " .Then, we went for a dinner on " + input3
									+ "\nat " + input4 + ". It's pretty good restaurant and for me It's "
									+ ips + " of 5.0 star " + ".\nBtw, It's our anniversary day which consist on " + birthnum + " of August"
									+ ".\nAnd then we went on beach around " + total + " km away from the Mall"
									+".\nSuddenly my love purpose on me and gift me a ring and " + input5
									+ "\nand I fell " + input6 + ". It was my best day ever :) ");













	// write your code here
    }
}
