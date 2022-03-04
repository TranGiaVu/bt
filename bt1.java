package ifelse;
import java.util.Scanner;
public class bt1 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		try
		{
			System.out.print("input number: ");
			int number = input.nextInt();	
			
			if(number > 0)
    	{
    		System.out.println(number+" is positive");
    	}
    		else if(number < 0)
    	{
        	System.out.println(number+" is negative");
    	}
    		else
    	{
    		System.out.println(number+" is neither positive nor negative");
    	}
		}
		catch(Exception e) {
			System.out.print(e);
		}
}
}
