package �㷨;

import java.util.Arrays;

public class Ѱ�����������������λ�� {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int flag1 = 0, flag2 = 0;
        float mid1 = 0, mid2 = 0;
        if (nums1.length != 0 && nums2.length != 0) {//����������ǿ�ʱ��һСʱ
            //������֮���н����ҽ���������1ʱ
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

        }//�����������Ϊ��
        else {//������������һ��Ϊ��ʱ
            if (nums1.length != 0) {//�������Ϊ��ʱ
                flag1 = 1;
                if (nums1.length % 2 == 1) {
                    mid1 = nums1[nums1.length / 2];
                } else {
                    mid1 = ((nums1[nums1.length / 2 - 1] + (float) nums1[nums1.length / 2]) / 2);
                }
            }
            if (nums2.length != 0) {//������һΪ��ʱ
                flag2 = 1;
                if (nums2.length % 2 == 1) {
                    mid2 = nums2[nums2.length / 2];
                } else {
                    mid2 = ((float) (nums2[nums2.length / 2 - 1] + nums2[nums2.length / 2]) / 2);
                }
            }
            return (mid1 + mid2) / (flag1 + flag2);
        }//������������һ��Ϊ��
    }

    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{3}, new int[]{-2, -1}));
    }
}
