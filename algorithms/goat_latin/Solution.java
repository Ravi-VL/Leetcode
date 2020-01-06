/*
Goat Latin

A sentence S is given, composed of words separated by spaces. Each word consists of lowercase and uppercase letters only.

We would like to convert the sentence to "Goat Latin" (a made-up language similar to Pig Latin.)

The rules of Goat Latin are as follows:

    If a word begins with a vowel (a, e, i, o, or u), append "ma" to the end of the word.
    For example, the word 'apple' becomes 'applema'.
     
    If a word begins with a consonant (i.e. not a vowel), remove the first letter and append it to the end, then add "ma".
    For example, the word "goat" becomes "oatgma".
     
    Add one letter 'a' to the end of each word per its word index in the sentence, starting with 1.
    For example, the first word gets "a" added to the end, the second word gets "aa" added to the end and so on.

Return the final sentence representing the conversion from S to Goat Latin. 


Example 1:

	Input: "I speak Goat Latin"
	Output: "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"

Example 2:

	Input: "The quick brown fox jumped over the lazy dog"
	Output: "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"

Notes:

    S contains only uppercase, lowercase and spaces. Exactly one space between each word.
    1 <= S.length <= 150.

*/

//Difficulty Easy

class Solution {
    public String toGoatLatin(String S) {
        String wordArr[] = S.split(" ");
        StringBuilder outputString = new StringBuilder();
        
        StringBuilder trailingA = new StringBuilder();
        for(int i=0;i<wordArr.length;i++) {
            String word = wordArr[i];
            StringBuilder str = new StringBuilder(word);
            trailingA.append("a");
            
            if(word.charAt(0) == 'a' || word.charAt(0) == 'A'
              || word.charAt(0) == 'e' || word.charAt(0) == 'E'
              || word.charAt(0) == 'i' || word.charAt(0) == 'I'
              || word.charAt(0) == 'o' || word.charAt(0) == 'O'
              || word.charAt(0) == 'u' || word.charAt(0) == 'U') {
                str.append("ma");
                str.append(trailingA);
            }else {
                str.append(str.charAt(0));
                str.deleteCharAt(0);
                str.append("ma");
                str.append(trailingA);
            }
            
            outputString.append(str);
            if(i != wordArr.length-1) {
                outputString.append(" ");
            }
            
        }
        
        return outputString.toString();
    }
}


/*

	Time complexity -- O(n)

	Space complexity -- O(n)

*/
