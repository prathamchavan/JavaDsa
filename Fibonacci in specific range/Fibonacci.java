
import java.util.Scanner;

//Fibonacci in specific range;

public class Fibonacci {
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first");
    int first = sc.nextInt();

    System.out.println("Enter end");
    int end = sc.nextInt();

    int a = 0, b = 1;
    int next;
    for(int i=first; i<=end;i++)
    {
      if()
      {
      System.out.println(a+" ");
      }
      next = a+b;
      a = b;
      b = next;
    }


  }
}
