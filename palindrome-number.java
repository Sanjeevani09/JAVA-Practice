/*
QUESTION - 

https://leetcode.com/problems/palindrome-number/description/

9. Palindrome Number
Easy
Topics
Companies
Hint
Given an integer x, return true if x is a 
palindrome
, and false otherwise.

 

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.



CODE - 
*/
class Solution {
    public boolean isPalindrome(int x) {
        int rem, sum = 0 , temp;
        temp = x;
        while(x > 0){
            rem = x % 10;
            sum = (sum * 10) + rem;
            x = x/10;
        }

        return temp == sum;
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        Solution sol = new Solution();
        boolean pal = sol.isPalindrome(x);
        System.out.println(pal);
        sc.close();
    }
}