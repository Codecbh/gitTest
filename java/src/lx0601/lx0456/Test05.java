package lx0601.lx0456;

/**
 * @author cbh 练习456 字母大写
 * @Date 2020/6/1
 */
public class Test05 {
    public static void main(String[] args) {
        String str = "Nature has given us that two ears, two eyes, and but one tongue, to the end that we should hear "
                + "and see more than we speak";
        int m = 0;
        String[] strNew = str.split(" ");
        for(int j = 0; j < strNew.length; j++) {
            if(strNew[j].equals("two")) {
                m = j;
                System.out.println(strNew[m] + m);
            }
        }
      /*  System.out.println( "最后的" + strNew[m] + "在" + m + "," + "转换后为" + strNew[m].substring(0,1).toUpperCase() +
                strNew[m].substring(1,strNew[m].length()));*/
        //改变后的值赋给他
        strNew[m]=strNew[m].substring(0,1).toUpperCase() + strNew[m].substring(1,strNew[m].length());
        for (int i = 0; i < strNew.length; i++) {
            System.out.print(strNew[i]+" ");
        }


    }
}
