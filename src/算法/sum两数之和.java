package 算法;

import java.util.HashMap;
import java.util.Map;

public class sum两数之和 {
    public int[] twoSum(int[] nums, int target) {//暴力算法
        int p[]=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int k=i+1;k<nums.length;k++){
                if(nums[i]+nums[k]==target){
                    p[0]=i;p[1]=k;
                }
            }
        }
        return p;
    }
    public int[] twoSum1(int[] nums, int target) {//单次for循环加Hashmap查找(k,v)
        int[] res = new int[2];
        if(nums == null || nums.length == 0){
            return res;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int temp = target - nums[i];
            if(map.containsKey(temp)){
                res[1] = i;
                res[0] = map.get(temp);
            }
            map.put(nums[i], i);
        }
        return res;
    }
}
