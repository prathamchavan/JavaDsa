import java.util.*;
public class DigitSum {
 public static void main(String[] args)
 {
  Scanner sc = new Scanner(System.in);
  
  System.out.println("Enter the number: ");
  int num = sc.nextInt();

  int sum = 0; //initializing sum

  while(num!=0)
  {
    int rem = num%10;
    sum = sum+rem;
    num=num/10;
  }
  System.out.println(sum+" is the sum of all digits of "+num);
 } 
}
