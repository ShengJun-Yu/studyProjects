package 基础语法;

/**
 * @author : Bojack
 * @date : 2021年9月22日17:16:36
 */
public class typleOfData {
    public static void main(String[] args) {

//定义整型数据
        System.out.println("定义整型数据");
        int x = 10;
        //定义x变量，常量10，为x赋值10
        int y = x * 2;
        //定义变量y
        System.out.println(x);
        System.out.println(y);
        System.out.println();  //空行

//数据溢出
        System.out.println("数据溢出");
        long longnum = 214744444483650L;
        //该数据（常量）已经超出默认数据类型int的表示范围，故加后缀“L”表示此常量数据类型为long
        int intnum = (int) longnum;
        System.out.println(longnum);
        System.out.println(intnum);
        System.out.println();  //将long类型变量转换为int类型变量，但由于超出范围，故发生数据溢出

// 定义浮点型数据
        System.out.println("定义浮点型数据");
        double xiaoshu1 = 7.7;//7.7是小数，所以默认属于double类型
        System.out.println(xiaoshu1 * 2);  //double 型*int 型（自动转化为double型，2.0） = double 型
        float xiaoshu2 = 8.8F;  //小数默认类型为double，故若需要定义float类型数据，加后缀F，“8.8F”也可以写成“(float) 8.8"
        System.out.println(xiaoshu2);
        int xiaoshu3 = 12;
        int xiaoshu4 = 5;
        System.out.println(xiaoshu3 / (double) xiaoshu4);
        System.out.println();
        //int 型除 int 型，结果还是 int 型，故若结果为整数，需要将其中一个 int 型数据（除数或被除数）转化为 double 型

// 定义字符型数据
        System.out.println("定义字符型数据");
        char zifu1 = 'A';
        int zifu2 = zifu1;
        System.out.println(zifu1);  //输出字符
        System.out.println(zifu2);  //字符型和 int 型互换，int 型以编码的形式出现（A编码是65，故输出65）
        System.out.println();

//定义布尔型数据
        System.out.println("定义布尔型数据 ");
        boolean buer1 = false;  //布尔型数据只有两种取值：true、false
        if (!buer1) {
            System.out.println("Yes!");
            System.out.println();
        }  //if函数

//定义String型数据
        System.out.println("定义String型数据");
        String str1 = "hello ";
        str1 = str1 + "Yin";  //字符串连接
        str1 += "!!!";  //字符串连接简化
        System.out.println(str1);
        System.out.println();

//取值语句：数据类型.MAX_VALUE
        System.out.println("取值语句：数据类型.MAX_VALUE");
        int maxint = Integer.MAX_VALUE;   //取数据类型 int（integer的缩写）的最大值
        int minint = Integer.MIN_VALUE;  //取数据类型 int的最小值
        short maxshort = Short.MAX_VALUE;
        short minshort = Short.MIN_VALUE;
        byte maxbyte = Byte.MAX_VALUE;
        byte minbyte = Byte.MIN_VALUE;
        long maxlong = Long.MAX_VALUE;
        long minlong = Long.MIN_VALUE;
        double maxdoub = Double.MAX_VALUE;
        double mindoub = Double.MIN_VALUE;
        System.out.println(maxbyte);
        System.out.println(minbyte);
        System.out.println(maxshort);
        System.out.println(minshort);
        System.out.println(maxint);
        System.out.println(minint);
        System.out.println(maxlong);
        System.out.println(minlong);
        System.out.println(maxdoub);
        System.out.println(mindoub);
    }
}
