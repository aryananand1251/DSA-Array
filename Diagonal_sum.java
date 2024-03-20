package Start_java;

public class Diagonal_sum {

    public static int diagonalsum(int matrix[][])
    {
        // 1st approach T.C O(n^2)
        int sum=0;
       /* for(int i=0; i<matrix.length; i++)
        {
            for(int j=0; j< matrix.length; j++)
            {
                if(i==j)
                {
                    sum=sum+matrix[i][j];
                }
                if(i+j==matrix.length-1)
                {
                    sum=sum+matrix[i][j];
                }
            }
        }*/

        // 2nd approach T.C O(n).
        // run only one approach at a time to visualise better result.
        for(int i=0; i< matrix.length; i++)
        {
            sum=sum+matrix[i][i];
            if(i!= matrix.length-1-i)
            {
                sum=sum+matrix[i][matrix.length-1-i];
            }

        }
        System.out.println(sum);
        return 0;

    }

    public static void main(String[] args) {
        int matrix[][]={{1,2,3},
                      {5,6,7},
                     {9,10,11}};
        diagonalsum(matrix);

    }
}
