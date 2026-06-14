class MaxLenSub {
    public int lengthOfLongestSubstring(String s) {
        int left = 0,right = 0;
        int n = s.length()-1;
        int maxLen = 0;
        Set<Character>set = new HashSet<>();
        while(right<=n)
        
            {
               while(set.contains(s.charAt(right)))
               {
                set.remove(s.charAt(left));
                left++;
               }
               set.add(s.charAt(right));
               
              maxLen = Math.max(maxLen,right-left+1);
              right++;
            }
            return maxLen;
        
    }
}