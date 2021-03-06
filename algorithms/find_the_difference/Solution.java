/*
Find the Difference

Problem Statement:

Given two strings s and t which consist of only lowercase letters.

String t is generated by random shuffling string s and then add one more letter at a random position.

Find the letter that was added in t.

Example:

	Input:
	s = "abcd"
	t = "abcde"

Output:
	e

Explanation:
	'e' is the letter that was added.


*/

// Difficulty Easy


class Solution {
    public char findTheDifference(String s, String t) {
        
        List<Character> tList = new ArrayList<Character>();
        
        char sArr[] = s.toCharArray();
        char tArr[] = t.toCharArray();
        
        for(char c: tArr) {
            tList.add(c);
        }
        
        for(int i=0;i<sArr.length;i++) {
            if(tList.contains(sArr[i])) {
                tList.remove(new Character(sArr[i]));
            }
        }
        
        return tList.get(0);
    }
}



/*
	
	Time complexity -- O(n)

	Space complexity -- O(n)

*/
