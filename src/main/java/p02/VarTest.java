package p02;

import java.util.LinkedList;
import java.util.List;

/**
 * @author: ymm
 * @date: 2022/5/9
 * @version: 1.0.0
 * @description:
 */
public class VarTest {

    public static void main(String[] args) {
        // 由初始值可以推断出变量类型
//        int num = 10;
        var num = 10;

//        List<Integer> list  = new LinkedList<>();
        var list = new LinkedList<Integer>();
    }
}
