/*
          2. Multiply two strings

Difficulty: MediumAccuracy: 20.06%Submissions: 216K+Points: 4
Given two numbers as strings s1 and s2. Calculate their Product.
Note: The numbers can be negative and You are not allowed to use any built-in function or convert the strings to integers. There can be zeros in the begining of the numbers. You don't need to specify '+' sign in the begining of positive numbers.

Examples:

Input: s1 = "0033", s2 = "2"
Output: "66"
Explanation: 33 * 2 = 66

Input: s1 = "11", s2 = "23"
Output: "253"
Explanation: 11 * 23  = 253

Input: s1 = "123", s2 = "0"
Output: "0"
Explanation: Anything multiplied by 0 is equal to 0.
 */

import java.math.BigInteger;

public class Multiply_2_strings {
    public String multiplyStrings(String s1, String s2) {
        // code here.
        String result = "";
        BigInteger number1 = new BigInteger(s1);
        BigInteger number2 = new BigInteger(s2);
        BigInteger mul = number1.multiply(number2);
        result += mul.toString();

        return result;
    }
}
