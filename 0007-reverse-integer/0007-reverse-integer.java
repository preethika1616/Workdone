class Solution {
    public int reverse(int x) {
      int ans=0;

      while(x != 0){
        int y= x % 10;
        x = x / 10;
        if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 &&  y > 7)) return 0;
            if (ans < Integer.MIN_VALUE / 10 || (ans == Integer.MIN_VALUE / 10 && y < -8)) return 0;

        ans=(ans*10) + y;
      }
      return ans;
    }
       
    
}