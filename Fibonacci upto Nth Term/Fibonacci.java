//Fibonacci upto Nth Term;
import java.util.*;
public class Fibonacci {
  public static void main(String[] args)
  {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter Nth term");
  int num = sc.nextInt();
  int first=0;
  int second=1;
  int next;

  System.out.println("Printing the fibonacci series!");
  for (int i = 0; i<=num; i++)
  { 
    System.out.println(first+" ");
     next = first+second;
    first = second;
    second = next;
  }
}
}