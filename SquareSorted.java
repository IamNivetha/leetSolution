class SquareSorted{
    public int[] SortedSquares(int [] nums)
    {
        int n = nums.length;
        int left = 0;
        int rigth = n-1;
        int pos = n-1;
        int [] result = new int[n];
        for(int i = 0;i<=nums.length-1;i++)
        {

            if(Math.abs(nums[left])>Math.abs(nums[rigth]))
            {
               result[pos] = nums[left]*nums[left];
               left++;
            }
            else
            {
                result[pos] = nums[rigth]*nums[rigth];
                rigth--;
            }
            pos--;
            
        }
        return result;
    }
}