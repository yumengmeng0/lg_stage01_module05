package p01.designpattern.abstractfactory;

import p01.designpattern.Sender;

/**
 * @author: ymm
 * @date: 2022/5/5
 * @version: 1.0.0
 * @description:
 */
public interface Provider {
    Sender produce();
}
