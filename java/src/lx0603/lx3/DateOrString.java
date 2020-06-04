package lx0603.lx3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author cbh
 * @descrition 字符串转换成日期 （2）日期转换成字符串
 * @Date 2020/6/3
 */
public class DateOrString {

       static SimpleDateFormat simpleDateFormat =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        public static  String DateTostring(Date date) {
            return  simpleDateFormat.format(date);
        }

        public static  Date StringToDate(String string) throws Exception {
                return  (Date) simpleDateFormat.parse(string);
        }
}
