package bt;

import java.util.Scanner;

public class bt1 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			System.out.print("nhap a : ");
			byte a = input.nextByte();
			System.out.print("nhap b : ");
			byte b = input.nextByte();
			
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
