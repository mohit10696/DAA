import java.util.Scanner;
public class fibo_it {
  public static void main(String[] args) {
   int first = 0 ; 
   int second = 1 ; 
   int output=0;
   int count= 0; 
   Scanner sc = new Scanner(System.in);
   int length = sc.nextInt();
   if(length==1)output=1;
   for(int i = 2 ; i <= length ; i++ )
   {
       output = first + second;
       first = second;
       second = output;
   }
   System.out.println(output);  
}  
}
