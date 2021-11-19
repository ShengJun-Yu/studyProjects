package demo16RedBao.comeTure;

/**
 * @author : Bojack
 * @date : Created in 21:55 2021.11.17
 */
public class Bootstrap {
    public static void main(String[] args) {
        Myred red=new Myred("余盛军的红包");
        red.setOwnerName("余盛军");
        red.setOpenWay(new RandomWay());
    }
}
