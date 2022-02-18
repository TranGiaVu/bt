package bt;

import java.util.Scanner;

public class bt2 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			System.out.print("nhap a : ");
			int a = input.nextInt();
			System.out.print("nhap b : ");
			int b = input.nextInt();
			
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
