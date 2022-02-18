import java.util.InputMismatchException;
import java.util.Scanner;
public class ChuVi {
	   public static void main(String[] args) {
           Scanner scan = new Scanner(System.in);
           double c;
           try
           { 
             System.out.println("nhap ban kinh:");
             double r = scan.nextDouble();
             c=2*r*3.14;
             System.out.print(c);
           }
           catch (InputMismatchException e )
           { 
             System.out.print(e);
           }
           
    }

}
