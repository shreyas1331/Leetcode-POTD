package Day36;

public class removeNodes {

	public ListNode reverseList(ListNode head) {
        ListNode pre=null;
        ListNode cur=head;
        ListNode after=null;
        while(cur!=null){
            after=cur.next;
            cur.next=pre;
            pre=cur;
            cur=after;
        }
        return pre;
    }
    public ListNode removeNodes(ListNode head) {
        head=reverseList(head);
        int maxNode=-1;
        ListNode prev=null;
        ListNode cur=head;
        while(cur!=null){
            maxNode=Math.max(maxNode,cur.val);
            if(cur.val<maxNode){
                prev.next=cur.next;
                ListNode temp=cur;
                cur=cur.next;
            }else{
                prev=cur;
                cur=cur.next;
            }
        }
        return reverseList(head);
    }

}
