
import java.util.*;

public class PrimeNum
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the first number: ");
    int start = sc.nextInt();

    System.out.println("Enter the last number: ");
    int end = sc.nextInt();

    for (int i=start; i<=end; i++)
    {
      int count = 0;
      for(int j=1; j<=i; j++)
      {
        if(i % j == 0)
        {
          count = count+1;
        }
      }
      if(count == 2){

        System.out.println(i + " is prime number");
      }
    }
  }
}