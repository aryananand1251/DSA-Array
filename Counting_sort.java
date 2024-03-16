package Start_java;

import java.util.Scanner;

public class Counting_sort
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int a[] = new int[8];
        System.out.println("Enter the elements in array");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int largest=Integer.MIN_VALUE;
        for(int i=0; i<a.length; i++)
        {
            if (a[i] > largest) {
                largest = a[i];
            }
        }
        int count[]=new int[largest+1];
        for(int i=0; i<a.length; i++)
        {
            count[a[i]]++;
        }
        int j=0;
        for(int i=0; i<count.length; i++)
        {
            while(count[i]>0)
            {
                a[j]=i;
                j++;
                count[i]--;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]);
        }


    }
}
