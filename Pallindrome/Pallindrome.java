import java.util.*;

public class Pallindrome {
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int num = sc.nextInt();
    int temp = num;
    int rev = 0;

    while(num!=0)
    {
      int rem = num % 10;
      rev = rev*10+rem;
      num = num/10;
    }

    if(temp == rev)
    {
      System.out.println("Number is Pallindrome");
    }
    else
    {
      System.out.println("Not a pallindrome number");
    }
  }
}
