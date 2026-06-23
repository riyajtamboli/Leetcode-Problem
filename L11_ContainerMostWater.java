public class L11_ContainerMostWater{
    public static void main(String[] args) {
        int heights[] = {1,8,6,2,5,4,8,3,7};
        IO.println(maxWater(heights));
        IO.println("Using 2 Pointer : "+maxWater(heights));
    } 

    public static int maxWater(int heights[]){
        int maxWater = 0;
        int n = heights.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int width = j-i;
                int ht = Math.min(heights[i], heights[j]);
                int area = ht * width;
                maxWater = Math.max(maxWater, area);
            }
        }

        return maxWater;
    }
     public int maxArea(int[] heights) {
        int maxWater = 0;

         int n = heights.length;
         int lp = 0;
         int rp = n-1;
       
        while(lp < rp){
            int w = rp - lp;
            int ht = Math.min(heights[lp], heights[rp]);
            int area = w * ht;
            maxWater = Math.max(area, maxWater);

             if (heights[lp] < heights[rp]) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxWater;
    }
}