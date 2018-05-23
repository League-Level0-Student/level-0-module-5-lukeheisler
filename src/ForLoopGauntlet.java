import javax.swing.JOptionPane;

public class ForLoopGauntlet {
	public static void main(String[] args) {
		int id = JOptionPane.showOptionDialog(null, "For loop ID?", "0w0", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] {"S1", "S2", "S3", "S4", "S5", "S6", "S7", "N1", "N2", "N3", "N4"}, null);
		id++;
		if(id==1) {
			for (int i = 1; i < 101; i++) {
				System.out.println(i);
			}
		}
		if(id==2) {
			for(int i = 100; i > 0; i--) {
				System.out.println(i);
			}
		}
		if(id==3) {
			for(int i = 1; i < 101; i++) {
				if(i%2==0) {
					System.out.println(i);
				}
			}
		}
		if(id==4) {
			for(int i = 1; i < 101; i++) {
				if(i%2==1) {
					System.out.println(i);
				}
			}
		}
		if(id==5) {
			for(int i = 1; i < 501; i++) {
				if(i%2==0) {
					System.out.println(i + " is even.");
				}
				else {
				System.out.println(i + " is odd.");
				}
			}
		}
		if(id==6) {
			for(int i = 1; i < 778; i++) {
				if(i%7==0) {
					System.out.println(i);
				}
			}
		}
		if(id==7) {
			for(int i = 2018; i > 2004; i--) {
				int a = i-2005;
				System.out.println("In " + i + ", I was " + a + " year(s) old.");
			}
		}
		if(id==8) {
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					System.out.println(i + " " + j);
				}
			}
		}
		if(id==9) {
			int k = 0;
			for (int i = 0; i < 3; i++) {
				System.out.printf("%n");
				for (int j = 1; j < 4; j++) {
					if(i==0) {
						k = j;
					}
					else if(i==1) {
						k = j + 3;
					}
					else if(i==2) {
						k = j + 6;
					}
					System.out.print(k);
				}
			}
		}
		if(id==10) {
			int k = 0;
			for (int i = 0; i < 10; i++) {
				System.out.printf("%n");
				for (int j = 1; j < 11; j++) {
					if(i==0) {
						k = j;
					}
					else if(i==1) {
						k = j + 10;
					}
					else if(i==2) {
						k = j + 20;
					}
					else if(i==3) {
						k = j + 30;
					}
					else if(i==4) {
						k = j + 40;
					}
					else if(i==5) {
						k = j + 50;
					}
					else if(i==6) {
						k = j + 60;
					}
					else if(i==7) {
						k = j + 70;
					}
					else if(i==8) {
						k = j + 80;
					}
					else if(i==9) {
						k = j + 90;
					}
					System.out.print(k + " ");
				}
			}
		}
		if(id==11) {
			for (int i = 0; i < 7; i++) {
				System.out.printf("%n");
				for (int j = 0; j < i; j++) {
					System.out.print("*");
				}
			}
		}
	}
}

