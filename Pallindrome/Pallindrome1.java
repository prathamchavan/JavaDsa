//pallindrome number using function

import java.util.*;
public class Pallindrome1
{

	public void checkPallindrome(int num)
	{
		int temp = num; //to store the number
		int rev = 0;
		while(num!=0)
		{
			int rem = num%10;
			rev = rev*10 + rem;
			num = num/10;
		}
		
		if(rev == num)
		{
			System.out.println("It is pallindrome number");
		}
		else 
		{
			System.out.println("It is not a pallindrome number");
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		
		Pallindrome1 p = new Pallindrome1();
		p.checkPallindrome(num);

	}
}