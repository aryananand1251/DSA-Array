package Start_java;

import java.util.Scanner;

public class separate_neg_pos {
    public static void main(String[] args) {
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
            if (arr[i] < 0) { 
                 
                    temp = arr[i]; 
                    arr[i] = arr[j]; 
                    arr[j] = temp; 
                
                j++; 
            } 
        }
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
