/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
 /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // If either list is empty, there can be no intersection
        if (headA == null || headB == null) {
            return null;
        }

        ListNode ptrA = headA;
        ListNode ptrB = headB;

        // Loop until the two pointers meet
        while (ptrA != ptrB) {
            // If ptrA reaches the end of list A, redirect it to the head of list B.
            // Otherwise, move to the next node.
            ptrA = (ptrA == null) ? headB : ptrA.next;
            
            // If ptrB reaches the end of list B, redirect it to the head of list A.
            // Otherwise, move to the next node.
            ptrB = (ptrB == null) ? headA : ptrB.next;
        }

        // When they meet, it will either be at the intersection node, 
        // or they will both be null (if there is no intersection).
        return ptrA;
    }
}