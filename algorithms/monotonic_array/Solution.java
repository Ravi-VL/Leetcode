/*
Monotonic Array

Problem Statement:

An array is monotonic if it is either monotone increasing or monotone decreasing.

An array A is monotone increasing if for all i <= j, A[i] <= A[j].  An array A is monotone decreasing if for all i <= j, A[i] >= A[j].

Return true if and only if the given array A is monotonic.

Example 1:

	Input: [1,2,2,3]
	Output: true

Example 2:

	Input: [6,5,4,4]
	Output: true

Example 3:

	Input: [1,3,2]
	Output: false

Example 4:

	Input: [1,2,4,5]
	Output: true

Example 5:

	Input: [1,1,1]
	Output: true

Note:

    1 <= A.length <= 50000
    -100000 <= A[i] <= 100000

*/

// Difficulty Level -- Easy

class Solution {
    public boolean isMonotonic(int[] A) {
        int j=1;
        boolean isMonotonicIncreasing = true;
        boolean isMonotonicDecreasing = true;
        
        for(int i=0;i<A.length;i++) {
            if(i <= j && j < A.length) {
                if(A[i] > A[j]) {
                    isMonotonicIncreasing = false;
                    break;
                }
            }
            j++;
        }
        j=1;
        for(int i=0;i<A.length;i++) {
            if(i <= j && j < A.length) {
                if(A[i] < A[j]) {
                    isMonotonicDecreasing = false;
                    break;
                }
            }
            j++;
        }
        
        return (isMonotonicDecreasing || isMonotonicIncreasing);
    }
}


/* 

	Time complexity -- O(n)

	Space complexity -- O(n)

*/

