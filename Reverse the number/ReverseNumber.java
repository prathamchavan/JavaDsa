import java.util.*;
public class ReverseNumber {
  public int reverseNumber(int num)
  {
    int rev = 0;
    while(num!=0)
    {
      int rem = num%10;
      rev = rev * 10 + rem;
      num = num / 10;
    }
    return rev;
  }

  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int num = sc.nextInt();

    ReverseNumber reverse = new ReverseNumber();

    System.out.println("Reverse number is "+reverse.reverseNumber(num));
  }
}
