package Arrays.Easy;

import java.util.ArrayList;

public class Union {
    public static void main(String args[]) {
        int n = 10, m = 7;
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arr2[] = {2, 3, 4, 4, 5, 11, 12};
        ArrayList<Integer> Union = FindUnion(arr1, arr2, n, m);
        System.out.println("Union of arr1 and arr2 is ");
        for (int val: Union)
            System.out.print(val+" ");
    }
    static ArrayList<Integer> FindUnion(int arr1[], int arr2[], int n, int m){
        ArrayList<Integer> union = new ArrayList<>();
        int i = 0 ;
        int j = 0;
        while(i<n && j <m){
            if(arr1[i]<=arr2[j]){
                if(union.size() == 0 || union.get(union.size()-1)!=arr1[i]){
                    union.add(arr1[i]);

                }
                i++;
            }
            else{
                if(union.size() == 0 || union.get(union.size()-1)!=arr2[j]){
                    union.add(arr2[j]);

                }
                j++;
            }
        }
        while(i<n){

                if(union.size() == 0 || union.get(union.size()-1)!=arr1[i]){
                    union.add(arr1[i]);


            }
            i++;
        }
        while(j<m){
            if(union.size() == 0 || union.get(union.size()-1)!=arr2[j]){
                union.add(arr2[j]);

            }
            j++;
        }
        return union;
    }
}
