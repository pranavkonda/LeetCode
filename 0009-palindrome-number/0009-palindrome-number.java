class Solution {
    public boolean isPalindrome(int x) {
       if (x < 0) return false;
       int y = 0;
       int remainder = 0;
       int original = x;
       while(original!= 0) {
           remainder = original % 10;
           y = y * 10 + remainder;
           original = original/10;
       }
       if (x == y) return true;

         return false;
    }
}