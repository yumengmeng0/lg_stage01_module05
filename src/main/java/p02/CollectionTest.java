package p02;

import java.util.List;

/**
 * @author: ymm
 * @date: 2022/5/9
 * @version: 1.0.0
 * @description:
 */
public class CollectionTest {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
//        list.add(7); // 运行时异常 UnsupportedOperationException
        System.out.println("list = " + list);
    }
}
