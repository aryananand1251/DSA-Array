package Start_java;

import java.sql.SQLOutput;
import java.util.*;

public class kth {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of array");
        int N=sc.nextInt();
        int n=3;
        int arr[]=new int[10];
        System.out.println("Enter the elements in array");
        for(int i=0; i<N; i++)
        {
            arr[i]=sc.nextInt();
        }

        int temp;
        int i,x = 0;
        int count=0;
        for(int j=0; j<n; j++) {
            int min = arr[0];
             int max = arr[0];
            for (i = 0; i < N; i++) {
                if (arr[i] >= max) {
                    max = arr[i];


                }
                if (arr[i] <= min) {
                    min = arr[i];
                    x=i;

                }


            }


            count++;
            temp = arr[x];
            arr[x] = arr[N - 1];
            arr[N - 1] = temp;
            N--;
            if(count==n)
            {
                System.out.println(min);

            }
            }

        }




    }



