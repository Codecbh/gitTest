package expand.school.pojo;

import java.util.ArrayList;

/**
 * @ProjectName: gitTest
 * @Package: expand.school.pojo
 * @ClassName: Schools
 * @Author: Administrator
 * @Description: 学校
 * @Date: 2020/5/31 14:27 * @Version: 1.0
 */
public class Schools {
    private  String schName;
    private ArrayList<Students> studentsArrayList;

    public Schools() {
    }

    public Schools(String schName, ArrayList<Students> studentsArrayList) {
        this.schName = schName;
        this.studentsArrayList = studentsArrayList;
    }

    public String getSchName() {
        return schName;
    }

    public void setSchName(String schName) {
        this.schName = schName;
    }

    public ArrayList<Students> getStudentsArrayList() {
        return studentsArrayList;
    }

    public void setStudentsArrayList(ArrayList<Students> studentsArrayList) {
        this.studentsArrayList = studentsArrayList;
    }

}
