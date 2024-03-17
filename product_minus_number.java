package Start_java;

import java.util.Scanner;

public class product_minus_number {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int N=sc.nextInt();
        int product=1;
        int arr[]=new int[10];
        System.out.println("Enter elements in array");
        for(int i=0; i<N; i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the index of number do you want to remove");
        int n=sc.nextInt();

        int temp=arr[n];
        arr[n]=arr[N-1];
        arr[N-1]=temp;
        N--;
        for(int i=0; i<N; i++)
        {
             product=product*arr[i];
        }
        System.out.println(product);

    }
}
