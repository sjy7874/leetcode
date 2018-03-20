
public class Main {

    void printList(ListNode last) {
        while (last != null) {
            System.out.print(last.val + ",");
            last = last.next;
        }
    }

    public ListNode getLastNode(ListNode node){
        while (node.next != null) {
            node = node.next;
        }
        return node;
    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);

        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(3);
        head2.next.next = new ListNode(6);
        head2.next.next.next = new ListNode(7);

        Main s = new Main();
        ListNode res = s.mergeTwoLists(head1,head2);
        s.printList(res);

    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode result = res;
        while (l1!=null && l2!=null){
            if(l1.val<l2.val){
                res.next = new ListNode(l1.val);
                res = res.next;
                l1 = l1.next;
            }else {
                res.next = new ListNode(l2.val);
                res = res.next;
                l2 = l2.next;
            }
        }
        if(l1!=null)
            res.next = l1;
        else
            res.next = l2;
        result = result.next;
        return  result;

    }




}

