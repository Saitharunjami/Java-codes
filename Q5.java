// Given a string S. The task is to convert characters of string to lowercase.

class Solution {
   static String toLower(String S) {
       // code here
       StringBuilder sb=new StringBuilder();
       char ch;
       int n;
       for(int i=0;i<S.length();i++)
       { 
           ch=S.charAt(i);
           if(ch>='A' && ch<='Z')
           {
             n=ch+32;
            sb.append(""+(char)n);
           }
           if(ch>='a' && ch<='z')
           {
               sb.append(""+ch);
           }
       }
       return sb.toString();
   }
}
