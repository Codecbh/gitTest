package enumTest;

import java.util.Random;

/**
 * @author cbh on 2020/6/1
 */
public class StuSexEnum {
    private  Genders sex;//性别

    public static void main(String[] args) {
        StuSexEnum stu = new StuSexEnum();
        stu.sex =Genders.男;
        String msg="您的注册码为%s,谢谢注册!";

        System.out.println("Math.random得到小数");
        System.out.println(Math.round((Math.random()+1) * 1000));
        System.out.println("Random");
        System.out.println(new Random().nextInt(9999));
        System.out.println("字符串前面补0的话就这样String.format");
        System.out.println(String.format("%04d",new Random().nextInt(9999)));

    }
}