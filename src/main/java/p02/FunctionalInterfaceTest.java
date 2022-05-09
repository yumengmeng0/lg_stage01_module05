package p02;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author: ymm
 * @date: 2022/5/6
 * @version: 1.0.0
 * @description:
 */

public class FunctionalInterfaceTest {

    public static void main(String[] args) {

        // 1. 匿名内部类
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("既没有参数，也没有返回值的方法");
            }
        };

        runnable.run();

        // 使用函数式接口实现函数式接口对象的创建：()->{方法体;}
        Runnable runnable1 = ()->{System.out.println("Lambda 既没有参数，也没有返回值的方法");};
        runnable1.run();

        System.out.println("*****************************************");

        Consumer<Object> consumer = new Consumer<>() {

            @Override
            public void accept(Object o) {
                System.out.println("有参数，没返回值的方法，参数是：" + o);
            }
        };

        consumer.accept("参数");

        System.out.println("*****************************************");

        Supplier<Object> supplier = new Supplier<>() {

            @Override
            public Object get() {
                return "我是返回值";
            }
        };

        Object o = supplier.get();
        System.out.println("o = " + o);

        System.out.println("*****************************************");

        Function<Object, Object> function = new Function<>() {
            @Override
            public Object apply(Object o) {
                System.out.println("参数是：" + o);
                return o;
            }
        };

        System.out.println("有参有返回值，返回值是：" + function.apply("我是参数"));
        System.out.println("*****************************************");

        Predicate<Object> predicate = new Predicate<>() {
            @Override
            public boolean test(Object o) {
                return false;
            }
        };

        // predicate 断言; 使基于; 使以…为依据; 表明; 阐明;
        boolean t = predicate.test("t");
        System.out.println("t = " + t);

    }
}
