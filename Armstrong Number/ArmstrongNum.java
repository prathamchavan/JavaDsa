//Armstrong number using custom function

import java.util.*;
public class ArmstrongNum {
  
  public void checkArmstrong(int num)
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

    if(sum==num)
    {
      System.out.println("Armstron Number");
    
    }
    else 
    {
      System.out.println("Not Armstrong Number");
 
    }
  
}



  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number ");
    int num = sc.nextInt();
    ArmstrongNum a = new ArmstrongNum();
    a.checkArmstrong(num);
  }
}
