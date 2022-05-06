package p01.designpattern.proxypattern;

import p01.designpattern.decoratorpattern.Source;
import p01.designpattern.decoratorpattern.Sourceable;

/**
 * @author: ymm
 * @date: 2022/5/6
 * @version: 1.0.0
 * @description:
 */
public class Proxy implements Sourceable {

    private Source source;

    public Proxy() {
        source = new Source();
    }

    @Override
    public void method() {
        source.method();
        System.out.println("代理对象方法");
    }
}
