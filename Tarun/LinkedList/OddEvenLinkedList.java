public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode shortptr = headA;
        ListNode longptr = headB;
        if (shortptr == null || longptr == null)
        return null;

        while(shortptr != longptr)
        {
            if(shortptr == null){
            shortptr = headB;
            }else{
                shortptr=shortptr.next;
            }
            if(longptr == null){
            longptr = headA;
            }else{
                longptr=longptr.next;
            }
        }
        return shortptr;
    }
}

Time - O(m+n)
space - O(1)
