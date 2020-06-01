package lx0601.lx01;

/**
 * @author cbh 练习1
 * @Date 2020/6/1
 *  为大数据岗位课程三个学习阶段定义枚举：L1、L2、L3，分别表示第一、二、三阶段
 */
public class weekImpl {
    public static void main(String[] args) {
//        L1：大数据开发工程师
//        L2：大数据挖掘工程师
//        L3：大数据架构师
        switch (Week.L1) {
            case L1:
                System.out.println(" L1：大数据开发工程师");
                break;
            case L2:
                System.out.println("L2：大数据挖掘工程师");
                break;
            case L3:
                System.out.println("L3：大数据架构师");
                break;

        }
    }



}
