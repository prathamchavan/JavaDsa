//program to find the 

import java.util.*;
public class Power
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		System.out.println("Enter the power");
		int pow = sc.nextInt();
		int temp = pow;
		int res = 1;

		while(pow != 0)
		{
			res = res * num;
			pow--;
		}

		System.out.println(num+" ^ "+temp+" = " +res);
	}
}