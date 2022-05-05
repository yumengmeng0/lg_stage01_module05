package com.lagou.task21;

public class SourceableTest {

    public static void main(String[] args) {

        Sourceable sourceable = new Source();
        sourceable.method();

        System.out.println("---------------------------------------------------");
        // 接下来使用装饰类实现功能
        Sourceable sourceable1 = new Decorator(sourceable);
        sourceable1.method();

        System.out.println("---------------------------------------------------");
        Sourceable sourceable2 = new Proxy();
        sourceable2.method();
    }
}
