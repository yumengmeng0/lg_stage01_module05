package p02;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author: ymm
 * @date: 2022/5/6
 * @version: 1.0.0
 * @description: 方法引用
 */
public class MethodReferenceTest {

    public static void main(String[] args) {
        // 1.使用匿名内部类的方式通过函数式接口Runnable中的方法实现对Person类中show方法的调用

        Person person = new Person("zhangfei", 30);

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                person.show();
            }
        };

        runnable.run();
        System.out.println("*****************************************");

        // 2.使用lambda表达式的方式实现Person类中show方法的调用
        Runnable runnable1 = () -> person.show();
        runnable1.run();

        System.out.println("*****************************************");

        // 3.使用方法引用的方式实现Person类中show方法的调用

        Runnable runnable2 = person::show;
        runnable2.run();

        System.out.println("*****************************************");
        // 4.使用匿名内部类的方式通过函数式接口Consumer中的方法来实现Person类中setName方法的掉用
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                person.setName(s);
            }
        };

        // lambda表达式
        consumer.accept("zhangsan");
        System.out.println("person = " + person);

        Consumer<String> consumer1 = s -> person.setName(s);

        consumer1.accept("lisi");
        System.out.println("person = " + person);

        // 方法引用
        Consumer<String> consumer2 = person::setName;
        consumer2.accept("wangwu");
        System.out.println("person = " + person);

        System.out.println("*****************************************");
        Supplier<String> supplier = new Supplier<String>() {
            @Override
            public String get() {
                return person.getName();
            }
        };

        String s = supplier.get();
        System.out.println("s = " + s);

        Supplier<String> supplier1 = () -> person.getName();
        String s1 = supplier1.get();
        System.out.println("s1 = " + s1);

        Supplier<String> supplier2 = person::getName;
        String s2 = supplier2.get();
        System.out.println("s2 = " + s2);


        System.out.println("*****************************************");

        // 静态函数的引用
        Function<String, Integer> function = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        };

        Integer apply = function.apply("55");
        System.out.println("apply = " + apply);

        Function<String, Integer> function1 = ((ss) -> Integer.parseInt(ss));
        Integer apply1 = function1.apply("12345");
        System.out.println("apply1 = " + apply1);

        Function<String, Integer> function2 = Integer::parseInt;
        Integer apply2 = function2.apply("999");
        System.out.println("apply2 = " + apply2);

        System.out.println("*****************************************");

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        };

        int compare = comparator.compare(1, 2);
        System.out.println("compare = " + compare);

        Comparator<Integer> comparator1 = ((o1, o2) -> o1 - o2);
        int compare1 = comparator1.compare(55, 5);
        System.out.println("compare1 = " + compare1);

        Comparator<Integer> comparator2 = Integer::compare;
        int compare2 = comparator2.compare(8, 9);
        System.out.println("compare2 = " + compare2);

        System.out.println("*****************************************");
        // 使用匿名内部类的方式通过类名来调用非静态方法
        // 其中一个参数对象作为调用对象来调用方法时，可以使用上述方式，更抽象
        Comparator<Integer> comparator3 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        int compare3 = comparator3.compare(555, 6);
        System.out.println("compare3 = " + compare3);

        Comparator<Integer> comparator4 = (o1, o2) -> o1.compareTo(o2);
        int compare4 = comparator4.compare(6, 5);
        System.out.println("compare4 = " + compare4);

        Comparator<Integer> comparator5 = Integer::compareTo;
        int compare5 = comparator5.compare(66, 4);
        System.out.println("compare5 = " + compare5);

        System.out.println("*****************************************");
        // 使用匿名内部类的方式通过Supplier函数式接口创建Person类的对象并返回
        Supplier<Person> supplier3 = new Supplier<Person>() {
            @Override
            public Person get() {
                return new Person();
            }
        };

        System.out.println("supplier3 = " + supplier3.get());

        Supplier<Person> supplier4 = () -> new Person();

        Supplier<Person> supplier5 = Person::new;
        System.out.println("supplier5.get() = " + supplier5.get());

        System.out.println("*****************************************");

        Function<Integer, Person[]> function3 = Person[]::new;
        Person[] persons = function3.apply(4);
        System.out.println(Arrays.toString(persons));

    }
}
