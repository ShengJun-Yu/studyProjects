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
                        baozi.pi="����Ƥ";
                        baozi.xian="������";
                    }else {
                        baozi.pi="����Ƥ";
                        baozi.xian="�������";
                    }
                    System.out.println("������"+baozi.pi+baozi.xian+"����");
                    cont++;
                    baozi.flag=true;
                    System.out.println("���������ˣ������ԣ�����");
                    baozi.notify();

                }
            }
        }
    }
}
