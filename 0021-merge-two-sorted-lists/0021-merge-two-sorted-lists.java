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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        } else if (list1 == null && list2 != null) {
            return list2;
        } else if (list1 != null && list2 == null) {
            return list1;
        }
        ListNode finalNode = null;
        ListNode returnList = null;
        ListNode otherList = null;
        if (list1.val < list2.val) {
            finalNode = list1;
            returnList = list1;
            otherList = list2;
        } else {
            finalNode = list2;
            returnList = list2;  
            otherList = list1;
        }
        while (finalNode.next != null && otherList != null) {
            if (finalNode.val <= otherList.val && otherList.val <= finalNode.next.val) {
                ListNode temp = finalNode.next;
                finalNode.next = otherList;
                otherList = otherList.next;
                finalNode.next.next = temp;
            }
            finalNode = finalNode.next;
        }
        if (otherList != null) {
            finalNode.next = otherList;
            otherList = null;
        }
        return returnList;
    }
}