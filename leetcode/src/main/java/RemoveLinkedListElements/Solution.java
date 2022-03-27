package RemoveLinkedListElements;

public class Solution {

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return head;
        ListNode curr = head;
        ListNode node = head.next;

        while(node!=null){
            while(node!=null && node.val == val){
                node = node.next;
            }
            curr.next = node;
            curr = node;
            if(node!=null)node = node.next;


        }

        if(head.val == val)return head.next;

        return head;
    }

}
