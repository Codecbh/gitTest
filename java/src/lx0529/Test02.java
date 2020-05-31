package lx0529;

import sun.misc.ASCIICaseInsensitiveComparator;

import java.util.*;

/**
 * @ProjectName: cbh.homework.cn
 * @Package: lx0529
 * @ClassName: lx0529.Test02
 * @Author: Administrator
 * @Description: 测试
 * @Date: 2020/5/29 16:08 * @Version: 1.0
 */
public class Test02 {
    public static void main(String[] args)  {
        //定义hashmap类型
        Map<String, Workers> map = new HashMap<String, Workers>();
        List<Workers> workers = new ArrayList<>();
        Workers workers1 = new Workers("李明","男");
        Workers workers2 = new Workers("f4","女");
        Workers workers3 = new Workers("a2","男");
        map.put("Jack",workers1);
        map.put(workers2.getName(),workers2);
        map.put(workers3.getName(),workers3);
        workers.add(workers1);
        workers.add(workers2);
        workers.add(workers3);

        System.out.println("binarySearch用法：workers2的位置");
        int a = Collections.binarySearch(workers,workers2);
        System.out.println(a);
        System.out.println( "最小值min：");

        System.out.println(Collections.min(workers).getName()+Collections.min(workers).getSex());
        System.out.println("查询 Jack 的中文信息");
        if (map.keySet().contains("Jack")) {
            System.out.println("Jack对应的的学员姓名："+map.get("Jack").getName()+"\t性别:"+map.get("Jack").getSex());
        } else {
            System.out.println("未找到！");
        }
        System.out.println("显示员工姓名性别");
        System.out.println("******方法一list for************");
       // Collections.sort(workers);
        for (Workers worker : workers) {
            System.out.println(worker.name+"\t"+worker.getSex());
        }
        System.out.println("******方法一mapping.getValue(p************");

        List<Map.Entry<String, Workers>> list = new ArrayList<Map.Entry<String, Workers>>(map.entrySet());
        Collections.sort(list,new Comparator<Map.Entry<String, Workers>>() {
            //升序排序
            public int compare(Map.Entry<String, Workers> o1,
                               Map.Entry<String, Workers> o2) {
                return o1.getValue().name.compareTo(o2.getValue().name);
            }

        });

        for(Map.Entry<String, Workers> mapping:list){
            System.out.println(mapping.getKey()+":"+mapping.getValue().getSex());
        }



        Iterator iterator = map.entrySet().iterator();

        while(iterator.hasNext())
        {
            Map.Entry<String, Workers> entry=(Map.Entry<String, Workers>) iterator.next();
            System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue().getName()+"\t"+entry.getValue().getSex());
        }



    }
}
