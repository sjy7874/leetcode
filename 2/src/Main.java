
public class Main {
    public ListNode ReverseList(ListNode head) {
        if(head==null)
            return null;

        ListNode pPre = null;
        ListNode pNext = null;
        while (head.next != null){

            pNext = head.next;
// 反转指向
            head.next = pPre;
// 指针往下移动
            pPre = head;
            head = pNext;
        }

        return head;
    }


    void printList(ListNode last) {
        while (last != null) {
            System.out.println(last.val + ",\n");
            last = last.next;


        }


    }


    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        Main s = new Main();
        ListNode last = s.ReverseList(head);
        s.printList(last);
    }



      //Definition for singly-linked list.


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode= new ListNode(0);
        ListNode p = new ListNode(0);
        p = listNode;
        int sum = 0;
        while (l1 != null || l2 != null || sum != 0) {
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            p.next = new ListNode(sum % 10);
            sum = sum / 10;
            p = p.next;
        }
        return listNode.next;
    }


}

