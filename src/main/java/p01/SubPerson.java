package p01;

/**
 * @author: ymm
 * @date: 2022/5/5
 * @version: 1.0.0
 * @description:
 */
public class SubPerson extends Person {
    private int age;

    public SubPerson() {
    }

    public SubPerson(int age) {
        this.age = age;
    }

    public SubPerson(String name, int age) {
        super(name);
        this.age = age;
    }

}
