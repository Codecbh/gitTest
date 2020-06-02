package lx0602;

import java.io.*;

/**
 * @author cbh
 * @descrition 描述 文件“我的青春谁做主.txt”位于D盘根目录下，要求将此文件的内容复制到C:\myFile\my Prime.txt中
 * @Date 2020/6/2
 */
public class Lx02 {
    public static void main(String[] args) {
        try(  FileInputStream fis = new FileInputStream("F:\\ideaFiles\\gitTest.git\\java\\src\\lx0602\\我的青春谁做主.txt");
              FileOutputStream fo = new FileOutputStream("F:\\ideaFiles\\gitTest.git\\java\\src\\lx0602\\my Prime.txt");) {

            byte[] bytes = new byte[1024];
            int len =-1;
            while ((len = fis.read(bytes)) != -1) {
                fo.write(bytes, 0,len );
                System.out.println("复制文本成功!");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
