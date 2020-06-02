package lx0602;

import java.io.*;

/**
 * @author cbh
 * @descrition 音乐位于d盘根目录下，要求将此音乐复制到工程中；
 * @Date 2020/6/2
 */
public class DateIO {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("F:\\ideaFiles\\gitTest.git\\java\\src\\lx0602\\Remix.mp3");
            FileOutputStream fo = new FileOutputStream("F:\\ideaFiles\\gitTest.git\\java\\src\\lx0602\\x.mp3");
            DataInputStream fisDate = new DataInputStream(fis);
            DataOutputStream foDate = new DataOutputStream(fo);
              ) {
            byte[] bytes = new byte[1024];
            int len =-1;

            while ((len = fisDate.read(bytes)) != -1) {
                foDate.write(bytes, 0,len );
            }
            System.out.println("复制音乐成功!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
