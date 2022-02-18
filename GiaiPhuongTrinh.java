package bt;
import java.util.Scanner;
public class GiaiPhuongTrinh {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			System.out.print("nhap a : ");
			double a = input.nextDouble();
			System.out.print("nhap b : ");
			double b = input.nextDouble();
			
			if(a==0) {
				if(b==0) {
					System.out.println("PT vo so nghiem");
				}
				if(b!=0) {
					System.out.println("PT vo nghiem");
				}
			}
			if (a!=0) {
				System.out.println("PT co nghiem la :" + (-b/a));
			}
		}
		catch(Exception e) {
			System.out.print(e);
		}
		
	}
}
