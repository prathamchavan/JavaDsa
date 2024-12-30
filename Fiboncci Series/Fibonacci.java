public  class Fibonacci{
  public static void main(String[] args) {
    
    int first=0;
    int second=1;

    System.out.println("Fibonacci series");
    for(int i=0; i<=5; i++)
    {
      System.out.println(first+" ");
      int next = first+second;
      first = second;
      second = next;
    }
  }
}