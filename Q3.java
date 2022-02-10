//Given a string S as input. Delete the characters at odd indices of the string.


class Solution {
    static String delAlternate(String S) {
         StringBuilder sb = new StringBuilder();
       for(int i = 0 ; i < S.length() ; i++)
       {
           if(i%2==0)
           {
               sb.append(S.charAt(i));
           }
       }
       return sb.toString();
    }
}
