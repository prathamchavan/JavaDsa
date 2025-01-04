public class p13 {
  public static void main(String[] args) {
    for(int i=5; i>=1; i--)
    {
      int count=i;
      for(int j=1; j<=5; j++)
      {
        System.out.print(" "+count);
        count = count+5;
      }
      System.out.println();
    }
  }
}
