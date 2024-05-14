package Blind75;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n ==1){
            return 1;
        }
        if(n==0){
            return 0;
        }
        HashSet<Integer> st = new HashSet<>();
        for(int i=0;i<n;i++){
            st.add(nums[i]);
        }
        int longest =1;

        for(int it:st){
            if(!st.contains(it-1)){
                int start = it;
                int count = 1;
                while(st.contains(start+1)){
                    start = start+1;
                    count +=1;
                }
                longest = Math.max(longest,count);
            }
        }
        return longest;

    }
}
