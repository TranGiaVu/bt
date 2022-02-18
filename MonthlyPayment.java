package slide;
import java.util.Scanner;
public class MonthlyPayment {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		try
		{
			System.out.print("nhap so tien vay : ");
			float a = input.nextFloat();
			System.out.print("nhap lai suat : ");
			float b = input.nextFloat();
			System.out.print("nhap so nam : ");
			int c = input.nextInt();
			
			System.out.println(+ ((a*b)/(1-(1/(Math.pow(1+b,c*12))))));
		}
		catch(Exception e) {
			System.out.print(e);
		}
	}
}
