package lx0601.lx0456;

/**
 * @author cbh 练习456 字母大写
 * @Date 2020/6/1
 */
public class Test06 {
    public static void main(String[] args) {
//        给出一句英文句子： "let there be light"
//        得到一个新的字符串，每个单词的首字母都转换为大写
        String old =  "let there be light";
        String[] arr = old.split(" ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"");
            arr[i]=arr[i].substring(0, 1).toUpperCase()+arr[i].substring(1, arr[i].length());
            System.out.println(":"+arr[i]);
        }
        System.out.println("new  得到一个新的字符串");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
