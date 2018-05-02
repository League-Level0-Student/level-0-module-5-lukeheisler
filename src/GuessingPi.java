/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import javax.swing.JOptionPane;

public class GuessingPi {
	// 1. Make a main method and make sure your program can run
	public static void main(String[] args) {
		
		// 2. Make a String variable to hold the value of Pi.
		//    Get the first few digits from http://www.piday.org/million/.
		String pi = "3.141592653589793238462643383279502884197169399375105820974944592307816406286208998628034825342117067982148086513282306647093844609550582231725359408128481117450284102701938521105559644622948954930381964428810975665933446128475648233786783165271201909145648566923460348610454326648213393607260249141273724587006606315588174881520920962829254091715364367892590360011330530548820466521384146951941511609433057270365759591953092186117381932611793105118548074462379962749567351885752724891227938183011949129833673362440656643086021394946395224737190702179860943702770539217176293176752384674818467669405132000568127145263560827785771342757789609173637178721468440901224953430146549585371050792279689258923542019956112129021960864034418159813629774771309960518707211349999998372978049951059731732816096318595024459455346908302642522308253344685035261931188171010003137838752886587533208381420617177669147303598253490428755468731159562863882353787593751957781857780532171226806613001927876611195909216420198938095257201065485863278865936153381827968230301952035301852968995773622599413891249721775283479131515574857242454150695950829533116861727855889075098381754637464939319255060400927701671139009848824012858361603563707660104710181942955596198946767837449448255379774726847104047534646208046684259069491293313677028989152104";
		// 3. Print out the first 3 digits of Pi to the console.
		//    The first value is "pi.charAt(0)", the second is "pi.charAt(1)", etc.
		//    Run your program to see how this works.
		// 9. If you want to give the user more than one chance to guess,
		//    put a for loop around steps 4-8.
		for (int i = 0; i > 1; i++) {
			// 4. Create a for loop that will step through each digit of pi (steps 5-8)
			//    NOTE: The number of digits in your string will be
			//       yourStringVariable.length()
			for (int j = 0; j < pi.length(); j++) {
				// 5. Ask the user for the NEXT digit of pi.
				String number = JOptionPane.showInputDialog("What's the next character of Pi?");
				// 6. Compare the user's input to the next digit of your pi variable 
				//    (look at step 3 for a clue).
				//    HINT: use charAt(0) to get 1st char of user input String 
				String nextChar = Character.toString(pi.charAt(i));
				if(number.equals(nextChar)) {
					// 7. If they are correct, print out "correct".
					JOptionPane.showMessageDialog(null, "Yay! ^_^");
				}
					// 8. If they are not, print out "incorrect" and tell them
					//    to start over. Use 'break;' to break out of the loop.
				else {
					JOptionPane.showMessageDialog(null, "D: You didn't get it correct! Your IQ is " + i + ". If it's your first incorrect number, you get one more chance.");
					break;
				}
			}
		}
	}
}


