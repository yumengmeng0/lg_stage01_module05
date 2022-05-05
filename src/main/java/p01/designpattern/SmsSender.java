package p01.designpattern;

import p01.designpattern.Sender;

/**
 * @author: ymm
 * @date: 2022/5/5
 * @version: 1.0.0
 * @description:
 */
public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("发送短信");
    }
}
