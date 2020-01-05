/*
Problem Statement

You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.

The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".


Example 1:

Input: J = "aA", S = "aAAbbbb"
Output: 3

Example 2:

Input: J = "z", S = "ZZ"
Output: 0

Note:

    S and J will consist of letters and have length at most 50.
    The characters in J are distinct.

*/


// Difficulty Level -- Easy


class Solution {
    public int numJewelsInStones(String J, String S) {
        if( J.length() == 0 || S.length() == 0 ) {
            return 0;
        }
        
        char jewelArray[] = J.toCharArray();
        List<Character> jewelList = new ArrayList<Character>();
        
        for(int i=0;i<jewelArray.length;i++) {
            jewelList.add(jewelArray[i]);
        }
        
        char stoneArray[] = S.toCharArray();
        
        int count = 0;
        
        for(int i=0;i<stoneArray.length;i++) {
            if(jewelList.indexOf(stoneArray[i]) != -1) {
                count++;
            }
        }
        
        return count;
    }
}


/*

	Time complexity -- O(n)

	Space complexity -- O(n)

	where n is length of the larger string.

*/




