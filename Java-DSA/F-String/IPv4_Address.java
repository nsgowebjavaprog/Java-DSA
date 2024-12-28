//                                                        1.Validate an IP Address

// IPv4 addresses are canonically represented in dot-decimal notation, which consists of four decimal numbers, 
// each ranging from 0 to 255, separated by dots, e.g., "172.16.254.1"

// A valid IPv4 Address is of the form x1.x2.x3.x4 where 0 <= (x1, x2, x3, x4) <= 255. Thus, 
// we can write the generalized form of an IPv4 address as (0-255).(0-255).(0-255).(0-255)

// Input: s = "222.111.111.111"
// Output: true
// Explanation: Here, the IPv4 address is as per the criteria mentioned and also all four decimal numbers lies in the mentioned range.

// Input: s = "5555..555"
// Output: false
// Explanation: "5555..555" is not a valid. IPv4 address, as the middle two portions are missing.

// Input: s = "0.0.0.255"
// Output: false

class Solution {
    public boolean isValid(String s) {
        String[] parts = s.split("\\.");
        if (parts.length != 4)
            return false;

        for (String part : parts) {
            if (part.isEmpty() || part.length() > 1 && part.startsWith("0")
                    || Long.valueOf(part) > 255) {
                return false;
            }
        }

        return true;
    }
}

// TC:

// Given that the number of operations does not scale with the size of the input
// string
// (due to the fixed number of segments in an IPv4 address), the overall
// time complexity of the code can be considered as O(1) or constant time.