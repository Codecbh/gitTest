import java.util.Calendar;

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
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.YEAR)+"年"+(c.get(Calendar.MONTH)+1)+"月");
        System.out.println(Calendar.DAY_OF_WEEK);
        System.out.println(Calendar.getAvailableCalendarTypes());
        System.out.println(Calendar.DAY_OF_WEEK);
    }
}
