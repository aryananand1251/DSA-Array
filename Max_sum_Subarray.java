package Start_java;

import java.util.Scanner;

public class Max_sum_Subarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[5];
        int max=Integer.MIN_VALUE;
        int j;
        int i;
        int sum=0;
        System.out.println(arr.length);
        System.out.println("Enter the elements in array");
        for ( i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int presum[]=new int[arr.length];
        presum[0]=arr[0];
        for(i=1; i<presum.length; i++) {
            presum[i] = presum[i - 1] + arr[i];
        }

        for( i=0; i<n; i++)
        {
            int start=i;
            for(j=i; j<n; j++)
            {
                int end=j;
                if(start==0)
                {
                    sum=presum[end];
                }
                else {
                    sum=presum[end]-presum[start-1];
                }

                if(max<sum)
                {
                    max=sum;
                }

            }
        }
        System.out.println("max sum "+ ""+max);
    }
}
