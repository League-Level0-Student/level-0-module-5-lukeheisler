import javax.swing.JOptionPane;

public class PrimeOrNot {

	public static void main(String[] args) {
		boolean prime = true;
		String number = JOptionPane.showInputDialog("What number do you want to check for primeness?");
		int n = Integer.parseInt(number);
		for(int i = 2; i<n; i++) {
			if(n%i==0) {
				prime = false;
				break;
			}
		}
		if(prime==true) {
			JOptionPane.showMessageDialog(null, "It's prime!");
		}
		else {
			JOptionPane.showMessageDialog(null, "It's not prime...");
		}
	}
}

