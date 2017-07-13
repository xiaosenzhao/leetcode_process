/**
 * Created by zhaoxiaosen on 2017/7/13.
 */
public class P19 {
    private class ListNode {
        int val;
        ListNode next;
        ListNode(int x)
        {
            val = x;
        }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null)
            return null;
        ListNode fast = head;
        ListNode deleteNode = head;
        ListNode pre = null;
        for(int i = 1; i < n; i++) {
            if(fast == null)
                return head;
            fast = fast.next;
        }
        while(fast.next != null) {
            fast = fast.next;
            pre = deleteNode;
            deleteNode = deleteNode.next;
        }
        if(deleteNode == head)
            return head.next;
        else if(deleteNode.next == null) {
            pre.next = null;
            return head;
        }
        else {
            deleteNode.val = deleteNode.next.val;
            deleteNode.next = deleteNode.next.next;
            return head;
        }
    }
}
