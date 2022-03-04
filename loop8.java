package loop;
import java.util.Scanner;
public class loop8 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
			System.out.print("input number: ");
			int num = input.nextInt();
			long fact = 1;
	        for(int i = 1; i <= num; ++i)
		       {
		            fact *= i;
		        }
		        System.out.println(+fact);
}
}