/* ProblemThree.java
 * 
 * @author: Jeremy Dennen
 * @version: 1.0
 */ 

public class ProblemThree {
  public static void main(String argv[]) {
    final int NUM = 13195;
    
    for (int i=3; i<NUM; i++) {
      if (NUM%i == 0 /*&& i.isPrime()*/) {
        for (int n = 2; n<i; n++) {
          if (i%n==0)
            return false;
        }
        return true;
      }
    }
    
    
    //System.out.println();
  }
  
  //function to determine if 
  public static boolean isPrime(int n) {
    
  }
}