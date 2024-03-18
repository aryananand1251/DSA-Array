package Start_java;


import java.util.*;

public class Union {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //There are two approach to solve this problem
        // 1st:Basic approach using nested loop (Time complexity O(n^2))
        // 2nd:Using Frequency array Time complexity=O(n)
        System.out.println("Enter the size of both array");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int a[]=new int[5];
        int b[]=new int[5];
        int i,j,k;
        int count=0;
        System.out.println("Enter elements in array a");
        for( i=0; i<m; i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter elements in array b");
        for( i=0; i<n; i++)
        {
            b[i]=sc.nextInt();
        }
        // If elements are sorted then we just assign the min value =1st index of array
        // and max value =(n-1) index of array
        int max1=a[0];
        int max2=b[0];
        int min1=a[0];
        int min2=a[0];
        // but when elements are not sorted we have to find both min and max
        // here we use Math.max/min function so we can optimize our code
        for(i=0; i<a.length; i++) {
            max1 = Math.max(max1, a[i]);
            min1=Math.min(min1,a[i]);
        }
        for(i=0; i<b.length; i++) {
            max2 = Math.max(max2, b[i]);
            min2=Math.min(min2,b[i]);
        }
        // here we find larges between both max
        // and smallest between both min
        int largest=Math.max(max1,max2);
        int smallest=Math.min(min1,min2);


        for(i=smallest; i<=largest; i++)
        {
            int flag=0;
            for(j=0; j<a.length; j++)
            {
                if(a[j]==i )
                {
                    count++;
                    flag=1;
                    break;
                }

            }
            if(flag==0) {
            for (k = 0; k < b.length; k++) {
                if (b[k] == i) {
                    count++;
                    break;

                }

            }
        }

        }


        // second approach and very important and optimize approach

        // freq[] array of length [largest+1]
        int freq[]=new int[largest+1];

        //frew of element of a[]
        for( i=0; i<a.length; i++)
        {
            freq[a[i]]++;
        }

        //frew of element of b[]
        for( i=0; i<b.length; i++)
        {
            freq[b[i]]++;
        }

        // here loop start from 0 to length of freq[]
        // and compare if the freq of elements are >=1 it means element is present in both array
        // and count++ so we can find no of elements in array
        for (i=0; i<freq.length; i++) {
            if(freq[i]>=1)
            {
                count++;
            }
        }
        System.out.println(count);



    }
}
