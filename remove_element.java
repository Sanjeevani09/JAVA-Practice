/*
QUESTION - 

https://leetcode.com/problems/remove-element/

CODE - 
*/

class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] str = input.split(",");
        int[] arr = new int[str.length];
        for(int i = 0; i < str.length; i++){
            arr[i] = Integer.parseInt(str[i].trim());
        }

        int val = sc.nextInt();
        
        Solution sol = new Solution();
        int newLen = sol.removeElement(arr, val);
        System.out.println(newLen);
        for(int i =0; i< newLen; i++){
            System.out.print(arr[i] + ",");
        }
        
    }
}
