import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author cbh
 * @Date 2020/6/2
 */
public class IOTest {
    public static void main(String[] args) {
        FileInputStream fin = null;
        FileOutputStream fout = null;
        try {
            fin = new FileInputStream("F:\\a.txt");
            fout = new FileOutputStream("F:\\B.txt");
            byte[] words = new byte[1024];
            int len =-1;
            while ((len = fin.read(words))!=-1) {
                fout.write(words, 0, len);

                fout.flush();
            }
            System.out.println("复制成功！");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fin.close();
                fout.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
