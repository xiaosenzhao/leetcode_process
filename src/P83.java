/**
 * Created by xiaosen on 2017/7/3.
 */
public class P83 {
    private class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)
            return null;
        ListNode pre = head;
        ListNode next = head.next;
        while(next != null) {
            if(next.val == pre.val)
                next = next.next;
            else {
                pre.next = next;
                pre = next;
                next = next.next;
            }
        }
        pre.next = null;
        return head;
    }
}
