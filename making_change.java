import java.util.Scanner;
class product{
    public
    float weight;
    float value;
    float ratio ;
    public void assratio()
    {
        ratio = this.value/this.weight;
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
        float W = 10 , weight = 0 , i = 0 ;
        float sol[] = new float[l];
        while(i<= l && weight < W){
            if(weight + x[i].weight <= W) sol[i] =1;
            else sol[i] = (W-weight)/x[i].weight;
            weight = weight + sol[i]*x[i].weight;
               i++;
        }
        for(int x : sol)
        {
            System.out.print(x+" ");
        }
    }
}
