package AfaceToObject.Cpolymorphism.demo03Pratise;

/**
 * @author : Bojack
 * @date : Created in 16:49 2021.11.14
 */
public class Computer {
    public void powerOn() {
        System.out.println("���Կ���");
    }

    public void poweroff() {
        System.out.println("���Թػ�");
    }

    public void useDevice(USB usb) {
        usb.open();

        if (usb instanceof Mouse) {
            Mouse mouse = (Mouse) usb;
            mouse.click();
        }
        if (usb instanceof Keyboard) {
            Keyboard keyboard = (Keyboard) usb;
            keyboard.type();
        }
        usb.close();
    }

}
