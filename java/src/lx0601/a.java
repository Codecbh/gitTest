package lx0601;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * asd
 *描述
 * @author LiXuekai on 2020/5/31
 */
public class a {
    public static void main(String[] args) {
/*        Date date= new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(format.format(date));*/
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Calendar c = Calendar.getInstance();//获取时间
        System.out.println(format.format(c.getTime())); // ==System.out.println(format.format(date));
        //获取2020/6/2 是今年的第几周
        c.set(2020, 5, 2);
        System.out.println(c.get(Calendar.WEEK_OF_YEAR));


    }
}