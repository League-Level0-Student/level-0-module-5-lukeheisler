import javax.swing.JOptionPane;

public class ForLoopGauntlet {
	public static void main(String[] args) {
		int id = JOptionPane.showOptionDialog(null, "For loop ID?", "0w0", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] {"S1", "S2", "S3", "S4", "S5", "S6", "S7", "N1", "N2"}, null);
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
			for(int i = 1; i < 4; i++) {
				for(int j = 2; j < 5; j++) {
					System.out.println(i + " " + j*i + " " + i);
				}
			}
		}
	}
}
