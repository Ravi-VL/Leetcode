/*
Rotated Digits

Problem Statement:

X is a good number if after rotating each digit individually by 180 degrees, we get a valid number that is different from X.  Each digit must be rotated - we cannot choose to leave it alone.

A number is valid if each digit remains a digit after rotation. 0, 1, and 8 rotate to themselves; 2 and 5 rotate to each other; 6 and 9 rotate to each other, and the rest of the numbers do not rotate to any other number and become invalid.

Now given a positive number N, how many numbers X from 1 to N are good?

Example:
	Input: 10
	Output: 4
	Explanation: 
	There are four good numbers in the range [1, 10] : 2, 5, 6, 9.
	Note that 1 and 10 are not good numbers, since they remain unchanged after rotating.

Note:

    N  will be in range [1, 10000].

*/

//Difficulty Level -- Easy

class Solution {
    public int rotatedDigits(int N) {
        int goodNumCount = 0;
        for(int i=1;i<=N;i++) {
            if(i<=10) {
                if(i==2 || i==5 || i==6 || i==9) {
                    goodNumCount++;
                }
            }else {
                if( checkGoodNumber(i) ) {
                    goodNumCount++;
                }
            }
        }
        
        return goodNumCount;
    }
    
    public static boolean checkGoodNumber(int num) {
        boolean isGood = false;
        while(num != 0) {
            int rem = num%10;
            if( (rem == 3) || (rem == 4) || (rem == 7) ) {
                return false;
            }
            if(rem == 2 || rem == 5 || rem == 6 || rem == 9) {
                isGood = true;
            }
            num /= 10;
        }
        
        return isGood;
    }
    
}


/*

	Time complexity -- Essentially O(n)

	Space complexity -- O(1)

*/

