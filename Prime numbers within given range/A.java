

public class A {
  static boolean isPrime(int n)
  {
    int count = 0;

    if(n<2)
    {
      return false;
    }
    
    for(int i=0 ; i<n; i++)
    {
      if(n % 1 == 0)
      {
        return false;
      }
      return true;
    }
  }

  public static void main(String args[]){
    
  }
}
