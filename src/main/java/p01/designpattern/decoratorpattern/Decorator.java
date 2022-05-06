package p01.designpattern.decoratorpattern;

/**
 * @author: ymm
 * @date: 2022/5/6
 * @version: 1.0.0
 * @description: 装饰器模式
 */
public class Decorator implements Sourceable {

    private Sourceable source;

    public Decorator(Sourceable source) {
        this.source = source;
    }

    @Override
    public void method() {
        source.method();
        System.out.println("装饰器方法");
    }
}
