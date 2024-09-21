/*
QUESTION - 
https://leetcode.com/problems/reverse-integer/

CODE - 
*/
 
class Solution {
    public int reverse(int x) {
        int rev = 0;
        while(x != 0){
            int digit = x % 10;
            if(rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE /10 && digit > 7)){
                return 0;
            }

            if(rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && digit < -8)){
                return 0;
            }
            rev = rev * 10 + digit;
            x = x/10;
            }
            return rev;
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        Solution sol = new Solution();
        System.out.println(sol.reverse(x));
        sc.close();
    }
}