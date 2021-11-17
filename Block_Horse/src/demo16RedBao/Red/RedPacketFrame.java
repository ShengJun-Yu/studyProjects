package demo16RedBao.Red;


import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * ����Ŀ�� RedPacketFrame
 *
 * AWT / Swing / JavaFX
 *
 * @author ������
 */
public abstract class RedPacketFrame extends JFrame {

    private static final long serialVersionUID = 1L;
    
    private static final String DIR = "Block_Horse\\pic";

    private ArrayList<Integer> moneyList = null;

    private static int initMoney = 0;
    private static int totalMoney = 0; // ��λΪ���֡�
    private static int count = 0;

    private static HashMap<JPanel, JLabel> panelLable = new HashMap<>();

    // ��������
    private static Font fontYaHei = new Font("΢���ź�", Font.BOLD, 20);
    private static Font msgFont = new Font("΢���ź�", Font.BOLD, 20);
    private static Font totalShowFont = new Font("΢���ź�", Font.BOLD, 40);
    private static Font nameFont = new Font("΢���ź�", Font.BOLD, 40);
    private static Font showNameFont = new Font("΢���ź�", Font.BOLD, 20);
    private static Font showMoneyFont = new Font("΢���ź�", Font.BOLD, 50);
    private static Font showResultFont = new Font("΢���ź�", Font.BOLD, 15);

    /**
     * �����С WIDTH:400 HEIGHT:600
     */
    private static final int FRAME_WIDTH = 416; // ��̬ȫ�ִ��ڴ�С
    private static final int FRAME_HEIGHT = 650;
    private static JLayeredPane layeredPane = null;

    /// private static JPanel contentPane = null;

    /**
     * page1:����ҳ�� - InputPanel . ����ͳ�ʼ��!
     */
    private static JPanel inputPanel = new JPanel();

    // private static JTextField input_total = new JTextField("200"); // ������
    // private static JTextField input_count = new JTextField("3"); // ������
    private static JTextField input_total = new JTextField();
    private static JTextField input_count = new JTextField();
    private static JTextField input_people = new JTextField("30");
    private static JTextField input_msg = new JTextField("��ϲ����  ,  �󼪴���");
    private static JTextField input_total_show = new JTextField("$ " + input_total.getText().trim());
    private static JLabel input_inMoney = new JLabel(); // ���ɼ�
    private static JLabel input_bg_label = new JLabel(new ImageIcon(DIR + "\\01_input.jpg"));

    static {

        // ����λ��
        input_total.setBounds(200, 90, 150, 50);
        input_count.setBounds(200, 215, 150, 50);
        input_people.setBounds(90, 275, 25, 30);
        input_msg.setBounds(180, 340, 200, 50);
        input_total_show.setBounds(130, 430, 200, 80);
        input_inMoney.setBounds(10, 535, 380, 65);
        input_bg_label.setBounds(0, 0, 400, 600); // ����

        // ��������
        input_total.setFont(fontYaHei);
        input_count.setFont(fontYaHei);
        input_people.setFont(fontYaHei);
        input_msg.setFont(msgFont);
        input_msg.setForeground(new Color(255, 233, 38)); // ������ɫ Ϊ��ɫ
        input_total_show.setFont(totalShowFont);
        input_inMoney.setFont(fontYaHei);

        // ͸��
        input_people.setOpaque(false);
        input_total_show.setOpaque(false);
        // �� �� -- ���ɱ༭
        input_people.setEditable(false);
        input_total_show.setEditable(false);

        // �߽� -- ��
        input_total.setBorder(null);
        input_count.setBorder(null);
        input_people.setBorder(null);
        input_msg.setBorder(null);
        input_total_show.setBorder(null);

    }

    /**
     * page2:��ҳ�� - openPanel . ����ͳ�ʼ��!
     */
    private static JPanel openPanel = new JPanel();

    private static JTextField open_ownerName = new JTextField("˭˭˭");
    private static JLabel open_label = new JLabel(new ImageIcon(DIR + "\\02_open_2.gif"));
    private static JLabel open_bg_label = new JLabel(new ImageIcon(DIR + "\\02_open_1.jpg"));

    static {

        // ���� λ��.
        open_ownerName.setBounds(0, 110, 400, 50);
        open_bg_label.setBounds(0, 0, 400, 620);
        open_label.setBounds(102, 280, 200, 200);
        open_ownerName.setHorizontalAlignment(JTextField.CENTER);

        // ��������
        open_ownerName.setFont(nameFont);
        open_ownerName.setForeground(new Color(255, 200, 163)); // ������ɫ Ϊ��ɫ

        // ����ɫ
        // open_name.setOpaque(false);
        open_ownerName.setBackground(new Color(219, 90, 68));

        // ���ɱ༭
        open_ownerName.setEditable(false);
        // �߿�
        open_ownerName.setBorder(null);

    }

    /**
     * page3:չʾҳ�� - showPanel . ����ͳ�ʼ��!
     */
    private static JPanel showPanel = new JPanel();
    private static JPanel showPanel2 = new JPanel();
    private static JScrollPane show_jsp = new JScrollPane(showPanel2);

