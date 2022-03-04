package loop;
import java.util.Scanner;
public class loop9 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
			System.out.print("input number: ");
			int num = input.nextInt();
			int reverse=0;
			while(num != 0) {
			      int digit = num % 10;
			      reverse = reverse * 10 + digit;
			      num /= 10;
		    }

		    System.out.println(+reverse);
	}
}
