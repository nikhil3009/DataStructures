public class FindingPairs {
    public static void main(String[] args) {
        int[] a = {5, 4, 1, 6, 10, 8, 9};
        System.out.println(findPairs(a));
    }
    public static int findPairs(int[] a){
        int count=0;
        int k=10;
        int n =a.length;
        /*for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j){
                    if(a[i]+a[j]==k){
                    count=count+1;
                    }
                }
            }
        }*/
        //optimized solution
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]+a[j]==k){
                    count++;

                }
            }
        }

        return count*2;
    }
}
