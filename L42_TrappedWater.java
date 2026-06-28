public class L42_TrappedWater {
    void main(){
        int heights[] = {4,2,0,3,2,5};
        IO.println(TrppedWater(heights));
    }

    public static int TrppedWater(int heights[]){
        int n = heights.length;
        int leftHeights [] = new int[n];
         leftHeights[0] = heights[0];
        for(int i=1; i<heights.length; i++){
            leftHeights[i] = Math.max(heights[i], leftHeights[i-1]);
        }

        int rightHieghts[] = new int[n];
        rightHieghts[n-1] = heights[n-1];

        for(int i=n-2; i>=0; i--){
            rightHieghts[i] = Math.max(heights[i], rightHieghts[i+1]);
        }

        int trapWater = 0;

        for(int i=0; i<n; i++){
            int waterLevel = Math.min(leftHeights[i], rightHieghts[i]);
            trapWater += waterLevel - heights[i];
        }

        return trapWater;
    }
}
