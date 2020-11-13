package com.xw.xuwang.suanfa;

/**
 * @author huixia.hu
 * Date:     2020/9/28 18:58
 * @version 1.0
 */
public class Test {
    public static boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) {
            return true;
        }
        ListNode slow = head, fast = head;
        ListNode pre = head, prepre = null;
        while(fast != null && fast.next != null) {
            pre = slow;
            System.out.println(pre==null?null:pre.toString());
            slow = slow.next;
            System.out.println(slow==null?null:slow.toString());
            fast = fast.next.next;
            System.out.println(fast==null?null:fast.toString());
            pre.next = prepre; //null
            System.out.println(pre.next==null?null:pre.next.toString());
            prepre = pre;      //1->null
            System.out.println(prepre==null?null:prepre.toString());
        }
        if(fast != null) {
            slow = slow.next;
        }
        while(pre != null && slow != null) {
            if(pre.val != slow.val) {
                return false;
            }
            pre = pre.next;
            slow = slow.next;
        }
        return true;
    }


    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next= new ListNode(3);
        listNode.next.next.next= new ListNode(2);
        listNode.next.next.next.next= new ListNode(1);
//        listNode.next.next.next.next.next= new ListNode(1);
//        listNode.next.next.next.next.next.next= new ListNode(7);
//        listNode.next.next.next.next.next.next.next= new ListNode(8);
        System.out.println(isPalindrome(listNode));;
    }
}

class ListNode {
    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }

    int val;
    ListNode next;
    ListNode(int x) { val = x; }

}
