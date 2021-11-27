package 算法;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

class Solution {
    Map<Integer, Integer> map = new HashMap<>();
    int m, n, total;
    Random rand = new Random();

    public Solution(int m, int n) {
        this.m = m;
        this.n = n;
        this.total = m * n;
    }

    public int[] flip() {//将二维数组转化成线性的   在线性中其中随机抽取一个元素作为flip操作对象  并计算出他实际在二维矩阵中的位置 idx/n  idx%n  然后将这个被操作对象的映射指向未被选中的total 并挤掉被操作对象  因而有total--
        int x = rand.nextInt(total);
        total--;
        int idx = map.getOrDefault(x, x);
        map.put(x, map.getOrDefault(total, total));
        return new int[]{idx / n, idx % n};
    }

    public void reset() {
        total = m * n;
        map.clear();
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(m, n);
 * int[] param_1 = obj.flip();
 * obj.reset();
 */