/*
Problem Statement

Given a valid (IPv4) IP address, return a defanged version of that IP address.

A defanged IP address replaces every period "." with "[.]".

Example 1:

Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"

Example 2:

Input: address = "255.100.50.0"
Output: "255[.]100[.]50[.]0"


Constraints:

    The given address is a valid IPv4 address.

*/

// Difficulty Level -- Easy

class Solution {
    public String defangIPaddr(String address) {
        if(address.length() == 0) {
            return "";
        }
        
        char ipAddressArray[] = address.toCharArray();
        char ipAddressOutputArray[] = new char[ipAddressArray.length+6];
        StringBuilder outputString =  new StringBuilder();
        int j=0;
        int i=0;
        while(j<ipAddressOutputArray.length) {
            if(ipAddressArray[i] == '.') {
                ipAddressOutputArray[j++] = '[';
                ipAddressOutputArray[j++] = '.';
                ipAddressOutputArray[j++] = ']';
            }else {
                ipAddressOutputArray[j++] = ipAddressArray[i];
            }
            i++;
        }
        
        for(i=0;i<ipAddressOutputArray.length;i++) {
            outputString.append(ipAddressOutputArray[i]);
        }
        
        return outputString.toString();   
    }
}


/*

Time complexity -- O(n) 

Space complexity -- O(n)

where n is length of the ip-address string.

*/





