package sword.offer;

import java.util.Stack;


/**
 * 剑指offer题目5 ：从尾到头打印链表
 *
 */
public class PrintList {
     static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    /**
     * 使用栈反向打印链表
     * @param head
     */
    public void printListReversinglyIteratively(ListNode head) {
        ListNode node = head;
        Stack<ListNode> stack = new Stack<ListNode>();
        while (node != null) {
            stack.push(node);
            node = node.next;
        }

        while (!stack.isEmpty()) {
            ListNode listNode = stack.pop();
            System.out.println(listNode.val);
        }
    }

    /**
     * 使用递归反向打印链表
     * @param head
     */
    public void printListReversinglyRecursively(ListNode head) {
        if (head != null) {
            if (head.next != null) {
                printListReversinglyRecursively(head.next);
            }
            System.out.println(head.val);
        }
    }
}
