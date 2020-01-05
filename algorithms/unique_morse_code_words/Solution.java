/*
Unique Morse Code Words

Problem Statement :

International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, as follows: "a" maps to ".-", "b" maps to "-...", "c" maps to "-.-.", and so on.

For convenience, the full table for the 26 letters of the English alphabet is given below:

[".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]

Now, given a list of words, each word can be written as a concatenation of the Morse code of each letter. For example, "cba" can be written as "-.-..--...", (which is the concatenation "-.-." + "-..." + ".-"). We'll call such a concatenation, the transformation of a word.

Return the number of different transformations among all words we have.

Example:
	Input: words = ["gin", "zen", "gig", "msg"]
	Output: 2
	Explanation: 
	The transformation of each word is:
	"gin" -> "--...-."
	"zen" -> "--...-."
	"gig" -> "--...--."
	"msg" -> "--...--."

There are 2 different transformations, "--...-." and "--...--.".

Note:

    The length of words will be at most 100.
    Each words[i] will have length in range [1, 12].
    words[i] will only consist of lowercase letters.

*/

// Difficulty Level -- Easy

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morseCodes = new String[]               {".-","-...","-.-.","-..",".","..-.","--.",
                         "....","..",".---","-.-",".-..","--","-.",
                         "---",".--.","--.-",".-.","...","-","..-",
                         "...-",".--","-..-","-.--","--.."};
        int count = 0;
        Map<Character, String> alphabetMapping = new HashMap<Character, String>();
        alphabetMapping.put('a', morseCodes[count++]);
        alphabetMapping.put('b', morseCodes[count++]);
        alphabetMapping.put('c', morseCodes[count++]);
        alphabetMapping.put('d', morseCodes[count++]);
        alphabetMapping.put('e', morseCodes[count++]);
        alphabetMapping.put('f', morseCodes[count++]);
        alphabetMapping.put('g', morseCodes[count++]);
        alphabetMapping.put('h', morseCodes[count++]);
        alphabetMapping.put('i', morseCodes[count++]);
        alphabetMapping.put('j', morseCodes[count++]);
        alphabetMapping.put('k', morseCodes[count++]);
        alphabetMapping.put('l', morseCodes[count++]);
        alphabetMapping.put('m', morseCodes[count++]);
        alphabetMapping.put('n', morseCodes[count++]);
        alphabetMapping.put('o', morseCodes[count++]);
        alphabetMapping.put('p', morseCodes[count++]);
        alphabetMapping.put('q', morseCodes[count++]);
        alphabetMapping.put('r', morseCodes[count++]);
        alphabetMapping.put('s', morseCodes[count++]);
        alphabetMapping.put('t', morseCodes[count++]);
        alphabetMapping.put('u', morseCodes[count++]);
        alphabetMapping.put('v', morseCodes[count++]);
        alphabetMapping.put('w', morseCodes[count++]);
        alphabetMapping.put('x', morseCodes[count++]);
        alphabetMapping.put('y', morseCodes[count++]);
        alphabetMapping.put('z', morseCodes[count]);
        
        Set<String> outputSet = new HashSet<String>();
        
        for(String word: words) {
            char wordArr[] = word.toCharArray();
            StringBuilder str = new StringBuilder();
            for(int i=0;i<wordArr.length;i++) {
                str.append(alphabetMapping.get(wordArr[i]));
            }
            outputSet.add(str.toString());
        }
        
        return outputSet.size();
    }
}


/*

	Time complexity -- O(n)

	Space complexity -- O(n)

*/




