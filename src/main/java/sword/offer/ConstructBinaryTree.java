package sword.offer;


import java.security.InvalidParameterException;
import java.util.*;

/**
 *  剑指offer题目6 ：重建二叉树
 *
 *  输入某二叉树的前序遍历和中序遍历
 *  重建出该二叉树
 */
public class ConstructBinaryTree {


    public BinaryTreeNode constructBinaryTree(int[] perOrder, int[] inOrder) {
        if (perOrder == null || inOrder == null || perOrder.length != inOrder.length || perOrder.length <= 0) {
            return null;
        }

        return constructCore(perOrder, inOrder, 0, perOrder.length - 1, 0, inOrder.length - 1);
    }

    private BinaryTreeNode constructCore(int[] perOrder, int[] inOrder, int perStart, int perEnd, int inStart, int inEnd) {

        if (perStart > perEnd ) {
            return null;
        }

        if (perStart == perEnd) {
            return new BinaryTreeNode(perOrder[perStart]);
        }

        BinaryTreeNode root = null;
        if (perOrder.length > perStart) {
            root = new BinaryTreeNode(perOrder[perStart]);
            int endPosition = -1;
            int i = inStart;
            for (; i <= inEnd; i++) {
                if (inOrder[i] == perOrder[perStart]) {
                    endPosition = i - inStart;
                    break;
                }
            }
            if (endPosition == -1) {
                throw new InvalidParameterException();
            }
            root.left = constructCore(perOrder, inOrder, perStart + 1, perStart + endPosition, inStart, i - 1);

            root.right = constructCore(perOrder, inOrder, perStart + endPosition + 1, perEnd, i + 1, inEnd);

        }
        return root;
    }



    public static class BinaryTreeNode implements Comparator<BinaryTreeNode> {
        int value;

        public BinaryTreeNode right;

        public BinaryTreeNode left;

        BinaryTreeNode(int value) {
            this.value = value;
        }


        /**
         * 递归前序遍历
         * @param node
         */
        public static void perVisitRecursive(BinaryTreeNode node) {
            if (node != null) {
                System.out.println(node.value);
                perVisitRecursive(node.left);
                perVisitRecursive(node.right);
            }
        }


        /**
         * 非递归前序遍历
         * @param node
         */
        public static void perVisitIterate(BinaryTreeNode node) {
            Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
            stack.push(node);
            while (!stack.isEmpty()) {
                BinaryTreeNode currentNode = stack.pop();
                if (currentNode != null) {
                    System.out.println(currentNode.value);
                    stack.push(currentNode.right);
                    stack.push(currentNode.left);
                }
            }
        }

        /**
         * 递归中序遍历
         * @param node
         */
        public static void inVisitRecursive(BinaryTreeNode node) {
            if (node != null) {
                inVisitRecursive(node.left);
                System.out.println(node.value);
                inVisitRecursive(node.right);
            }
        }

        /**
         * 非递归中序遍历
         * @param node
         */
        public static void inVisitIterate(BinaryTreeNode node) {
            Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
            BinaryTreeNode currentNode = node;

            while (currentNode != null || !stack.isEmpty()) {
                // 压入栈，直到最左节点
                while (currentNode != null) {
                    stack.push(currentNode);
                    currentNode = currentNode.left;
                }

                if (!stack.isEmpty()) {
                    currentNode = stack.pop();
                    // 访问当前节点
                    System.out.println(currentNode.value);
                    // 处理当前节点的右子树
                    currentNode = currentNode.right;
                }
            }
        }

        /**
         * 递归后序遍历
         * @param node
         */
        public static void postVisitRecursive(BinaryTreeNode node) {
            if (node != null) {
                postVisitRecursive(node.left);
                postVisitRecursive(node.right);
                System.out.println(node.value);
            }
        }


        /**
         * 非递归后序遍历
         * @param node
         */
        public static void postVisitIterate(BinaryTreeNode node) {
            Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
            BinaryTreeNode lasVisit = node;
            BinaryTreeNode currentNode = node;

            // 压入栈，直到最左节点
            while (currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.left;
            }

            while (!stack.isEmpty()) {
                currentNode = stack.pop();
                if (currentNode.right == null || currentNode == lasVisit) {
                    // 访问当前节点
                    System.out.println(currentNode.value);
                    // 最后访问的节点
                    lasVisit = currentNode;
                } else {
                    // 右子树不为空且未访问，再次压入当前节点
                    stack.push(currentNode);
                    currentNode = currentNode.left;
                    // 走到右子树最左节点
                    while (currentNode != null) {
                        stack.push(currentNode);
                        currentNode = currentNode.left;
                    }

                }
            }
        }


        /**
         * 比较两棵树是否相同
         * @param o1
         * @param o2
         * @return
         */
        public int compare(BinaryTreeNode o1, BinaryTreeNode o2) {
            if (o1 == null && o2 == null) {
                return 0;
            }

            if (o1 != null && o2 != null && o1.value == o2.value) {
                // 分别比较右子树与左子树
                return compare(o1.right, o2.right) | compare(o1.left, o2.left);

            }
            return -1;
        }
    }
}
