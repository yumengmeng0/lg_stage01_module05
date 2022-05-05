package p01.designpattern;

/**
 * @author: ymm
 * @date: 2022/5/5
 * @version: 1.0.0
 * @description: 单例设计模式
 */
public class Singleton {

    private static Singleton sin = null;

    private Singleton() {

    }

    private static /*synchronized*/ Singleton getInstance() {

/*        synchronized (Singleton.class) {
            if (sin == null) {
                sin = new Singleton();
            }
            return sin;
        }*/

        if (sin == null) {
            synchronized (Singleton.class) {
                if (sin == null) {
                    sin = new Singleton();
                }
            }
        }

        return sin;
    }

}
