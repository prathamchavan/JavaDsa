
import java.util.*;
public class ALP
{
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    //adding elements to list 
    list.add("Ravi");
    list.add("vijay");
    list.add("Ravi");
    list.add("Ajay");

    System.out.println(list);
    
    System.out.println("Using get method");
    System.out.println(list.get(0));
    System.out.println(list.get(3));

    //Iterator
    System.out.println("Values printing using iterator");
    Iterator<String> itr = list.iterator();
    while(itr.hasNext())
    {
      System.out.println(itr.next());
    }
  }
}