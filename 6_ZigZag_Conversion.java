/*
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this 
pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R

And then read line by line: "PAHNAPLSIIGYIR"
Write the code that will take a string and make this conversion given a number of rows:
string convert(string text, int nRows);
convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
*/

class Solution {
    public String convert(String s, int numRows) {
        int len = s.length();  
        if (len == 0 || numRows < 2) return s;  
          
        String ret = "";  
        int lag = 2*numRows - 2; //循环周期  
        for (int i = 0; i < numRows; i++) {  
            for (int j = i; j < len; j += lag) {  
                ret += s.charAt(j);  
                  
                //非首行和末行时还要加一个  
                if (i > 0 && i < numRows-1) {  
                    int t = j + lag - 2*i;  
                    if (t < len) {  
                        ret += s.charAt(t);  
                    }  
                }  
            }  
        }  
        return ret;
    }
}
