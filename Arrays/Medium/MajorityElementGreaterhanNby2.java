package Arrays.Medium;

public class MajorityElementGreaterhanNby2 {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int n = arr.length;
        int ans = majorityElement(arr,n);
        System.out.println("The majority element is: " + ans);
    }
    static int majorityElement(int[] arr,int n){
        int count = 0;
        int element = 0;
        for(int i = 0; i<n;i++){
            if(count == 0){
                count = 1;
                element = arr[i];
            }
            else if(element == arr[i]){
                count++;
            }
            else {
                count --;
            }
        }
        int count1 = 0;
        for(int i =0;i<n;i++){

            if(arr[i] == element){
                count1++;
            }
        }
        if(count1>n/2){
            return element;
        }
       return -1;
    }

}
