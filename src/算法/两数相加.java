package 算法;
 class ListNode {
     int val;
     ListNode next;

     ListNode() {
     }

     ListNode(int val) {
         this.val = val;
     }

     ListNode(int val, ListNode next) {
         this.val = val;
         this.next = next;
     }
 }
class 两数相加 {

     public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null, tail = null;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int n1 = l1 != null ? l1.val : 0;
            int n2 = l2 != null ? l2.val : 0;
            int sum = n1 + n2 + carry;
            if (head == null) {
                head = tail = new ListNode(sum % 10);
            } else {
                tail.next = new ListNode(sum % 10);
                tail = tail.next;
            }
            carry = sum / 10;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (carry > 0) {
            tail.next = new ListNode(carry);
        }
        return head;
    }
    public static void show(ListNode result){
         if (result!=null){show(result.next);
             System.out.println(result.val);

         }
    }
    public static void main(String[] args) {
        ListNode listNodeA3 = new ListNode(3);
        ListNode listNodeA2 = new ListNode(4,listNodeA3);
        ListNode listNodeA1 = new ListNode(2,listNodeA2);
        ListNode listNodeB3 = new ListNode(4);
        ListNode listNodeB2 = new ListNode(6,listNodeB3);
        ListNode listNodeB1 = new ListNode(5,listNodeB2);
        ListNode result=addTwoNumbers(listNodeA1,listNodeB1);
        show(result);
    }
}
