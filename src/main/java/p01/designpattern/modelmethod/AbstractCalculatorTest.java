package p01.designpattern.modelmethod;

/**
 * @author: ymm
 * @date: 2022/5/6
 * @version: 1.0.0
 * @description:
 */

public class AbstractCalculatorTest {
    public static void main(String[] args) {
        AbstractCalculator abstractCalculator = new Plus();
        int i = abstractCalculator.splitExpression("5+6", "\\+");
        System.out.println(i);
    }
}
