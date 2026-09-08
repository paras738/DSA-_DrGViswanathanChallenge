class Solution {

    public boolean isPalindrome(ListNode head) {


        if(head==null || head.next==null)
        {
            return  true;
        }

        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode curr = prev.next;
        ListNode previ = null;

        while (curr != null) {
            ListNode newnode = curr.next;
            curr.next = previ;
            previ = curr;
            curr = newnode;
        }

        while (head != null && previ != null) {

            if (head.val != previ.val) {
                return false;
            }

            head = head.next;
            previ = previ.next;
        }

        return true;
    }
}