class Solution {
    public int reverse(int x) {
        int remainder = 0;
        int rev = 0;
        //int max = Math.pow(2,31);
        while(x != 0) {
            remainder = x % 10;
            int temprev = rev * 10 + remainder;
            if ((temprev - remainder) / 10 != rev) {
               return 0; 
            }
            rev = temprev;
            x = x /10;
        }
        return x < 0 ? -rev : rev;
    }
}