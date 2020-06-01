package lx0601.lx03;


import java.util.Scanner;

/**
 * @author cbh 要求 用户名长度不小于3 密码长度不小于6 注册时两次输入密码 必须相同
 * @Date 2020/6/1
 */
public class VipZC {
    public static void main(String[] args) {
        System.out.println("**********欢迎进入注册系统************");
        Scanner input = new Scanner(System.in);
        String name,password,checkpwd;
        boolean same = true;
        do {
            System.out.println("请输入用户名：");
            name = input.next();
            System.out.println("请输入密码：");
            password = input.next();
            System.out.println("请再次输入密码：");
            checkpwd = input.next();
            if (name.length() < 3 || password.length() < 6) {
                System.out.println("用户名长度不能小于3，密码长度不能小于6！");
            } else if (!password.equals(checkpwd)) {
                System.out.println("两次输入的密码不相同!");
            } else {
                same = false;
            }



        }while (same);
        System.out.println("注册成功，请牢记账号密码!");

    }
}
