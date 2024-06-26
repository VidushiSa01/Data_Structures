/*
Problem statement
You are given an array 'arr' of length 'n' containing integers within the range '1' to 'x'.
Your task is to count the frequency of all elements from 1 to n.

Note:
You do not need to print anything. Return a frequency array as an array in the function such that index 0 represents the frequency of 1, index 1 represents the frequency of 2, and so on.
Example:
Sample Input 1:
6 4
1 3 4 3 4 1
Sample Output 1:
2 0 2 2 0 0
Explanation Of Sample Input 1 :
Frequency table:
Number         Count 
 1                2
 2                0
 3                2
 4                2
 5                0
 6                0
*/
public class Solution {
    // Brute Force : TC : O(N) SC: O(N) used the temporary array
    public static int[] countFrequency(int n, int x, int []nums){
        int temp[] = new int[n];
        for(int i=0 ; i<nums.length; i++)
        {
            if(nums[i] <= n)
            temp[nums[i]-1] += 1;
        }
        return temp;
    }
    // Optimized Approach : TC : O(N) SC : O(1)
    public static void countFrequency(int ar[])
    {
        int count = 0;
        HashMap<Integer , Integer> mapp = new HashMap<>();
        for(int i=0 ; i<ar.length ; i++)
        {
            mapp.put(ar[i] , mapp.getOrDefault(ar[i],0)+1);
        }
        for(Integer ele : mapp.keySet())
        {
            System.out.println(ele  + "-> " + mapp.get(ele)); 
        }
        
    }
}
