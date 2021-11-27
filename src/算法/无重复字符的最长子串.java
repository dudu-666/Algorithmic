package 算法;

import javax.imageio.stream.ImageInputStream;

public class 无重复字符的最长子串 {
    public static int lengthOfLongestSubstring(String s) {
        int[] last = new int[128];
        for(int i = 0; i < 128; i++) {
            last[i] = -1;
        }
        int n = s.length();

        int res = 0;
        int start = 0; // 窗口开始位置
        for(int i = 0; i < n; i++) {
            int index = s.charAt(i);
            start = Math.max(start, last[index] + 1);
            res   = Math.max(res, i - start + 1);
            last[index] = i;
        }

        return res;
    }

    public static void main(String[] args) {
        String s="pwwkew";
        int a=s.charAt(0);
        System.out.println(a);
        System.out.println(lengthOfLongestSubstring(s));
    }
}
