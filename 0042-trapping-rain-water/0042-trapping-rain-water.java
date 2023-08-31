class Solution {
    public int trap(int[] height) {
        int sum =0;
        if(height==null || height.length<=2)
            return sum;
        int n = height.length;
        
        int right[] =new int[n];
        int left[] = new int[n];
        
        int max = height[0];
        left[0] = max;
        
        for(int i=1;i<n;i++) {
            if(height[i]<max)
            {
                left[i]=max;
            }
            else
            {
                left[i]=height[i];
                max = height[i];
            }
        }
        
         max = height[n-1];
        right[n-1] = max;
            
         for(int i=n-2;i>=0;i--) {
             if(height[i]<max)
            {
                right[i]=max;  
            }
            else
            {  
                right[i]=height[i];
                max = height[i];
            }
        }
        
        for(int i =0;i<n;i++) {
            sum += Math.min(left[i],right[i]) - height[i];
        }
        
        return sum;
    }
}