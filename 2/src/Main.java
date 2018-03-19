
public class Main {
    public ListNode ReverseList(ListNode head) {
        if(head==null)
            return null;

        ListNode pPre = null;
        ListNode pNext = null;
        while (head.next != null){
           pNext = head.next;
           head.next = pPre;
           pPre = head;
           head = pNext;
        }
        head.next = pPre;
        return head;
    }


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
        head1.next = new ListNode(4);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(3);

        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(4);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(2);

        Main s = new Main();
        ListNode last = s.addTwoNumbers(head1,head2);
        s.printList(last);
    }



      //Definition for singly-linked list.


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode result = res;
        int carry=0;
        while (l1!=null || l2!=null){
            int i=0,j=0;
            if(l1!=null){
                i=l1.val;
                l1 = l1.next;
            }
            if(l2!=null){
                j=l2.val;
                l2 = l2.next;
            }
            int sum = i+j+carry;
            carry = sum / 10;
            res.val = sum % 10;
            if(l1!=null || l2!=null) {
                res.next = new ListNode(0);
                res = res.next;
            }
        }
        if (carry!=0){
            res.next = new ListNode(carry);
        }
        return  result;
    }



}

