package Start_java;
import java.util.*;

public class subarrays {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[10];
        int max=Integer.MIN_VALUE;

        System.out.println("Enter the elements in array");
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++)
        {
            int start=i;
            for(int j=i; j<n; j++)
            {
                int end=j;
                int sum=0;
                for(int k=start; k<=end; k++)
                {

                    System.out.print(arr[k]);

                }
                System.out.println("");

            }
            System.out.println();
        }
        System.out.println("max sum "+ ""+max);


    }



}
