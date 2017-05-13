/**
 * 
 */
import java.util.Scanner;
/**
 * @author anthony
 *
 */
public class pratice {
	public static void main(String[] arg)
	{
		Scanner input = new Scanner(System.in);
		
		int x;
		int y;
		int z;
		int result;
		
		System.out.print("enter first integer: ");
		x = input.nextInt();
		
		System.out.print("enter second integer: ");
		y= input.nextInt();
		
		System.out.print("enter third integer: ");
		z = input.nextInt();
		
		result = x * y * z;
		
		System.out.printf("Product is %d%n", result);
	}
	

}
