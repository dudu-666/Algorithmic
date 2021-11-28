package 算法;

public class 最长回文子串 {
    public String longestPalindrome(String s) {
        StringBuilder result=new StringBuilder();
        char ch1,ch2;
        result.append(s.charAt(0));
        for(int i=0;i<s.length();i++){
            ch1=s.charAt(i);
            for (int k=i+1;k<s.length();k++){
                ch2=s.charAt(k);
                result.append(ch2);
                if(ch1==ch2){
                    return result.toString();
                }
            }
        }return result.toString();
    }
}
