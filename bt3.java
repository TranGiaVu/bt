/**
 * 
 */
package bt;

import java.util.Scanner;

/**
 * @author USER
 *
 */
public class bt3 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			System.out.print("nhap a : ");
			double a = input.nextDouble();
			System.out.print("nhap b : ");
			double b = input.nextDouble();
			
			System.out.println("a + b = " + (a+b));
			System.out.println("a - b = " + (a-b));
			System.out.println("a * b = " + (a*b));
			System.out.println("a / b = " + (a/b));
			System.out.println("a % b = " + (a%b));
			System.out.println("a ^ b = " + (Math.pow(a,b)));
		}
		catch(Exception e) {
			System.out.print(e);
		}
		
	}

}
