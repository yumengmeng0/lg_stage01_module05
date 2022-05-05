package p01.designpattern.factory;

import p01.designpattern.MailSender;
import p01.designpattern.Sender;
import p01.designpattern.SmsSender;

/**
 * @author: ymm
 * @date: 2022/5/5
 * @version: 1.0.0
 * @description: 普通工厂模式
 */
public class SendNormalFactory {

    public Sender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        }
        if ("sms".equals(type)) {
            return new SmsSender();
        }
        return null;
    }

}
