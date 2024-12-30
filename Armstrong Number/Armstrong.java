//armstrong number without any inbuilt function
import java.util.*;
public class Armstrong 
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    //Take input for the number
    System.out.println("Enter the number: ");
    int num = sc.nextInt();
    int digit = 0;
    
    int temp = num;
    int sum = 0;
    
    while(temp != 0 )
    {
        digit = digit+1;
        temp = temp/10;
    }

    System.out.println("Number of digits in "+num+" is "+digit);


    temp = num;
    while(temp!=0)
    {
      int rem = temp % 10; //seperating digit values

      //creating power logic
      int res=1;

      // for(int i=1; i<=digit; i++)
      // {
      //   res = res*rem;
      // }

      int i =1;
      while(i<=digit)
      {
        res = res * rem;
        i++;
      }
      
      sum = sum + res;

      temp = temp/10;

    }
    
    if(num == sum)
    {
      System.out.println("Armstrong");
    }
    else
    {
      System.out.println("Not armstrong");
    }
  }
}