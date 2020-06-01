package expand;

import java.util.Collections;
import java.util.LinkedList;

/**
 * @ProjectName: gitTest
 * @Package: expand
 * @ClassName: StuLinkedList
 * @Author: Administrator
 * @Description: LinkedList倒叙
 * @Date: 2020/5/31 14:02 * @Version: 1.0
 */
public class StuLinkedList {
    public static void main(String[] args) {
//        创建LinkedList对象
        LinkedList<String> stuList = new LinkedList<>();
        //尾部添加 小张
        stuList.addLast("小张");
        stuList.add("小明");
        stuList.add("明天");
        //首添加 小王
        stuList.addFirst("小王");
        //遍历输出
        System.out.println("排序前");
        for (String s : stuList) {
            System.out.print(s+"\t");
        }
//        搜索并显示以特定字符开始的职员姓名。
        System.out.println("\n搜索并显示以特定字符开始的职员姓名:"+stuList.contains("明天"));
        System.out.println(" Collections.reverse(stuList);倒叙输出：");
        Collections.reverse(stuList);
        for (String s : stuList) {
            System.out.print(s+"\t");
        }


    }
}
