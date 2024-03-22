package Start_java;

public class MostWater {
    public static void main(String[] args) {
        int height[]={1,8,6,2,5,4,8,3,7};
        System.out.println(mostwater(height));
    }
    public static int mostwater(int height[])
    {
        int max=0;
        for(int i=0; i< height.length; i++)
        {
            for(int j=i+1; j< height.length; j++)
            {
                int ht=Math.min(height[i],height[j]);
                int wt=j-i;
                int currwater=ht*wt;
                max=Math.max(max,currwater);
            }
        }
        return max;
    }
}
