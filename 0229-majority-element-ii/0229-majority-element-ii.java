class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length, number1 = nums[0], number2 = nums[0], c1 = 0, c2 = 0;
        if (nums == null || nums.length == 0)
		return new ArrayList<Integer>();
        
        for(int i =0 ;i<n;i++) {
            if(nums[i] == number1)
                c1++;
            else if(nums[i] == number2) 
                c2++;
            else if(c1 == 0){
                number1 = nums[i];
                c1=1;
            }
            else if(c2== 0){
                number2 = nums[i];
                c2=1;
            }
            else {
                c1--;
                c2--;
            }
        }
        c1 = 0;
        c2 = 0;
        for(int i =0 ;i <n ;i++) {
            if(nums[i] == number1)
                c1++;
            else if(nums[i] == number2)
                c2++;
            
        }
              List<Integer> l = new ArrayList<>();
        if(c1 > n/3)
            l.add(number1);
        if(c2 > n/3)
            l.add(number2);
  
 
        return l;
    }
}