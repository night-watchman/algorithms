package sword.offer;

import org.junit.Assert;
import org.junit.Test;

public class ConstructBinaryTreeTest {

    @Test
    public void constructBinaryTreeTest() {



        /**
         *              1
         *            /   \
         *           2     3
         *          /     / \
         *         4     5   6
         *          \   /
         *          7  8
         */
        int[] perOrder = new int[]{1, 2, 4, 7, 3, 5, 8, 6};
        int[] inOrder = new int[]{4, 7, 2, 1, 8, 5, 3, 6};
        ConstructBinaryTree.BinaryTreeNode node1 = new ConstructBinaryTree.BinaryTreeNode(1);
        ConstructBinaryTree.BinaryTreeNode node2 = new ConstructBinaryTree.BinaryTreeNode(2);
        ConstructBinaryTree.BinaryTreeNode node3 = new ConstructBinaryTree.BinaryTreeNode(3);
        ConstructBinaryTree.BinaryTreeNode node4 = new ConstructBinaryTree.BinaryTreeNode(4);
        ConstructBinaryTree.BinaryTreeNode node5 = new ConstructBinaryTree.BinaryTreeNode(5);
        ConstructBinaryTree.BinaryTreeNode node6 = new ConstructBinaryTree.BinaryTreeNode(6);
        ConstructBinaryTree.BinaryTreeNode node7 = new ConstructBinaryTree.BinaryTreeNode(7);
        ConstructBinaryTree.BinaryTreeNode node8 = new ConstructBinaryTree.BinaryTreeNode(8);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node4.right = node7;
        node3.left = node5;
        node5.left = node8;
        node3.right = node6;

        ConstructBinaryTree constructBinaryTree = new ConstructBinaryTree();
        ConstructBinaryTree.BinaryTreeNode node = constructBinaryTree.constructBinaryTree(perOrder, inOrder);
        Assert.assertEquals(node1.compare(node1, node), 0);
        ConstructBinaryTree.BinaryTreeNode.perVisitIterate(node);

        /**
         *                 1
         *                /
         *               2
         *              /
         *             3
         *            /
         *           4
         *          /
         *         5
         *        /
         *       6
         */
        perOrder = new int[]{1, 2, 3, 4, 5, 6};
        inOrder = new int[]{6, 5, 4, 3, 2, 1};
        node1 = new ConstructBinaryTree.BinaryTreeNode(1);
        node2 = new ConstructBinaryTree.BinaryTreeNode(2);
        node3 = new ConstructBinaryTree.BinaryTreeNode(3);
        node4 = new ConstructBinaryTree.BinaryTreeNode(4);
        node5 = new ConstructBinaryTree.BinaryTreeNode(5);
        node6 = new ConstructBinaryTree.BinaryTreeNode(6);
        node1.left = node2;
        node2.left = node3;
        node3.left = node4;
        node4.left = node5;
        node5.left = node6;

        node = constructBinaryTree.constructBinaryTree(perOrder, inOrder);
        Assert.assertEquals(node1.compare(node1, node), 0);


        /**
         *    1
         *     \
         *      2
         *       \
         *        3
         *         \
         *          4
         *           \
         *            5
         *             \
         *              6
         */

        perOrder = new int[]{1, 2, 3, 4, 5, 6};
        inOrder = new int[]{1, 2, 3, 4, 5, 6};
        node1 = new ConstructBinaryTree.BinaryTreeNode(1);
        node2 = new ConstructBinaryTree.BinaryTreeNode(2);
        node3 = new ConstructBinaryTree.BinaryTreeNode(3);
        node4 = new ConstructBinaryTree.BinaryTreeNode(4);
        node5 = new ConstructBinaryTree.BinaryTreeNode(5);
        node6 = new ConstructBinaryTree.BinaryTreeNode(6);
        node1.right = node2;
        node2.right = node3;
        node3.right = node4;
        node4.right = node5;
        node5.right = node6;

        node = constructBinaryTree.constructBinaryTree(perOrder, inOrder);
        Assert.assertEquals(node1.compare(node1, node), 0);

    }
}
