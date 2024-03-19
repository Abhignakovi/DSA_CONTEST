class Solution {
    public int trap(int[] height) {
        int sum=0;
        int prefixsum[]=new int[height.length];
        int suffixsum[]=new int[height.length];

        prefixsum[0]=height[0];
        for(int i=1;i<height.length;i++){
            prefixsum[i]=Math.max(prefixsum[i-1],height[i]);
        }

        suffixsum[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            suffixsum[i]=Math.max(suffixsum[i+1],height[i]);
        }

        for(int i=0;i<height.length;i++){
            sum=sum+Math.min(suffixsum[i],prefixsum[i])-height[i];
        }

        return sum;
    }
  
}