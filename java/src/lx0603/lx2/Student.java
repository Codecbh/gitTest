package lx0603.lx2;

import java.io.Serializable;

/**
 * @author cbh
 * @descrition 学生  实现学员对象(多个)的序列化和反序列化
 * @Date 2020/6/3
 */
public class Student implements Serializable {
        String name;
        String sex;
        int  password;

    public Student(String name, String sex, int password) {
        this.name = name;
        this.sex = sex;
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public Student() {
    }

    public Student(String name, int password) {
        this.name = name;
        this.password = password;
    }
}
