package judgeLinkedListHuan;

import java.util.LinkedList;

/**
 * @author zengjinlin
 * @create 2020-03-30 0:40
 */
public class JudgeLinkedListHuan {

    static LinkedList l = new LinkedList();

    public static class ListNode {

        private int val;

        private ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public ListNode getNext() {
            return next;
        }

        public void setNext(ListNode next) {
            this.next = next;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "next=" + next +
                    "val=" + val +
                    '}';
        }
    }

    public static Boolean judge(ListNode node) {

        if (node == null || node.next == null) {
            return false;
        }

        ListNode slow = node;
        ListNode fast = node;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        l.size();
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);

        l1.setNext(l2);
        l2.setNext(l3);
        l3.setNext(l4);

        Boolean judge = judge(l1);
        System.out.println(judge);
    }
}
