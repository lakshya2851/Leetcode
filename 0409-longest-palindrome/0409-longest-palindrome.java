class Solution {
public int longestPalindrome(String s) {
        HashMap< Character, Integer > map = new HashMap<>();
        for (int i = 0; i < s.length(); i++ ) {
            char ch =s.charAt(i);

            if (map.containsKey(ch)) {
                int prev = map.get(ch);
                prev += 1;
                map.put(ch, prev);

            } else {
                map.put(ch, 1);
            }
        }
        int ans =0;
        int odd=0;
        for(char key:map.keySet())
        {
            int freq =map.get(key);
            if (freq%2==0)
            {
                ans+=freq;
            }else
            {
                ans+=freq-1;
                odd++;
            }

        }if (odd>0)
        ans+=1;
        return ans;

    }
}