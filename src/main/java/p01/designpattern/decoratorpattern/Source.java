package p01.designpattern.decoratorpattern;

/**
 * @author: ymm
 * @date: 2022/5/6
 * @version: 1.0.0
 * @description:
 */
public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("原方法");
    }
}
