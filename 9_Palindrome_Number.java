/*
Determine whether an integer is a palindrome. Do this without extra space.

Some hints:
Could negative integers be palindromes? (ie, -1)
If you are thinking of converting the integer to string, note the restriction of using extra space.
You could also try reversing an integer. However, if you have solved the problem "Reverse Integer", you know that the reversed integer might overflow. How would you handle such case?
There is a more generic way of solving this problem.
*/

class Solution {
    public boolean isPalindrome(int x) {
        int ret = 0;
        int digit = 0;
        int xx = x;
        boolean neg_flag = false;
        
        if(x>-1&&x<9)
            return true;
    
        if (x < 0) {
            return false; 
        }
            
        while (x > 0) {
            digit = x % 10;
            
            if (ret != 0) {
                if ((Integer.MAX_VALUE - digit) / ret < 10 ) 
                    return false;
            }
            
            ret = ret * 10 + digit;
            x = x / 10;
        }
        
        if(ret == xx){
            return true;
        }else{
           return false; 
        }
    }
}
