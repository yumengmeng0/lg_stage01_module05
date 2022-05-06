package p01.designpattern.modelmethod;

/**
 * @author: ymm
 * @date: 2022/5/6
 * @version: 1.0.0
 * @description:
 */
public class Plus extends AbstractCalculator {
    @Override
    public int calculate(int a, int b) {
        return a + b;
    }
}
