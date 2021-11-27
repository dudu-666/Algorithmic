package 算法;

public class 寻找两个正序数组的中位数 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int flag1=0,flag2=0;
        float mid1 = 0, mid2 = 0;
        if(nums1!=null&&nums2!=null) {//当两个数组非空时
            if(nums1[nums1.length-1]<=nums2[0]){return (float)(nums1[nums1.length-1]+nums2[0])/2;}//当数组二全比数组一大时
            else if(nums2[nums2.length-1]<=nums1[0]){return (float)(nums2[nums2.length-1]+nums1[0])/2;}//当数组二全比数组一小时
            else {//当数组之间有交集且交集数大于1时

            }
        }//两个数组均不为空
        else{//当两个数组有一个为空时
            if (nums1.length != 0&& nums2.length==0) {//当数组二为空时
                flag1 = 1;
                if (nums1.length % 2 == 1) {
                    mid1 = nums1[nums1.length / 2];
                } else {
                    mid1 = ((nums1[nums1.length / 2 - 1] + (float) nums1[nums1.length / 2]) / 2);
                }
            }
            if (nums2.length != 0&& nums1.length==0) {//当数组一为空时
                flag2 = 1;
                if (nums2.length % 2 == 1) {
                    mid2 = nums2[nums2.length / 2];
                } else {
                    mid2 = ((float) (nums2[nums2.length / 2 - 1] + nums2[nums2.length / 2]) / 2);
                }
            }
            return (mid1 + mid2) / (flag1+flag2);
        }//两个数组中有一个为空
    }

    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1,2}, new int[]{3,4}));
    }
}
