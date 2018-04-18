import javax.swing.JOptionPane;

public class PrimeOrNot {

	public static void main(String[] args) {
		boolean prime = false;
		String number = JOptionPane.showInputDialog("What number do you want to check for primeness?");
		int n = Integer.parseInt(number);
		n = n/2;
		number = Integer.toString(n);
		for(int i = 0; i<number.length(); i++) {
			if(number.charAt(i)=='.') {
				n = Integer.parseInt(number);
				n = n*2;
				n = n/3;
				number = Integer.toString(n);
				for(int z = 0; z<number.length(); z++) {
					if(number.charAt(z)=='.') {
						prime = true;
					}
				}
			}	
		}
		if(prime==true) {
			JOptionPane.showMessageDialog(null, "The number is prime!");
		}
		else {
			JOptionPane.showMessageDialog(null, "It's not prime...");
		}
	}
}

