public class A {
  public static void main(String[] args) {
    int num = 39;
    int count = 0;

    for (int i = 1; i<=num; i++){
      if(num % i == 0){
        count = count++;
      }
    }

    if(count <= 2 )
    {
      System.out.println("The number is not prime");
    }
    else {
      System.out.println(num + " is a prime number.");
    }
  }
}