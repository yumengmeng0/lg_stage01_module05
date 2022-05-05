package p01.designpattern.factory;

import p01.designpattern.MailSender;
import p01.designpattern.Sender;
import p01.designpattern.SmsSender;

/**
 * @author: ymm
 * @date: 2022/5/5
 * @version: 1.0.0
 * @description: 静态工厂模式
 */
public class SendStaticFactory {


    public static Sender produceMailSender() {
        return new MailSender();
    }

    public static Sender produceSmsSender() {
        return new SmsSender();
    }
}
