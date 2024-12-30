//Armstrong number in a given range;
import java.util.*;

public class Armstrong 
{
  public boolean checkArmstrong(int num)
    {
      
      int digits = 0;
      int sum = 0;
      int temp = num;
  
      while(temp!=0)
      {
        digits = digits+1;
        temp = temp/10;
      }
      
      temp = num;

      while(temp!=0)
      {
        int rem = temp%10;
        int res =1;
        for(int i=1; i<=digits; i++)
        {
          res = res*rem;
        }
        sum = sum+res;
        temp = temp/10;
      }
  
      return sum == num;
    }

  public static void main(String[] args) 
  {    
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the first number");
    int first = sc.nextInt();

    System.out.println("Enter the last number");
    int end = sc.nextInt();

    Armstrong a = new Armstrong();

    for(int i = first; i<=end; i++)
    {
      if(a.checkArmstrong(i))
      {
        System.out.println(i);
      }
      //System.out.println(a.checkArmstrong(i)); 
    }
  }
}