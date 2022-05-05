package p01.designpattern.factory;

import p01.designpattern.MailSender;
import p01.designpattern.Sender;
import p01.designpattern.SmsSender;

/**
 * @author: ymm
 * @date: 2022/5/5
 * @version: 1.0.0
 * @description:
 */
public class SendMultipleMethodFactory {

    public Sender produceMailSender() {
        return new MailSender();
    }

    public Sender produceSmsSender() {
        return new SmsSender();
    }
}
