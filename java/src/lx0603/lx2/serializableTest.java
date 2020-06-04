package lx0603.lx2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * @author cbh
 * @descrition 学生集合序列化
 * @Date 2020/6/3
 */
public class serializableTest {
    public static void main(String[] args) {
        ArrayList<Student> arrayList =new ArrayList<>();
        ArrayList<Student> RarrayList =new ArrayList<>();
        arrayList.add(new Student("小明","男",123456));
        arrayList.add(new Student("wang2","女",123));
        arrayList.add(new Student("的4","男",654));
        ObjectOutputStream oos =null;
        ObjectInputStream ois =null;
        try {
          /*  System.out.println("序列化！");
            oos = new ObjectOutputStream(new FileOutputStream("F:\\ideaFiles\\gitTest.git\\java\\src\\lx0603\\lx2\\xu.txt"));
            oos.writeObject(arrayList);*/
            ois = new ObjectInputStream(new FileInputStream("F:\\ideaFiles\\gitTest.git\\java\\src\\lx0603\\lx2\\xu.txt"));
            RarrayList   = (ArrayList<Student>) ois.readObject();
            //反序列化
            for (Student student : RarrayList) {
                System.out.println(student.getName()+"\t"+student.getSex()+"\t"+student.getPassword());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
