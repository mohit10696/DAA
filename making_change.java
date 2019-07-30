import java.util.Scanner;
public class make_change {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c[] = {100,25,10,5,1};
        int sol[] = new int[50];
        int sum = 0;
        int j = 0;
        while(sum!=n)
        {
            int x=0,i=0;
            while(n<sum+c[i])i++;
            sum = sum + c[i];
            sol[j] = c[i];
            j++;
        }
        for(int x :  sol)
                {if(x==0)break;
                    System.out.println(" "+x);
                    
                }
    }
}
