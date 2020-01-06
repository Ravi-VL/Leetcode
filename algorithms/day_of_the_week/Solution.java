/*
Day of the Week

Problem Statement:

Given a date, return the corresponding day of the week for that date.

The input is given as three integers representing the day, month and year respectively.

Return the answer as one of the following values {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}.

Example 1:

	Input: day = 31, month = 8, year = 2019
	Output: "Saturday"

Example 2:

	Input: day = 18, month = 7, year = 1999
	Output: "Sunday"

Example 3:

	Input: day = 15, month = 8, year = 1993
	Output: "Sunday"

Constraints:

    The given dates are valid dates between the years 1971 and 2100.

*/


// Difficulty Level -- Easy

class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        int daysCount = 0;
        
        for(int i=1971;i<year;i++) {
            if(i%4 == 0) {
                daysCount += 366;
            }else {
                daysCount += 365;
            }
        }
        
        for(int i=1;i<month;i++) {
            if(i == 2) {
                if(year%4 != 0) {
                    daysCount += 28;
                }else {
                    daysCount += 29;
                }
            }else if( (i == 4) || (i == 6) || (i == 9) || (i == 11) ) {
                daysCount += 30;
            }else {
                daysCount += 31;
            }
        }
        
        daysCount += day;
        int dayOfWeek = daysCount%7;
        
        Map<Integer, String> dayToNameMap = new HashMap<Integer, String>();
        
        dayToNameMap.put(0, "Thursday");
        dayToNameMap.put(1, "Friday");
        dayToNameMap.put(2, "Saturday");
        dayToNameMap.put(3, "Sunday");
        dayToNameMap.put(4, "Monday");
        dayToNameMap.put(5, "Tuesday");
        dayToNameMap.put(6, "Wednesday");
        
        return dayToNameMap.get(dayOfWeek);
    }
}


/*

	Time complexity -- O(1)

	Space complexity -- O(n)

*/

