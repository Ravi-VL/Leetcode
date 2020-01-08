/*
Minimum Index Sum of Two Lists

Problem Statement:

Suppose Andy and Doris want to choose a restaurant for dinner, and they both have a list of favorite restaurants represented by strings.

You need to help them find out their common interest with the least list index sum. If there is a choice tie between answers, output all of them with no order requirement. You could assume there always exists an answer.

Example 1:

	Input:
	["Shogun", "Tapioca Express", "Burger King", "KFC"]
	["Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"]
	Output: ["Shogun"]
	Explanation: The only restaurant they both like is "Shogun".

Example 2:

	Input:
	["Shogun", "Tapioca Express", "Burger King", "KFC"]
	["KFC", "Shogun", "Burger King"]
	Output: ["Shogun"]
	Explanation: The restaurant they both like and have the least index sum is "Shogun" with index sum 1 (0+1).

Note:

    The length of both lists will be in the range of [1, 1000].
    The length of strings in both lists will be in the range of [1, 30].
    The index is starting from 0 to the list length minus 1.
    No duplicates in both lists.

*/

//Difficulty Level -- Easy

class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        
        int indexSum[] = new int[1000];
        Arrays.fill(indexSum, Integer.MAX_VALUE);
        String commonStrings[] = new String[1000];
        List<String> outputStrings = new ArrayList<String>();
        
        int pos = 0;
        for(int i=0;i<list1.length;i++) {
            if(containsString(list2, list1[i]) != -1) {
                indexSum[pos] = i + containsString(list2, list1[i]);
                commonStrings[pos++] = list1[i];
            } 
        }
        
        int min = findMin(indexSum);
        pos = 0;
        for(int i=0;i<indexSum.length;i++) {
            
            if(indexSum[i] == min) {
                outputStrings.add(commonStrings[i]);
            }
            
        }
        
        String[] arr = new String[outputStrings.size()]; 
        arr = outputStrings.toArray(arr); 
        
        return arr;
    }
    
    public static int containsString(String arr[], String str) {
        
        for(int i=0;i<arr.length;i++) {   
            if(arr[i].equals(str)) {
                return i;
            }
        }
        
        return -1;
    }
    
    
    public static int findMin(int arr[]) {
        
        int min = Integer.MAX_VALUE;
        
        for(int i=0;i<arr.length;i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        
        return min;
    }
    
}


/*

	Time complexity -- O(n^2)

	Space complexity -- O(n)

*/
