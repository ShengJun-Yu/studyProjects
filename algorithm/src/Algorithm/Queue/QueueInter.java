package Algorithm.Queue;

public interface QueueInter {

    void enQueue(int obj);//数据入队

    int deQueue();//数据出队

    int size();//返回队列中元素个数

    void clear();//清空队列

    boolean isEmpty();//判断队列是否为空

    int head();//读取队列首元素

}
