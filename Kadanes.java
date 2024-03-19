package Start_java;

import java.util.Scanner;

public class Kadanes {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int a[] = new int[20];
        System.out.println("Enter the elements in array");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0; i<n; i++)
        {
            sum=sum+a[i];
            if(max<sum)
            {
                max=sum;
            }
            if(sum<0)
            {
                sum=0;
            }

        }

        System.out.println(max);
    }
}
