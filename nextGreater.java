package Start_java;

import java.util.Stack;

public class nextGreater {
    public static void main(String[] args) {
        int arr[]={4,7,1,0,2};
        int n= arr.length;
        Stack<Integer> s=new Stack<Integer>();
        int nextGreater[]=new int[n];
        for(int i=n-1; i>=0; i--)
        {
            while(!s.empty() && arr[s.peek()] <=arr[i] )
            {
                s.pop();
            }
            if(s.empty()) {
                nextGreater[i] = -1;
            }
            else {
                nextGreater[i] = arr[s.peek()];
            }
            s.push(i);
        }
        for (int i=0; i<n; i++) {
            System.out.print(nextGreater[i]+" ");
        }
    }
}
