package Start_java;

public class twoPointerApproach {
    public static void main(String[] args) {
        int height[]={4,3,6,2,5,4,9,6};
        System.out.println(mstwater(height));

    }
    public static int mstwater(int height[])
    {
        int max=0;
        int end= height.length-1;
        for(int i=0; i< height.length; i++)
        {
            int ht=Math.min(height[i],height[end]);
            int width=end-i;
            int currwater=ht*width;
            max=Math.max(max,currwater);
        }
        return max;
    }
}
