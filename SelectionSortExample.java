import java.util.Arrays;

public class SelectionSortExample {
    static int in=0,swap=0,cmp=0;
    public static void main(String[] args) {
        
        int[] array = {15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};
        //,6,7,8,9,10,
        selection_sort(array); in++;

        System.out.println(Arrays.toString(array));

    }

    private static void selection_sort(int[] input) {

        int inputLength = input.length; in++;
        in+=2;
        for (int i = 0; i < inputLength - 1; i++,in+=2) {

            int min = i; in++;

            // find the first, second, third, fourth... smallest value
            in+=2;
            for (int j = i + 1; j < inputLength; j++,in+=2) {
                cmp++;
                if (input[j] < input[min]) {
                    in++;
                    min = j;
                }
            }
            in++;
            cmp++;
            if(input[min]!=input[i]){
            swap++;
            int temp = input[i];    in++;
            input[i] = input[min];  in++;
            input[min] = temp;     in++;
            }
            //next pls
        }
        System.out.println("Interstrucion"+in);
        System.out.println("Compare"+cmp);
        System.out.println("Exchange"+swap);

    }

}
