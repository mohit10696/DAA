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
        int l = sc.nextInt();
        product x[] = new product[l];
        System.out.println("Enter weight & value");
        for(int i = 0 ; i < x.length ; i++)
        {
            x[i] = new product();
            x[i].weight = sc.nextInt();
            x[i].value = sc.nextInt();
            x[i].assratio();
            System.out.println("");
        }
        for (int i = 0; i < l-1; i++)
		for (int j = 0; j < l-i-1; j++)
			if (x[j].ratio > x[j+1].ratio)
			{
					// swap temp and arr[i]
                                        product temp = new product();
					temp = x[j];
					x[j] = x[j+1];
					x[j+1] = temp;
			}
        for(product m : x ){
            System.out.println(m.ratio);
        }
    }
}
