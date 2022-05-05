package p01.designpattern;

/**
 * @author: ymm
 * @date: 2022/5/5
 * @version: 1.0.0
 * @description:
 */
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("发送邮件");
    }
}
