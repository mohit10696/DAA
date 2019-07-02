import java.util.Scanner;
public class fibo_it {
  public static void main(String[] args) {
   int count = 0;
   int first = 0 ;        count++;
   int second = 1 ;       count++;
   int output=0;          count++;
   Scanner sc = new Scanner(System.in);
   int length = sc.nextInt();
   count++;
   if(length == 1 ){ ;output=0; count++;}
   count+=2;
   for(int i = 2 ; i <= length ; i++  , count+=2)
   {
       output = first + second;   count++;
       first = second;            count++;
       second = output;           count++;
   }
   System.out.println(output);  
      System.out.println(count);
}  
}
