/**
 * Created by xiaosen on 2017/6/27.
 */
public class P2 {
    private class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x};
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode ret = new ListNode(0);
        ListNode head = ret;
        while(l1 != null || l2 != null || carry != 0) {
            ListNode current = new ListNode(0);
            int val1 = (l1 == null) ? 0 : l1.val;
            int val2 = (l2 == null) ? 0 : l2.val;
            int sum = val1 + val2 + carry;
            if (sum >= 10) {
                sum = sum - 10;
                carry = 1;
            } else
                carry = 0;
            current.val = sum;
            ret.next = current;
            ret = current;
            l1 = (l1 == null)? l1:l1.next;
            l2 = (l2 == null)? l2:l2.next;
        }
        return head.next;
    }
    public static void main(String[] args){

    }
}
