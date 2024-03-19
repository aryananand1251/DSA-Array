package Start_java;

import java.util.Arrays;
import java.util.Scanner;

public class Diff_Max_Min_k {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of array");
        int N=sc.nextInt();
        System.out.println("Enter the value of K");
        int k=sc.nextInt();
        int arr[]=new int[4];
        System.out.println("Enter the elements in array");
        for(int i=0; i<N; i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int min=arr[0];
        int max=arr[N-1];
        int presDiff=max-min;
        for(int i=1; i<N; i++)
        {
            if(arr[i]-k<0)
            {
                continue;
            }
            min=Math.min(arr[i]-k,arr[0]+k);
            max=Math.max(arr[i-1]+k,arr[N-1]-k);
            presDiff=Math.min(presDiff,max-min);
        }
        System.out.println(presDiff);


    }
}
