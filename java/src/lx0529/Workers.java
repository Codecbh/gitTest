package lx0529;

/**
 * @ProjectName: cbh.homework.cn
 * @Package: lx0529
 * @ClassName: Workers
 * @Author: Administrator
 * @Description: 员工
 * @Date: 2020/5/29 16:04 * @Version: 1.0
 */
public class Workers implements Comparable<Workers> {
    //姓名
      String name;
    //性别
      String sex;

    public Workers() {
    }

    public Workers(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }


    @Override
    public int compareTo(Workers o) {

        return this.name.compareTo(o.name);
    }
}

