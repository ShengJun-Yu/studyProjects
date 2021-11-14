package Algorithm.link_apply;


import java.util.ArrayDeque;
import java.util.Deque;

public class DancePartner {


    void match(Person dancer[], int num) {
        //结构数组dancer中存放跳舞的男女，num是跳舞的总人数
        int i;
        Person p;
        Deque mDancers = new ArrayDeque();//男士队列初始化
        Deque fDancers = new ArrayDeque();//女士队列初始化
        for (i = 0; i < num; i++) { //依次将跳舞者依其性别入队
            p = dancer[i];
            if (p.sex == "F")
                fDancers.offer(p);   //排入女队
            else
                mDancers.offer(p);   //排入男队
        }
        System.out.println("The dancing partners are: \n ");
        while (!fDancers.isEmpty() && !mDancers.isEmpty()) {
            p = (Person) fDancers.poll();       //女士出队
            System.out.print(p.name + "        ");
            p = (Person) mDancers.poll();      //男士出队
            System.out.println(p.name);
        }
        if (!fDancers.isEmpty()) {   //输出女士剩余人数及队头女士的名字
            System.out.println("\n There are " + fDancers.size() + " women waiting for the next  round.");
            p = (Person) fDancers.peek();  //取队头
            System.out.println(p.name + " will be the first to get a partner. \n");
        } else if (!mDancers.isEmpty()) {   //输出男队剩余人数及队头者名字
            System.out.println("\n There are " + mDancers.size() + " men waiting for the next   round.");
            p = (Person) mDancers.peek();
            System.out.println(p.name + " will be the first to get a partner.");
        }
    }
}
