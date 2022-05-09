package p02;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * @author: ymm
 * @date: 2022/5/6
 * @version: 1.0.0
 * @description:
 */
public class ListPersonTest {
    public static void main(String[] args) {

        List<Person> list = new LinkedList<>();

        list.add(new Person("zhangsan", 4));
        list.add(new Person("lisi", 15));
        list.add(new Person("wangwu", 18));
        list.add(new Person("zhaosi", 46));

        for (Person person : list) {
            System.out.println(person);
        }

        // 筛选成年人
        List<Person> list1 = new LinkedList<>(); // 成年人列表

        for (Person person : list) {
            if (person.getAge() >= 18) {
                list1.add(person);
            }
        }

        for (Person person : list1) {
            System.out.println("person = " + person);
        }


        System.out.println("*****************************************");

        // 使用Stream接口实现上面功能
        list.stream().filter(new Predicate<Person>() {
            @Override
            public boolean test(Person person) {
                return person.getAge() >= 18;
            }
        }).forEach(new Consumer<Person>() {
            @Override
            public void accept(Person person) {
                System.out.println("person = " + person);
            }
        });

        System.out.println("*****************************************");
        // 使用lambda表达式
//        list.stream().filter(person -> person.getAge()>=18).forEach(person -> System.out.println(person));
        list.stream().filter(person -> person.getAge()>=18).forEach(System.out::println);

    }
}
