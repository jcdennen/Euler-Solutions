/* ProblemTwo.java
 * 
 * @author: Jeremy Dennen
 * @version: 1.0
 */ 

public class ProblemTwo {
  public static void main(String argv[]) {
    int sum = 2;
    for (int a=1, b=2, c=0; c<4000000; c=a+b, a=b, b=c) {
      System.out.println(c);
      if (c%2==0)
        sum += c;
    }
    System.out.println("Answer: " + sum);
  }
}