import java.util.Scanner;
class product{
    public
    int weight;
    int value;
    float ratio ;
    public void assratio()
    {
        ratio = (float)this.value/this.weight;
    }
}
public class knapsack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of product");
        product x[] = new product[sc.nextInt()];
        System.out.println("Enter weight & value");
        for(int i = 0 ; i < x.length ; i++)
        {
            x[i] = new product();
            x[i].weight = sc.nextInt();
            x[i].value = sc.nextInt();
            x[i].assratio();
            System.out.println("");
        }
        for (int i = 0; i < n-1; i++)
		for (int j = 0; j < n-i-1; j++)
			if (arr[j] > arr[j+1])
			{
					// swap temp and arr[i]
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
			}
        
    }
}
