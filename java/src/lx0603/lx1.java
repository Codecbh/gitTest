package lx0603;

import java.io.*;

/**
 * @author cbh
 * @descrition 按照刚才读取的模板文件pet. template的模板格式保存宠物数据到文本文件，
 * 即把{name}、{type}、{master}替换为具体的宠物信息，将替换后的内容写入到C:\myDoc\pet.txt中
 * @Date 2020/6/3
 */
public class lx1 {
    public static void main(String[] args) {
              String string   =null;
              StringBuffer sbf = new StringBuffer();
              OutputStreamWriter osw =null;
              BufferedWriter bw= null;
        try(InputStreamReader isr = new InputStreamReader(new FileInputStream(
                "F:\\ideaFiles\\gitTest.git\\java\\src\\lx0603\\pet. template"),"UTF-8");
            BufferedReader br= new BufferedReader(isr);
        ) {

            while((string=br.readLine())!=null){
                sbf.append(string);
            }
            System.out.println("替换前："+sbf);

            string  = sbf.toString();
            string=  string.replace("{name}","欧欧");
            string= string.replace("{type}","拉布拉多犬");
            string= string.replace("{master}","小明");
            System.out.println("替换后："+string);
            osw = new OutputStreamWriter(new FileOutputStream("F:\\ideaFiles\\gitTest.git\\java\\src\\lx0603\\pet.txt"),"UTF-8");
            bw =new BufferedWriter(osw);
            bw.write(string);
            bw.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                osw.close();
                bw.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
