package sword.offer;

import org.junit.Test;

public class PrintListTest {

    @Test
    public void printListReversinglyIterativelyTest() {

        PrintList printer = new PrintList();

        // 只有一个节点
        PrintList.ListNode head = new PrintList.ListNode(0);
        printer.printListReversinglyIteratively(head);
        System.out.println();

        // 多个节点
        PrintList.ListNode current = head;
        for (int i = 1; i < 10; i++) {
            PrintList.ListNode node = new PrintList.ListNode(i);
            current.next = node;
            current  = node;
        }
        printer.printListReversinglyIteratively(head);
        System.out.println();

        // 空指针
        printer.printListReversinglyIteratively(null);
    }


    @Test
    public void printListReversinglyRecursively() {
        PrintList printer = new PrintList();

        // 只有一个节点
        PrintList.ListNode head = new PrintList.ListNode(0);
        printer.printListReversinglyRecursively(head);
        System.out.println();

        // 多个节点
        PrintList.ListNode current = head;
        for (int i = 1; i < 10; i++) {
            PrintList.ListNode node = new PrintList.ListNode(i);
            current.next = node;
            current  = node;
        }
        printer.printListReversinglyRecursively(head);
        System.out.println();

        // 空指针
        printer.printListReversinglyRecursively(null);
    }
}
