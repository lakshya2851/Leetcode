class Solution {
    public boolean validPalindrome(String s) {
     int i =0;
     int j=s.length()-1;
     int cnt1=0;
     while(i<=j)
     {
        if (s.charAt(i)!=s.charAt(j))
        {
            cnt1++;
            i++;
        }
        else
        {
            i++;
            j--;
        }
     }   
     int cnt2 =0;
     i=0;
     j=s.length()-1;
      while(i<=j)
     {
        if (s.charAt(i)!=s.charAt(j))
        {
            cnt2++;
            j--;
        }
        else
        {
            i++;
            j--;
        }
     }   
     if(cnt1<=1 || cnt2<=1)
     {
        return true;
     }
     return false;
    }
}