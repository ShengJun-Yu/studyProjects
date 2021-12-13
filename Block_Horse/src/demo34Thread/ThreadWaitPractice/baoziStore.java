package demo34Thread.ThreadWaitPractice;

/**
 * @author : Bojack
 * @date : Created in 19:00 2021.12.13
 */
public class baoziStore extends Thread{
    private Baozi baozi ;

    public baoziStore(Baozi baozi) {
        this.baozi = baozi;
    }

    @Override
    public void run() {
        int cont=0;
        while (true){
            synchronized(baozi){
                if (baozi.flag==true){
                    try {
                        baozi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (baozi.flag==false){
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (cont%2==1) {
                        baozi.pi="橘子皮";
                        baozi.xian="猪肉大葱";
                    }else {
                        baozi.pi="西瓜皮";
                        baozi.xian="羊肉洋葱";
                    }
                    System.out.println("生产了"+baozi.pi+baozi.xian+"包子");
                    cont++;
                    baozi.flag=true;
                    System.out.println("包子做好了，快来吃！！！");
                    baozi.notify();

                }
            }
        }
    }
}
