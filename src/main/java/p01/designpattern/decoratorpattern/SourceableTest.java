package p01.designpattern.decoratorpattern;

import p01.designpattern.proxypattern.Proxy;

/**
 * @author: ymm
 * @date: 2022/5/6
 * @version: 1.0.0
 * @description:
 */
public class SourceableTest {

    public static void main(String[] args) {
        Sourceable source = new Source();
        source.method();

        System.out.println("************************");

        Sourceable decorator = new Decorator(source);
        decorator.method();
        System.out.println("************************");

        Sourceable proxy = new Proxy();
        proxy.method();

    }
}