    private static JLabel show_bg_label = new JLabel(new ImageIcon(DIR + "\\03_money_1.jpg"));

    private static JTextField show_name = new JTextField("�û�����");
    private static JTextField show_msg = new JTextField("ף����Ϣ");
    private static JTextField show_money = new JTextField("99.99");
    private static JTextField show_result = new JTextField(count + "�������" + (totalMoney / 100.0) + "Ԫ,��������");

    static {
        // �ֱ�����ˮƽ�ʹ�ֱ�������Զ�����
        // jsp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        // jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        /*
         * ������ ҳ�� . 1.���˻�õĺ��-- showPanel 2.���˻�õĺ��-- show_jsp
         */
        show_name.setBounds(125, 180, 100, 30);
        show_name.setOpaque(false);
        show_name.setBorder(null);
        show_name.setFont(showNameFont);

        show_msg.setBounds(0, 220, 400, 30);
        show_msg.setOpaque(false);
        show_msg.setBorder(null);
        show_msg.setFont(msgFont);
        show_msg.setHorizontalAlignment(JTextField.CENTER);

        show_money.setBounds(0, 270, 250, 40);
        show_money.setOpaque(false);
        show_money.setBorder(null);
        show_money.setFont(showMoneyFont);
        show_money.setForeground(new Color(255, 233, 38)); // ������ɫ Ϊ��ɫ
        show_money.setHorizontalAlignment(SwingConstants.RIGHT);

        show_result.setBounds(10, 460, 400, 20);
        show_result.setOpaque(false);
        show_result.setBorder(null);
        show_result.setFont(showResultFont);
        show_result.setForeground(new Color(170, 170, 170)); // ������ɫ Ϊ��ɫ

        // ���� ͼƬ.
        show_bg_label.setBounds(0, 0, 400, 500);

    }

    static {

        // ҳ��� �����Ķ�Ӧ��ϵ.
        panelLable.put(inputPanel, input_bg_label);
        panelLable.put(openPanel, open_bg_label);
        panelLable.put(showPanel, show_bg_label);
    }

    private void init() {
        // ������-- �������ñ���
        layeredPane = this.getLayeredPane();
//        System.out.println("������||" + layeredPane);
        // System.out.println(layeredPane);

        // ��ʼ����� -- logo �ͻ�������
        initFrame();
        // ��ʼ�� ����ҳ�� -- ׼��ҳ��
        initPanel();

        // 2.��� ҳ�� --��һ��ҳ��, ���� panel ���õ� ҳ����.
        setPanel(inputPanel);

        // 3.��� ����
        addListener();
    }


    /**
     * ��ʼ����� -- logo �ͻ�������
     */
    private void initFrame() {
        // logo
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(DIR + "\\logo.gif"));
//        System.out.println("LOGO��ʼ��...");

