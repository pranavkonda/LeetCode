/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode finalSum = null;
        ListNode finalSumNode = finalSum;
        Boolean isTen = false;
        while (l1 != null && l2 != null) {
            int val = 0;
            if (isTen){
            val = l1.val + l2.val + 1;
            } else {
                val = l1.val + l2.val;
            }
            isTen = false;
            if (val >= 10) {
                isTen = true;
                val = val - 10;
            }
            if (finalSumNode != null) {
                finalSumNode.next = new ListNode(val, null);
                finalSumNode = finalSumNode.next;
            } else {
                finalSum = new ListNode(val, null);
                finalSumNode = finalSum;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        if (l1 != null) {
            while (l1 != null) {
            int val = 0;
            if (isTen){
            val = l1.val + 1;
            } else {
                val = l1.val;
            }
            isTen = false;
            if (val >= 10) {
                isTen = true;
                val = val - 10;
            }
            if (finalSumNode != null) {
                finalSumNode.next = new ListNode(val, null);
                finalSumNode = finalSumNode.next;
            } else {
                finalSumNode = new ListNode(val, null);
            }
                l1 = l1.next;
            }
        } else if (l2 != null) {
            while (l2 != null) {
            int val = 0;
            if (isTen){
            val = l2.val + 1;
            } else {
                val = l2.val;
            }
            isTen = false;
            if (val >= 10) {
                isTen = true;
                val = val - 10;
            }
            if (finalSumNode != null) {
                finalSumNode.next = new ListNode(val, null);
                finalSumNode = finalSumNode.next;
            } else {
                finalSumNode = new ListNode(val, null);
            }
                l2 = l2.next;
            }
        }
        
        if (isTen){
            finalSumNode.next = new ListNode(1, null);
            finalSumNode = finalSumNode.next;
        }
        return finalSum;
    }
}