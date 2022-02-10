class Solution {
   static String revStr(String S) {
       String ans="";
       int n=S.length();
       for(int i=0;i<n;i++){
           ans = S.charAt(i)+ans;
       }
       return ans;
   }
}
