package p02;

import java.util.Comparator;

/**
 * @author: ymm
 * @date: 2022/5/9
 * @version: 1.0.0
 * @description:
 */
public class DiamondTest {

    public static void main(String[] args) {
        // 匿名内部类和钻石操作符的搭配使用
        // Explicit 明确的; 清楚明白的; 易于理解的; (说话)清晰的; 直言的; 坦率的; 不隐晦的; 不含糊的;
//        Comparator<Integer> comparator = new Comparator<Integer>() { // Explicit type argument Integer can be replaced with <>
        Comparator<Integer> comparator = new Comparator<>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        };

    }
}
