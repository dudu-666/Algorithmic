package �㷨;

public class Ѱ�����������������λ�� {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int flag1=0,flag2=0;
        float mid1 = 0, mid2 = 0;
        if(nums1!=null&&nums2!=null) {//����������ǿ�ʱ
            if(nums1[nums1.length-1]<=nums2[0]){return (float)(nums1[nums1.length-1]+nums2[0])/2;}//�������ȫ������һ��ʱ
            else if(nums2[nums2.length-1]<=nums1[0]){return (float)(nums2[nums2.length-1]+nums1[0])/2;}//�������ȫ������һСʱ
            else {//������֮���н����ҽ���������1ʱ

            }
        }//�����������Ϊ��
        else{//������������һ��Ϊ��ʱ
            if (nums1.length != 0&& nums2.length==0) {//�������Ϊ��ʱ
                flag1 = 1;
                if (nums1.length % 2 == 1) {
                    mid1 = nums1[nums1.length / 2];
                } else {
                    mid1 = ((nums1[nums1.length / 2 - 1] + (float) nums1[nums1.length / 2]) / 2);
                }
            }
            if (nums2.length != 0&& nums1.length==0) {//������һΪ��ʱ
                flag2 = 1;
                if (nums2.length % 2 == 1) {
                    mid2 = nums2[nums2.length / 2];
                } else {
                    mid2 = ((float) (nums2[nums2.length / 2 - 1] + nums2[nums2.length / 2]) / 2);
                }
            }
            return (mid1 + mid2) / (flag1+flag2);
        }//������������һ��Ϊ��
    }

    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1,2}, new int[]{3,4}));
    }
}
