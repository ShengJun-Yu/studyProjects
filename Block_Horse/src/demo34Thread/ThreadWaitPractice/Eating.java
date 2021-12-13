package demo34Thread.ThreadWaitPractice;

/**
 * @author : Bojack
 * @date : Created in 19:15 2021.12.13
 */
public class Eating extends Thread{
    private Baozi baozi;

    public Eating(Baozi baozi) {
        this.baozi = baozi;
    }

    @Override
    public void run() {
        while (true){
            synchronized (baozi){
                if (baozi.flag==false){
                    try {
                        baozi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (baozi.flag==true){
                    System.out.println("吃"+baozi.pi+baozi.xian+"的包子");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    baozi.flag=false;
                    System.out.println("吃完了"+baozi.pi+baozi.xian+"的包子，包子铺快做包子");

                    baozi.notify();
                    System.out.println("=====================");
                }
            }
        }
    }
}
