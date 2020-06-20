package sword.offer;

import java.util.Stack;

/**
 * 剑指offer题目7 ：用两个栈模拟队列
 * @param <T>
 */
public class QueenWithTwoStacks<T> {

    private Stack<T> stack1 = new Stack<T>();

    private Stack<T> stack2 = new Stack<T>();

    public void appendTail(T element){
        stack1.push(element);
    }

    public T deleteHead() {
        if (stack2.isEmpty()) {
            // 栈2为空
            while (!stack1.isEmpty()) {
                // 将栈1内容弹出到栈2中
                stack2.push(stack1.pop());
            }
        }
        if (!stack2.isEmpty()) {
            // 弹出栈2顶部
            return stack2.pop();
        } else {
            return null;
        }

    }

}
