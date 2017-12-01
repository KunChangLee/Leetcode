/**
There are two sorted arrays nums1 and nums2 of size m and n respectively.
Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

Example 1:
nums1 = [1, 3]
nums2 = [2]
The median is 2.0

Example 2:
nums1 = [1, 2]
nums2 = [3, 4]
The median is (2 + 3)/2 = 2.5
**/

class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        vector<int> vec = nums1;
        for(int num : nums2)
            vec.push_back(num);
        sort(vec.begin(), vec.end());
        if((nums1.size() + nums2.size()) % 2)
            return vec[(nums1.size() + nums2.size()) / 2];
        else
            return (vec[(nums1.size() + nums2.size()) / 2] + vec[(nums1.size() + nums2.size()) / 2 - 1]) / 2.0;
    }
};
