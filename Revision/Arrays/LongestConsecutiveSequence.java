package Revision.Arrays;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        int count = 0;
        int longest =1;
        if(n==0){
            return 0;
        }
        Set<Integer> st = new HashSet<>();
        for(int i=0;i<n;i++){
            st.add(nums[i]);
        }

        for(int it : st){
            if(!st.contains(it-1)){
                count =1;
                while(st.contains(it+1)){
                    it = it+1;
                    count = count+1;
                }
                longest = Math.max(longest,count);
            }
        }

        return longest;
    }
}
