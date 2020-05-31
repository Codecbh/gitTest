package expand.school.pojo;

/**
 * @ProjectName: gitTest
 * @Package: expand.school.pojo
 * @ClassName: Students
 * @Author: Administrator
 * @Description: 学生 学号、姓名、年龄、性别等属性。
 * @Date: 2020/5/31 14:27 * @Version: 1.0
 */
public class Students {
    //学号、姓名、年龄、性别等属性。
    private  int stuNo;
    private  String name;
    private  int age;
    private  String sex;

    @Override
    public String toString() {
        return "Students{" +
                "stuNo=" + stuNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    public Students() {
    }

    public Students(int stuNo, String name, int age, String sex) {
        this.stuNo = stuNo;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public int getStuNo() {
        return stuNo;
    }

    public void setStuNo(int stuNo) {
        this.stuNo = stuNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
