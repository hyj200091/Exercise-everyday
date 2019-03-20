package Exercise3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * 实现Comparable接口的Car 放入List进行排序
 * @author 侯粤嘉
 * 2019.03.20
 */
public class CarList {
    public static void main(String[] args) {
        //创建List对象，存入Car
        List<Car> list = new ArrayList<>();
        list.add(new Car("奔驰    ",4));
        list.add(new Car("上海大众",2));
        list.add(new Car("北京现代",3));
        list.add(new Car("哈佛    ",1));
        //调用Colections的sort方法，会自动调用compareTo方法进行排序
        Collections.sort(list);
        //用foreach遍历list
        System.out.println("----品牌----  id");
        for (Car cars:list) {
            System.out.println(cars.getName()+ "     "+cars.getId());
        }
    }
}
