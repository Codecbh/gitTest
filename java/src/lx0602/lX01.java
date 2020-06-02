package lx0602;

import java.io.File;
import java.io.IOException;

/**
 * @author cbh 实现查看文件属性、创建和删除文件功能
 * @Date 2020/6/2
 */
public class lX01 {
    public static void main(String[] args) {
        File file = new File("test.txt");
        //查看文件属性
        System.out.println("文件名："+file.getName());
        System.out.println("文件大小："+file.length()+"字节");
        System.out.println("文件相对路径名称："+file.getPath());
        System.out.println("文件绝对路径名称："+file.getAbsolutePath());
        System.out.println("查看list："+file.list());
//        创建新的文件前判断时候存在  存在就删除
        if (file.exists()) {
           file.delete();
            System.out.println("删除成功");
        } else {
            try {
                file.createNewFile();
                System.out.println("创建文件"+file.getName()+"成功");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
