class 206. Reverse Linked List_R2 {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        while(cur!=null){
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur=next;
        }
        return prev;
    }
}