
import java.util.*;
public class Power1
{
	public static int power(int base, int expo)
	{
		int res = 1;
		while(expo!=0)
		{
			res = res * base;
			expo--;
		}

		return res;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter the number: ");
		int base = sc.nextInt();

		System.out.println("Enter an exponential");
		int expo = sc.nextInt();

		int res = power(base, expo);

		System.out.println(base+" ^ "+expo+" = "+res);
		
	}
}