package p02;

import java.util.Optional;
import java.util.function.Function;

/**
 * @author: ymm
 * @date: 2022/5/9
 * @version: 1.0.0
 * @description:
 */
public class OptionalTest {

    public static void main(String[] args) {
        String str1 = "hello";
        if (str1 != null) {
            System.out.println("字符串长度是：" + str1.length());
        } else {
            System.out.println("字符串为空");
        }

        // Java8中使用Optional实现空值的处理
        // 1.将数据str1装到Optional对象代表的容器中
        Optional<String> optional = Optional.ofNullable(str1);
        // 2.建立映射关系，使用字符串的长度与字符串建立映射关系
/*        Optional<Integer> integer = optional.map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        });*/

        Optional<Integer> integer = optional.map(String::length);

        // 3.若字符串为空则打印0，否则打印字符串的长度
        System.out.println("integer = " + integer);
        System.out.println("integer.orElse(0) = " + integer.orElse(0));


    }
}
