package Start_java;

import java.util.Scanner;

public class Cyclic
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[5];
        System.out.println(arr.length);
        System.out.println("Enter the elements in array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int i;
        // swap the last element of array from each previous element till last element reach the 1st position
        for(i=n-1; i>0; i--)
        {
            int temp=arr[i];
            arr[i]=arr[i-1];
            arr[i-1]=temp;

        }

        for ( i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }
}
