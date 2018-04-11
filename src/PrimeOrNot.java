import javax.swing.JOptionPane;

public class PrimeOrNot {

	public static void main(String[] args) {
		boolean prime = true;
		String number = JOptionPane.showInputDialog("What number do you want to check for primeness?");
		int n = Integer.parseInt(number);
		for(int i = 1; i < n+1; i++) {
			if(n%i==n) {
				JOptionPane.showMessageDialog(null, "It's not a prime number...");
				prime = false;
				break;
			}
		}
		if(prime==true) {
			JOptionPane.showMessageDialog(null, "The number is prime!");
		}
	}
}

