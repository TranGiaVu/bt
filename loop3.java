package loop;
import java.util.Scanner;
public class loop3 
{
   public static void main(String[] args) 
   {
	   Scanner input = new Scanner(System.in);
	   try
		{
			System.out.print("input number: ");
			int num = input.nextInt();	
			
			int sum = 0;
			for(int i = 1; i <= num; ++i)
			{
				sum += i;
			}
			System.out.println("Sum = " + sum);
	   }
	   catch(Exception e) {
			System.out.print(e);
		}
   }
}
