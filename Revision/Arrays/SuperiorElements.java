package Revision.Arrays;

public class SuperiorElements {
    public static List< Integer > superiorElements(int []a) {
        List<Integer> ans = new ArrayList<>();
        int n = a.length;
        ans.add(a[n-1]);
        int max = a[n-1];
        for(int i =n-2;i>=0;i--){
            if(a[i]>max){
                ans.add(a[i]);
                max = a[i];
            }
        }
        return ans;
    }
}
