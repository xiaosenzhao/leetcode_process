/**
 * Created by xiaosen on 2017/6/30.
 */
public class P21 {
    private class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;
        ListNode newNode = null;
        ListNode newHead = null;
        if(l1.val <= l2.val) {
            newHead = l1;
            newNode = l1;
            l1 = l1.next;
        }
        else {
            newHead = l2;
            newNode = l2;
            l2 = l2.next;
        }
        while(l1 != null && l2 != null) {
            if(l1.val <= l2.val) {
                newNode.next = l1;
                newNode = l1;
                l1 = l1.next;
            }
            else {
                newNode.next = l2;
                newNode = l2;
                l2 = l2.next;
            }
        }
        if(l1 != null) {
            newNode.next = l1;
        }
        if(l2 != null) {
            newNode.next = l2;
        }
        return newHead;
    }
}
