package expand.school;

import expand.school.pojo.Schools;
import expand.school.pojo.Students;

import java.util.ArrayList;

/**
 * @ProjectName: gitTest
 * @Package: expand.school
 * @ClassName: Test
 * @Author: Administrator
 * @Description:
 * @Date: 2020/5/31 14:27 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Students stu1 = new Students(1,"喜洋洋",22,"男");
        Students stu2 = new Students(1,"美洋洋",18,"女");
        Students stu3 = new Students(1,"懒洋洋",16,"男");
        ArrayList<Students> addStu = new ArrayList<>();
        addStu.add(stu1);
        addStu.add(stu2);
        addStu.add(stu3);
        Schools schools = new Schools("北大青鸟",addStu);
        System.out.println(" 查询所有学生的方法");
        for (Students s : addStu ) {
            System.out.println(s.toString());
        }
//        根据姓名查询学生的方法，
//        根据年龄查询学生的方法，
//        根据性别查询学生的方法。
    }

}
