public class Fibonacci {

	public static void main(String[] args) {
		int n1 = 1;
		int n2 = 0;
		int n3 = 0;
		for (int i = 0; i < 45; i++) {
			n3 = n1+n2;
			n1 = n2;
			n2 = n3;
			System.out.println(n3);
		}
	}

}
