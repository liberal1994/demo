package algorithm.leetcode;

public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummyNode = new ListNode(0);
        ListNode p = l1, q = l2;
        ListNode curr = dummyNode;
        int carry = 0;
        while (p != null || q != null) {
            int v1 = p!=null?p.val:0;
            int v2 = q!=null?q.val:0;
            int sum = v1 + v2 + carry;
            carry = sum / 10;
            ListNode newNode = new ListNode(sum % 10);
            curr.next = newNode;
            curr = newNode;
            if (p != null) {
                p = p.next;
            }
            if (q != null) {
                q = q.next;
            }
        }
        if (carry != 0) {
            curr.next=new ListNode(carry);
        }
        return dummyNode.next;

    }

}