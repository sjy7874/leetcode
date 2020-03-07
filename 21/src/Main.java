
public class Main {

    void printList(ListNode last) {
        while (last != null) {
            System.out.print(last.val + ",");

            last = last.next;
        }
        System.out.println("|");
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
        head1.next.next = new ListNode(5);
        head1.next.next.next = new ListNode(7);

        Main s = new Main();
        ListNode res = s.removeNthFromEnd(head1,2);
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

    /*

19. 删除链表的倒数第N个节点

给定一个链表，删除链表的倒数第 n 个节点并返回头结点。

例如，

给定一个链表: 1->2->3->4->5, 并且 n = 2.

当删除了倒数第二个节点后链表变成了 1->2->3->5.


说明:

给的 n 始终是有效的。

尝试一次遍历实现。

*/
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode first = new ListNode(0);
        first.next = head;
        ListNode p1 = first;
        ListNode p2 = first;
        int k = 0 ;
        while(k<n)
        {
            if(p2.next == null)
                return head;
            p2 = p2.next;
            k++;
        }

        while(true)
        {
            if(p2.next == null)
            {
                p1.next = p1.next.next;
                break;
            }
            printList(p2);
            printList(p1);
            printList(first);
            p1 = p1.next;
            p2 = p2.next;

        }
        return first.next;
    }



}

