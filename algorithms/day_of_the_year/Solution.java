/*
Day of the Year

Problem Statement:

Given a string date representing a Gregorian calendar date formatted as YYYY-MM-DD, return the day number of the year.

 

Example 1:

	Input: date = "2019-01-09"
	Output: 9
	Explanation: Given date is the 9th day of the year in 2019.

Example 2:

	Input: date = "2019-02-10"
	Output: 41

Example 3:

	Input: date = "2003-03-01"
	Output: 60

Example 4:

	Input: date = "2004-03-01"
	Output: 61

Constraints:

    date.length == 10
    date[4] == date[7] == '-', and all other date[i]'s are digits
    date represents a calendar date between Jan 1st, 1900 and Dec 31, 2019.

*/

// Difficulty Level -- Easy

class Solution {
    public int dayOfYear(String date) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        String month = date.split("-")[1];
        String year = date.split("-")[0];
        String day = date.split("-")[2];
        int days = 0;
        
        map.put("0", 0);
        map.put("1", 31);
        map.put("3", 31);
        map.put("4", 30);
        map.put("5", 31);
        map.put("6", 30);
        map.put("7", 31);
        map.put("8", 31);
        map.put("9", 30);
        map.put("10", 31);
        map.put("11", 30);
        map.put("12", 31);
        
        if(Integer.valueOf(month) > 2) {
            if(isLeapYear(Integer.valueOf(year))) {
                map.put("2", 29);
            }else {
                map.put("2", 28);
            }
        }
        
        int months = Integer.valueOf(month)-1;
        
        while(months > 0) {
            days += map.get(String.valueOf(Integer.valueOf(months)));
            months--;
        }
        
        days += Integer.valueOf(day);
        
        return days;
    }
    
    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return true;
        }
	}
    
}

/*

	Time complexity -- O(n)

	Space complexity -- O(n)

*/
