/*

N-Repeated Element in Size 2N Array

In a array A of size 2N, there are N+1 unique elements, and exactly one of these elements is repeated N times.

Return the element repeated N times.

Example 1:

	Input: [1,2,3,3]
	Output: 3

Example 2:

	Input: [2,1,2,5,3,2]
	Output: 2

Example 3:

	Input: [5,1,5,2,5,3,5,4]
	Output: 5

Note:

    4 <= A.length <= 10000
    0 <= A[i] < 10000
    A.length is even

*/


// Difficulty Level -- Easy

class Solution {
    public int repeatedNTimes(int[] A) {
//         Arrays.sort(A);
        
//         if(A[0] == A[A.length/2 -1]) {
//             return A[0];
//         }else {
//             return A[A.length/2];
//         }
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int num : A) {
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        
        for(int num : A) {
            if(map.get(num) == A.length/2) {
                return num;
            }
        }
        
        return -1;
    }
}


/*

	Time complexity -- O(n)

	Space complexity -- O(n)	
	
*/

