package p01.designpattern.abstractfactory;

import p01.designpattern.Sender;
import p01.designpattern.SmsSender;

/**
 * @author: ymm
 * @date: 2022/5/5
 * @version: 1.0.0
 * @description:
 */
public class SmsSendFactory implements Provider{
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
