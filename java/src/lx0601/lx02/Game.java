package lx0601.lx02;

import java.util.Scanner;

/**
 * @author cbh 系统产生一个1-100之间的随机数，请猜出这个数据是多少。
 * @Date 2020/6/1
 */
public class Game {
    public static void main(String[] args) {
        //1-100随机数
        int num = (int) (Math.random()*99+1);
        Scanner scanner = new Scanner(System.in);
        int  chosse;
        int  count =0;
       /* 分析：
        A:系统产生一个1-100之间的随机数
        B:键盘录入我们要猜的数据
        C:比较这两个数据,用if语句实现
        大了：提示大了
        小了：提示小了
        猜中了：提示恭喜你,猜中了
        D:多次猜数据,而我们不知道猜多少次,怎么办呢?*/
       do {
           System.out.println("请输入猜测的数字：");
           chosse=scanner.nextInt();

           if (num < chosse) {
               System.out.println("大了");
           } else  if (num > chosse){
               System.out.println("小了");
           }
           count++;
       }while (num!=chosse);
        System.out.println("恭喜你闯关成功，幸运数字："+num+"，猜测次数count:"+count);
    }
}
