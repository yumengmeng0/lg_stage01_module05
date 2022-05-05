package p01.designpattern;

import p01.designpattern.Sender;
import p01.designpattern.abstractfactory.MailSendFactory;
import p01.designpattern.abstractfactory.PackageSendFactory;
import p01.designpattern.abstractfactory.Provider;
import p01.designpattern.factory.SendMultipleMethodFactory;
import p01.designpattern.factory.SendNormalFactory;
import p01.designpattern.factory.SendStaticFactory;

/**
 * @author: ymm
 * @date: 2022/5/5
 * @version: 1.0.0
 * @description:
 */
public class SendFactoryTest {

    public static void main(String[] args) {

        // 1. 普通工厂模式
        SendNormalFactory sendNormalFactory = new SendNormalFactory();
        Sender mail = sendNormalFactory.produce("mail");
        mail.send();

        // 2. 多方法的工厂模式
        SendMultipleMethodFactory sendMultipleMethodFactory = new SendMultipleMethodFactory();
        Sender sender = sendMultipleMethodFactory.produceMailSender();
        sender.send();

        // 3. 静态工厂模式
        Sender sender1 = SendStaticFactory.produceMailSender();
        sender1.send();

        // 4. 抽象工厂模式
        Provider provider = new MailSendFactory();
        Sender produce = provider.produce();
        produce.send();

        Provider provider1 = new PackageSendFactory();
        Sender produce1 = provider1.produce();
        produce1.send();
    }
}
