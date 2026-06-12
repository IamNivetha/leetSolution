class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
         Arrays.sort(nums); 
        int n = nums.length-1;
        int target = 0,i=0 ;
               
        
        for( i = 0;i<n;i++){
        if(i > 0 && nums[i] == nums[i-1]) {
            continue;
        }

            int j = i+1;
            int k = n;
             while(j<k)
            {
                long sum = nums[i] + nums[j] + nums[k];
                if(sum < target)
                {
                    j++;
                }
                else if(sum > target)
                {
                    k--;
                }
                else
                {
                   List<Integer>temp = Arrays.asList(nums[i],nums[j],nums[k]);
                   ans.add(temp);
                   j++;
                   k--;

                   while(j<k && nums[j] == nums[j-1])j++;
                   while(j<k && nums[k] == nums[k + 1])k--;               
                }
            }
        }
        
        
        return ans;
        
        
    }
}