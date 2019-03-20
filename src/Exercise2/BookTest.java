package Exercise2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookTest {
    public static void main(String[] args) {
       List<Book> bookList = new ArrayList<>();
        bookList.add(new Book(1,"别再吃苦的年纪选择安逸",28.6));
        bookList.add(new Book(2,"三国演义",32.8));
        bookList.add(new Book(3,"水浒传",38.4));
        Iterator<Book> iterator = bookList.iterator();
        System.out.println("id        名称           价格");
        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println(book.getId() + " " + book.getName()+" "+book.getPrice());
        }
        //移除后
        System.out.println("-------移除之后的数据--------");
        bookList.remove(2);
        bookList.forEach(book -> System.out.println(book.getId()+" "+book.getName()+" "+book.getPrice()));
        //新增加
        System.out.println("-------新增的数据--------");
        bookList.add(new Book(4,"西游记",34.4));
        bookList.forEach(book -> System.out.println(book.getId()+" "+book.getName()+" "+book.getPrice()));
        //修改的
        System.out.println("--------修改的数据------");
        bookList.set(1,new Book(1,"散文诗集",12.8));
        bookList.forEach(book -> System.out.println(book.getId()+" "+book.getName()+" "+book.getPrice()));
        //返回
        System.out.println("------返回的数据------");
        bookList.add(new Book(1,"别再吃苦的年纪选择安逸",28.6));
        System.out.println(bookList.indexOf("别再吃苦的年纪选择安逸"));
        System.out.println(bookList.lastIndexOf("别再吃苦的年纪选择安逸"));
    }
}
