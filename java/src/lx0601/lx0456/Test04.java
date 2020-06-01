package lx0601.lx0456;

import java.util.Scanner;

/**
 * @author cbh 练习456
 * @Date 2020/6/1
 */
public class Test04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count=0;
        //查找特定字符出现的次数
        String strs = "我爱你中国，我爱你故乡！";
        System.out.println(strs);
        System.out.println("请输入要查询的字符：");
        String query = input.next();
        //输入一个字符串，再输入要查找的字符，判断该字符在该字符串中出现的次数
        for (int i = 0; i <strs.length() ; i++) {
            String s = strs.substring(i, i+1);
            if (query.equals(s)) {
                count++;
            }
        }
        System.out.println(strs+"中包含:"+count+"个\t"+query);
    }
}
