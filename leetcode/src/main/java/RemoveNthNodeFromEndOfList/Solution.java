package RemoveNthNodeFromEndOfList;

public class Solution {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {}

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int i = 0, currentPosition=0;
        ListNode currentNode = head;
        ListNode deleteNode = head;
        while(true){
            if (i > n){
                deleteNode = deleteNode.next;
            }
            currentNode = currentNode.next;
            currentPosition++;
            i++;

            if (currentNode == null){
                if(currentPosition==1){
                    return null;
                }

                if(n == currentPosition){
                    return head.next;
                }

                deleteNode.next = deleteNode.next.next;
                return head;
            }
        }
    }

}
