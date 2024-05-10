package Revision.Arrays;

public class LargestSubarrayWithSumZero {
    int maxLen(int arr[], int n)
    {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int sum=0; 
        int maxi = 0;
        
        for(int i=0;i<n;i++){
            sum += arr[i];
            
            if(sum == 0){
                maxi = i+1;
            }
            else{
                if(mp.get(sum)!=null){
                    maxi= Math.max(maxi,i-mp.get(sum));
                }
                else{
                    mp.put(sum,i);
                }
            }
            
        }
        return maxi;
    }
    
}
