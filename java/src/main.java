import java.io.File;
import java.io.IOException;

/**
 * @ProjectName: gitTest
 * @Package: PACKAGE_NAME
 * @ClassName: main
 * @Author: Administrator
 * @Description:
 * @Date: 2020/5/31 11:51 * @Version: 1.0
 */
public class main {
    public static void main(String[] args) {
        File file = new File("test.txt");
//        创建
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        System.out.println("文件大小："+file.length()+"字节");
        System.out.println("文件名称："+file.getName());
        System.out.println("文件相对路径名称："+file.getPath());
        System.out.println("文件绝对路径名称："+file.getAbsolutePath());
       /* //删除
        if (file.exists()) {
            file.delete();
            if (file.isFile()) {
                System.out.println("是文件");
            }
            if (file.isDirectory()) {
                System.out.println("是目录");
            }
        } else {
            System.out.println("不存在");
        }
*/
    }
}
