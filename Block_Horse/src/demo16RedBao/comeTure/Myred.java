package demo16RedBao.comeTure;

import demo16RedBao.Red.RedPacketFrame;

/**
 * @author : Bojack
 * @date : Created in 21:56 2021.11.17
 */
public class Myred extends RedPacketFrame {
    /**
     * 构造方法：生成红包界面。
     *
     * @param title 界面的标题
     */
    public Myred(String title) {
        super(title);
    }
}
