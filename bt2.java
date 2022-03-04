package ifelse;
import java.util.Scanner;
public class bt2 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			System.out.print("input 1st number: ");
			int a = input.nextInt();
			System.out.print("input 2nd number: ");
			int b = input.nextInt();
			System.out.print("input 3rd number: ");
			int c = input.nextInt();
			
			if(a>b && a>c)
			{
				System.out.println("the greatest" +a);
			}
			else if(b>a && b>c)
			{
				System.out.println("the greatest" +b);
			}
			else
			{
				System.out.println("the greatest" +c);
			}
		}
		catch(Exception e) {
			System.out.print(e);
		}
}
}