package Algorithm.Stack;

public class SeqStack implements StackIntf {
    final int maxSize = 100;
    int[] element = new int[maxSize];
    int top; //指明栈顶指针

    /**
     * 顺序栈上实现出栈操作
     *
     * @return
     */
    public int pop() {
        // 若栈不空，则删去栈顶元素并返回元素值，否则返回空元素-1
        if (top == 0)
            return -1;
        else {
            return element[--top];   //返回原栈顶元素值
        }
    }

    //入栈操作
    public void push(int x) {
        // 若栈s未满，将元素x压入栈中；否则，栈的状态不变并给出出错信息
        if (top == maxSize) {
            System.out.println("Overflow");
        } else {
            element[top++] = x;//x进栈
        }
    }

    public SeqStack() {
    }


    /**
     * 顺序栈上实现求栈深操作
     *
     * @return
     */
    public int size() {
        return top;
    }


    /**
     * 顺序栈上实现读取栈顶元素操作
     *
     * @return
     */
    public int top() {
        if (top == 0)
            return -1;
        else
            return element[top - 1];
    }

    /**
     * 顺序栈上实现栈置空操作
     */
    public void clear() {
        top = 0;
    }

    /**
     * 顺序栈上实现判栈空操作
     *
     * @return
     */
    public boolean isEmpty() {
        return top > 0 ? false : true;
    }

    public void printStack() {
        while (!isEmpty()) {
            System.out.print(pop() + " ");
        }
    }
}
