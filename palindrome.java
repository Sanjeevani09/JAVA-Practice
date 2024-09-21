/*
QUESTION - 

https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/palindrome-check-2/

CODE - 
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();                // Reading input from STDIN
        String rev = "";

        for(int i = s.length() - 1; i >= 0; i--){
            rev = rev + s.charAt(i);
        }

        if(s.equals(rev)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
       
    }
}
