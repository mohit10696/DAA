import java.util.Scanner;
 
class BubbleSort {
  public static void main(String []args) {
    int n, c, d, swap,count=0,compare=0,exchange=0;
    Scanner in = new Scanner(System.in);    count++; 
    System.out.println("Input number of integers to sort");
    n = in.nextInt();
 
    int array[] = new int[n]; count++;
 
    System.out.println("Enter " + n + " integers");
    
    for (c = 0; c < n; c++)
      array[c] = in.nextInt();
   count+=2;
   
    for (c = 0; c < ( n - 1 ); c++,count+=2) {
        
        count+=2;
      for (d = 0; d < n - c - 1; d++,count+=2) {
          count++;      compare++;
        if (array[d] > array[d+1]) /* For descending order use < */
        {   
          exchange++;
          swap        = array[d];   count++;
          array[d]   = array[d+1];  count++;
          array[d+1] = swap;        count++;
        }
      }
    }
 
    System.out.println("Sorted list of numbers:");
 
    for (c = 0; c < n; c++)
      System.out.println(array[c]);
      System.out.println("Counter is "+count);
      System.out.println("Compare is"+compare);
      System.out.println("Exchange is "+exchange);
      
      
  }
}