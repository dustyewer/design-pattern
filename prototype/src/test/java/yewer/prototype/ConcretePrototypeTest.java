package yewer.prototype;

import org.junit.Test;

public class ConcretePrototypeTest {

    @Test
    public void test01() {
        ConcretePrototype prototype = new ConcretePrototype();
        prototype.setAttr("s");
        System.out.println("prototype=" + prototype);

        ConcretePrototype copy = (ConcretePrototype) prototype.clone();
        System.out.println("copy=" + copy);

    }

}
