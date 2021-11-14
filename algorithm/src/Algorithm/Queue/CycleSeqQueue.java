package Algorithm.Queue;

public class CycleSeqQueue implements QueueInter {
    final int MAXSIZE = 100;
    int[] element;
    int front, rear;

    /**
     * 在循环队列中实现初始化操作
     */
    public CycleSeqQueue() {
        element = new int[MAXSIZE];
        front = 0;
        rear = 0;
    }

    /**
     * 在循环队列上实现入队操作
     *
     * @param
     */
    @Override
    public void enQueue(int x) {
        //若循环队列sq未满，插入x为新队列队尾元素；否则队列信息不变并输出错误信息
        if ((rear + 1) % MAXSIZE == front)//判断队列sq是否真的满了
            System.out.println("Overflow");
        else {
            rear = (rear + 1) % MAXSIZE;
            element[rear] = x;
        }
    }

    /**
     * 在循环队列上实现出队操作
     *
     * @return
     */

    @Override
    public int deQueue() {
        if (rear == front)//判空
            return 0;
        else {
            front = (front + 1) % MAXSIZE;
            return element[front];
        }
    }

    /**
     * 在循环队列上实现求队列长度操作
     *
     * @return
     */

    @Override
    public int size() {
        //取模运算的被除数加上MAXSIZE是考虑rear- front<0的情况
        return ((MAXSIZE + rear - front) % MAXSIZE);
    }

    /**
     *
     */
    @Override
    public void clear() {

    }

    /**
     * 在循环队列上实现判队空操作
     *
     * @return
     */
    @Override
    public boolean isEmpty() {
        //判别队列是否为空;若为空返回真值，否则返回假值
        int fronr = 0;
        return rear == fronr ? true : false;
    }

    /**
     * 在循环队列上实现读队头元素操作
     *
     * @return
     */
    @Override
    public int head() {
        //若循环队列sq不空，则返回队头元素值；否则返回空元素NULL
        if (front == rear)
            return 0;
        else
            return (element[(front + 1) % MAXSIZE]);
    }
}