        // ��������
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT); // ���ý����С
        this.setLocation(280, 30); // ���ý�����ֵ�λ��
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);

        // ������ ע�� �� ק , ���зſ�
        // this.setResizable(false);
        this.setVisible(true);
    }

    /**
     * ��ʼ��ҳ��-- ׼������ҳ��
     */

    private void initPanel() {
//        System.out.println("ҳ���ʼ��...");
        initInputPanel();
        initOpenPanel();
        initShowPanel();

    }

    private void initInputPanel() {

        inputPanel.setLayout(null);
        inputPanel.setBounds(0, -5, 400, 600);

        // this.add(bg_label);
        inputPanel.add(input_total);
        inputPanel.add(input_count);
        inputPanel.add(input_people);
        inputPanel.add(input_msg);
        inputPanel.add(input_total_show);
        inputPanel.add(input_inMoney);

//        System.out.println("����ҳ��||" + inputPanel);

    }

    private void initOpenPanel() {
        openPanel.setLayout(null);
        openPanel.setBounds(0, 0, 400, 600);
        // this.add(bg_label);
        openPanel.add(open_ownerName);
        openPanel.add(open_label);
//        System.out.println("��ҳ��||" + openPanel);
    }

    private void initShowPanel() {
        showPanel.setLayout(null);
        showPanel.setBounds(10, 10, 300, 600);

        // ==============
        showPanel.add(show_name);
        showPanel.add(show_msg);
        showPanel.add(show_money);
        showPanel.add(show_result);
//        System.out.println("չʾҳ��||" + showPanel);
        // ====================================
        // showPanel2.setLayout(null);
        // showPanel2.setBounds(0, 500, 401, 300);

        showPanel2.setPreferredSize(new Dimension(300, 1000));
        showPanel2.setBackground(Color.white);

        show_jsp.setBounds(0, 500, 400, 110);

    }

    /**
     * ÿ�δ�ҳ��, ���� panel�ķ���
     */
    private void setPanel(JPanel panel) {
        // �Ƴ���ǰҳ��
        layeredPane.removeAll();

//        System.out.println("��������:��ҳ��");
        // ����lable��ӵ�layeredPane��Ĭ�ϲ�
        layeredPane.add(panelLable.get(panel), JLayeredPane.DEFAULT_LAYER);

        // ���panel����Ϊ͸��
        panel.setOpaque(false);

        // ���panel ��ӵ� layeredPane��modal��
        layeredPane.add(panel, JLayeredPane.MODAL_LAYER);
    }

    // private void setShowPanel(JPanel show) {
    // setPanel(show);
    // layeredPane.add(show_jsp, JLayeredPane.MODAL_LAYER);
    //
    // }

    /**
     * ��������ļ�����
     */
    private void addListener() {

        input_total.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                // System.out.println(e);
                String input_total_money = input_total.getText();
                input_total_show.setText("$ " + input_total_money);
            }
        });

        input_count.addKeyListener(new KeyAdapter() {

            @Override
            public void keyReleased(KeyEvent e) {
                // System.out.println(e);
//                System.out.println("����:" + input_count.getText());
            }
        });
        input_msg.addKeyListener(new KeyAdapter() {

            @Override
            public void keyReleased(KeyEvent e) {
                // System.out.println(e);
//                System.out.println("����:" + input_msg.getText());
            }
        });

        input_inMoney.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {

                    // ��ȡҳ���ֵ.
                    totalMoney = (int) (Double.parseDouble(input_total.getText()) * 100); // ת����"��"
                    count = Integer.parseInt(input_count.getText());
                    if (count > 30) {
                        JOptionPane.showMessageDialog(null, "����������ó���30��", "�����������", JOptionPane.INFORMATION_MESSAGE);
                        return;
                    }

                    initMoney = totalMoney;

                    System.out.println("�ܽ�[" + totalMoney + "]��");
                    System.out.println("���������[" + count + "]��");

                    input_inMoney.removeMouseListener(this);

//                    System.out.println("��ת-->����ҳ��");

                    // ����Ⱥ������
                    open_ownerName.setText(ownerName);
                    // ���ô�ҳ��
                    setPanel(openPanel);

                } catch (Exception e2) {
                    JOptionPane.showMessageDialog(null, "��������ȷ���ܽ��򡾺��������", "������Ϣ����", JOptionPane.ERROR_MESSAGE);

                }
            }
        });

        // open_ownerName ,��� [����],�����ķ��� , ��ʾ�������Ⱥ������.

        open_ownerName.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                JOptionPane.showMessageDialog(null, "��ͨ����setOwnerName����������Ⱥ������", "Ⱥ������δ����",
                        JOptionPane.QUESTION_MESSAGE);
            }
        });

        // open label , ��� [��],�����ķ���,��ʾ������ô򿪷�ʽ.
        open_label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (openWay == null) {
                    JOptionPane.showMessageDialog(null, "��ͨ����setOpenWay���������ô򿪷�ʽ", "�򿪷�ʽδ����",
                            JOptionPane.QUESTION_MESSAGE);
                    return;
                }

//                System.out.println("��ת-->չʾҳ��");

                moneyList = openWay.divide(totalMoney, count);

//                System.out.println(moneyList);
                /*
                 * showPanel �������
                 *
                 */
                show_name.setText(ownerName);
                show_msg.setText(input_msg.getText());
                if (moneyList.size() > 0) {
                    show_money.setText(moneyList.get(moneyList.size() - 1) / 100.0 + "");
                }
                show_result.setText(count + "�������" + (initMoney / 100.0) + "Ԫ,��������");

                open_label.removeMouseListener(this);

                setPanel(showPanel);

                // �������
                for (int i = 0; i < moneyList.size(); i++) {

                    JTextField tf = new JTextField();
                    tf.setBorder(null);
                    tf.setFont(showNameFont);
                    tf.setHorizontalAlignment(JTextField.LEFT);
                    if (i == moneyList.size() - 1) {
                        tf.setText(ownerName + "��\t" + moneyList.get(i) / 100.0 + "Ԫ");

                    } else {

                        tf.setText("Ⱥ��Ա-" + i + "��\t" + moneyList.get(i) / 100.0 + "Ԫ");
                    }
                    showPanel2.add(tf);
                }

                layeredPane.add(show_jsp, JLayeredPane.MODAL_LAYER);
            }

        });

    }

    /* ======================================================================
     * **********************************************************************
     * * ���ϴ����Ϊҳ�沿�ִ���,��������/����/��ת/��ʾ��,���							*
     * *																	*
     * *																	*
     * **********************************************************************
     * ======================================================================
     */

    /**
     * ownerName : Ⱥ������
     */
    private String ownerName = "˭˭˭"; // Ⱥ������
    /**
     * openWay : ��������� [��ͨ���/�������]
     */
    private OpenMode openWay = null;


    /**
     * ���췽�������ɺ�����档
     *
     * @param title ����ı���
     */

    public RedPacketFrame(String title) {
        super(title);

        // ҳ����صĳ�ʼ��
        init();
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setOpenWay(OpenMode openWay) {
        this.openWay = openWay;
    }


}