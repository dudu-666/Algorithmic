package 算法;

import java.util.Arrays;

public class 寻找两个正序数组的中位数 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int flag1 = 0, flag2 = 0;
        float mid1 = 0, mid2 = 0;
        if (nums1.length != 0 && nums2.length != 0) {//当两个数组非空时组一小时
            //当数组之间有交集且交集数大于1时
            int[] nums3 = new int[nums1.length + nums2.length];
            System.arraycopy(nums1, 0, nums3, 0, nums1.length);
            System.arraycopy(nums2, 0, nums3, nums1.length, nums2.length);
            Arrays.sort(nums3);
            if (nums3.length % 2 == 1) {
                System.out.println((float) nums3[nums3.length / 2]);
                return (float) nums3[nums3.length / 2];
            } else {
                System.out.println((float) (nums3[nums3.length / 2 - 1] + nums3[nums3.length / 2]) / 2);
                return (float) (nums3[nums3.length / 2 - 1] + nums3[nums3.length / 2]) / 2;
            }

        }//两个数组均不为空
        else {//当两个数组有一个为空时
            if (nums1.length != 0) {//当数组二为空时
                flag1 = 1;
                if (nums1.length % 2 == 1) {
                    mid1 = nums1[nums1.length / 2];
                } else {
                    mid1 = ((nums1[nums1.length / 2 - 1] + (float) nums1[nums1.length / 2]) / 2);
                }
            }
            if (nums2.length != 0) {//当数组一为空时
                flag2 = 1;
                if (nums2.length % 2 == 1) {
                    mid2 = nums2[nums2.length / 2];
                } else {
                    mid2 = ((float) (nums2[nums2.length / 2 - 1] + nums2[nums2.length / 2]) / 2);
                }
            }
            return (mid1 + mid2) / (flag1 + flag2);
        }//两个数组中有一个为空
    }

    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{3}, new int[]{-2, -1}));
    }
}
