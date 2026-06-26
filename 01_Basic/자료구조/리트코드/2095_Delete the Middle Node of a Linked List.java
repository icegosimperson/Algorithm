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
class 2095_Delete the Middle Node of a Linked Liste {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null || head==null){
            return null;
        }
        ListNode cur = head;
        int cnt=0;
        while(cur!=null){
            cnt++;
            cur = cur.next;
        }
        cur=head;
        for(int i=0; i<(cnt/2)-1; i++){
            cur = cur.next;
        }
        cur.next = cur.next.next;
        return head;
    }
}