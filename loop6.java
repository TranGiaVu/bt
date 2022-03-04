package loop;
import java.util.Scanner;
public class loop6 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
			System.out.print("input min number: ");
			int min = input.nextInt();
			System.out.print("input max number: ");
			int max = input.nextInt();
			String  prime = "";

		       for (int i = min; i <= max; i++)         
		       { 		  	  
		          int counter=0; 	  
		          for(int 	num =i; num>=1; num--)
			  {
		             if(i%num==0)
			     {
		 		counter = counter + 1;
			     }
			  }
			  if (counter ==2)
			  {
			     prime = prime + i + " ";
			  }	
		       }
		       System.out.println(prime);
		}
}
