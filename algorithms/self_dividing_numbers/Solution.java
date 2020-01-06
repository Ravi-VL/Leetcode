/*
Self Dividing Numbers

Problem Statement :

A self-dividing number is a number that is divisible by every digit it contains.

For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.

Also, a self-dividing number is not allowed to contain the digit zero.

Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible.

Example 1:

	Input: left = 1, right = 22
	Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]

Note:
The boundaries of each input argument are 1 <= left <= right <= 10000.

*/

//Difficulty Level -- Easy

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> selfDividingNumbersList = new ArrayList<Integer>();
        for(int i=left;i<=right;i++) {
            int eachNumber = i;
            
            if(i > 9) {
                while(eachNumber != 0) {
                    int rem = eachNumber%10;
                    if(rem == 0 || i%rem != 0) {
                        break;
                    }else {
                        eachNumber = eachNumber/10;
                        if(eachNumber < 10 && i%eachNumber == 0) {
                            selfDividingNumbersList.add(i);
                            break;
                        }
                    }
                }
            }else {
                selfDividingNumbersList.add(i);
            }
            
        }
        
        return selfDividingNumbersList;
    }
}


/*

	Time complexity -- Essentially O(n)

	Space complexity -- O(n)

*/



