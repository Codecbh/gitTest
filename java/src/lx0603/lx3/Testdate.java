package lx0603.lx3;

import java.util.Date;

/**
 * @author cbh
 * @descrition 测试封装的日期转换
 * @Date 2020/6/3
 */
public class Testdate {
    public static void main(String[] args){
        Date da = new Date();
        String date1="2020-05-11 11:58:09";
        try {

            System.out.println( "date转string:" +  DateOrString.DateTostring(da));
            System.out.println( "string转date:" +  DateOrString.StringToDate(date1));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
