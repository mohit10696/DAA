import java.util.Scanner;
class product{
    public
    int weight;
    int value;
    float ratio ;
    int x;
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
        System.out.println("Enter required rate");
        int W = sc.nextInt();
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
        int i = 0,weight=0;
        while(i<l && weight < W)
        {
            if(weight + x[i].weight <= W)x[i].x = 1 ;
            else x[i].x = (W - weight)/x[i].weight;
            weight = weight + x[i].x*x[i].weight;
            i++;
        }
        for(product n : x)
        {
            System.out.println("Product "+n.weight+"ratio"+n.x);
        }
    }
}
