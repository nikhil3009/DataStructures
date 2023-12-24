package Arrays.Medium;

public class BestTimeToSellAStock {
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};

        int maxPro = maxProfit(arr);
        System.out.println("Max profit is: " + maxPro);

    }
    public static int maxProfit(int[] arr){
        int maxPro = 0;
        int mini = Integer.MAX_VALUE;
        for(int i = 0; i<arr.length;i++){
            mini = Math.min(mini,arr[i]);
            maxPro = Math.max(maxPro,arr[i]-mini);
        }
        return maxPro;
    }
}
