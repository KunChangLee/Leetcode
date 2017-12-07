/*
Given an integer, convert it to a roman numeral.

Input is guaranteed to be within the range from 1 to 3999.
*/

class Solution {
public:
    void setDigit(string &res, int n, char a, char b, char c) {
         if (n < 4) {
            for (int i = 0; i < n; ++i) {
                res.push_back(a);
            }
        }
        if (n == 4) {
            res.push_back(a); 
            res.push_back(b);
        }
        if (n == 5) res.push_back(b);
        if (n > 5 && n < 9) {
            res.push_back(b);
            for (int i = 5; i < n; ++i) {
                res.push_back(a);
            }
        }
        if (n == 9) {
            res.push_back(a);
            res.push_back(c);
        }
    }
    string intToRoman(int num) {
        int t = (num / 1000) % 10, h = (num / 100) % 10, d = (num / 10) % 10, n = num % 10;
        string res;
        setDigit(res, t, 'M', '?', '?');
        setDigit(res, h, 'C', 'D', 'M');
        setDigit(res, d, 'X', 'L', 'C');
        setDigit(res, n, 'I', 'V', 'X');
        return res;
    }
};
