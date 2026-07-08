import java.util.*;
class Jewels {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer>m = new HashMap<>();
        int count = 0;
        for(char ch : jewels.toCharArray())
        {
            m.put(ch,1);
        }
        for(char c : stones.toCharArray())
        {
            if(m.containsKey(c))
            {
                count++;
            }
        }
        return count++;
    }
}