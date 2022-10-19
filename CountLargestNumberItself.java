public class CountLargestNumberItself {
    public static void main(String[] args) {
        int[] a = {5, 4, 1, 2, 10, 11, 9};

        System.out.println(largestNum(a));
    }
    //static int largestNum(int[] a){
    //  int count=0;
    // int n = a.length;
    // for(int i =0;i<n;i++){
    //   for(int j=0;j<n;j++){
    //       if(a[j]>a[i]){
    //        count=count+1;
    //      break;
    //  }
    //}
    // }
    // return count;
    //}

    //optimized solution is as follows.
    static int largestNum(int[] a){
        int max=0;
        int n = a.length;
        for(int i=0;i<n;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        int count = 0;
        for(int i=0;i<n;i++){
            if(a[i]==max){
                count=count+1;
            }
        }
        int ans = n-count;
        return ans;
    }

}
