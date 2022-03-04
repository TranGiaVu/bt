package loop;
import java.util.Scanner;
public class loop4 {
	   public static void main(String args[])
	   {
		      Scanner sc = new Scanner(System.in);
		      int count = 0;
		      System.out.println("input number :");
		      int num = sc.nextInt();
		      while(num!=0)
		      {
		         num = num/10;
		         count++;
		      }
		      System.out.println(+count);
		}
}
