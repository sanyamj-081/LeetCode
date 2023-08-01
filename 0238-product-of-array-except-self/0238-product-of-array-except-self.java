class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zero = 0;
        int arr[] = new int[nums.length];
        Arrays.fill(arr,0);
        int index =0;
        
        for(int i=0;i<nums.length;i++) {
            if(nums[i] == 0){
                zero++;
            index = i;
            }
        }
        
        if(zero > 1)
            return arr;
        
        int p=1;
        
        if(zero == 1) {
           for(int i=0;i<nums.length;i++) {
               if(nums[i] != 0) {
                   p *= nums[i];
                 
                }
               
                  
           }
            System.out.println(index);
           
               
                    arr[index] = p;               
            
            return arr;
        }
        
        int prod = 1;
        
        if(zero == 0) {
            for(int i=0;i<nums.length;i++) {
                prod *= nums[i];
            }
            for(int i=0;i<nums.length;i++) {
                arr[i] = prod /nums[i];
            }
            
            
        }
        return arr;
         
    }
}