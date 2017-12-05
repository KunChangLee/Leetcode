/**
*Given a 32-bit signed integer, reverse digits of an integer.
*
*Example 1:
*Input: 123
*Output:  321
*
*Example 2:
*Input: -123
*Output: -321
*
*Example 3:
*Input: 120
*Output: 21
*
*Assume we are dealing with an environment which could only hold integers within the 32-bit signed integer range. For the purpose 
*of this problem, assume that your function returns 0 when the reversed integer overflows.
*/

class Solution {
    public int reverse(int x) {
        int ret = 0;
        int digit = 0;
        boolean neg_flag = false;
    
        if (x < 0) {
            neg_flag = true;
            x = -1 * x;  //covert to abs(x), and record the symbol of negative or positive. 
        }
            
        while (x != 0) {
            digit = x % 10; //get the last digit of x
            
            if (ret != 0) {  //must follow this pattern to check 
                if ((Integer.MAX_VALUE - digit) / ret < 10 ) 
                    return 0;
                    
                if (neg_flag == true) {
                    if (-10 < (Integer.MIN_VALUE + digit) / ret) 
                    // - (ret * 10 + digit) < Integer.MIN_VALUE
                    //if we convert the number to abs, we need to compare it in negative form with Integer.MIN_VALUE
                   return 0;
                } 
            }
            
            ret = ret * 10 + digit;
            x = x / 10; //chop off the last digit of x
        }
        
        if (neg_flag == true && ret > 0)
            ret = -1 * ret;
            
        return ret;
    }
}
