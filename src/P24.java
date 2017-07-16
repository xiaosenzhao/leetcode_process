/**
 * Created by zhaoxiaosen on 2017/7/16.
 */
public class P24 {
    private class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
    public ListNode swapPairs(ListNode head) {
        if(head == null)
            return null;
        if(head.next == null)
            return head;
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && slow != null) {
            int tmp = fast.val;
            fast.val = slow.val;
            slow.val = tmp;
            fast = fast.next;
            if(fast != null)
                fast = fast.next;
            else
                break;
            slow = slow.next.next;
        }
        return head;
    }
}
