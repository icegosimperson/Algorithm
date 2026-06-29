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
class 2130. Maximum Twin Sum of a Linked List {
    public int pairSum(ListNode head) {
        // 쌍둥이 노드 합 중 최댓값 반환
        // 1첫번째 ~ end 마지막 노드
        // n ~ n+1
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode prev = null;
        ListNode cur = slow;
        while(cur!=null){
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        int max=0;
        ListNode first = head;
        ListNode second = prev;
        while(second != null){
            max = Math.max(max, first.val+second.val);
            first=first.next;
            second=second.next;
        }
        return max;
    }
}