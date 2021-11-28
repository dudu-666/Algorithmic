package 算法;

import com.sun.jdi.Value;

import java.util.Arrays;

public class 整数反转 {
    public static int reverse(int x) {
        int flag ;
        String str;
        StringBuilder stringBuilder=new StringBuilder();
        char[] st;
        Object X;
        if (x < 0) {
            flag=-1;
            x=-x;
            X=x;
            st= Do(X);
            for(char ch:st){
                stringBuilder.append(ch);
            }
            try {
                return flag*Integer.parseInt(stringBuilder.toString());
            }catch (Exception e){}
        }
        else {
            flag=1;
            X=x;
            st= Do(X);
            for(char ch:st){
                stringBuilder.append(ch);
            }
            try {
                return flag*Integer.parseInt(stringBuilder.toString());
            }catch (Exception e){}
        }
        return 0;
    }
    public static char[] Do(Object X){
        char[] st=X.toString().toCharArray();
        char ch;
        StringBuilder str=new StringBuilder();
        if(st.length==1)
            return st;
        if(st.length==2) {
            ch = st[0];
            st[0]=st[1];
            st[1]=ch;
            return st;
        }
        if(st.length%2==0){
            for(int i=0;i<st.length/2;i++){
                ch=st[i];
                st[i]=st[st.length-i-1];
                st[st.length-i-1]=ch;
            }
            return st;
        }else {
            for(int i=0;i<st.length/2;i++){
                ch=st[i];
                st[i]=st[st.length-i-1];
                st[st.length-i-1]=ch;
            }
            return st;
        }
    }

    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }
}
