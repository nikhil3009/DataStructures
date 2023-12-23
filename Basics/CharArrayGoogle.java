public class CharArrayGoogle
{
    public static void main(String[] args) {
        char[] a = {'a','b','g','e','g','g','a','g'};
        System.out.println(pair(a));
    }
    //brute force approach
//    static int pair(char[] a){
//        int count = 0;
//        for(int i = 0;i<(a.length);i++){
//            if(a[i]=='a'){
//                for (int j = i+1;j<(a.length);j++){
//                    if(a[j]=='g'){
//                        count++;
//                    }
//                }
//            }
//
//        }
//        return count;
//    }
    static int pair(char[] a) {
        int count = 0;
        int ans = 0;
        for (int i = 0; i < (a.length); i++)
        {
            if(a[i]=='a'){
                count++;
            } else if (a[i]=='g') {
                ans =ans+count;

            }
        }
        return ans;
    }
}
