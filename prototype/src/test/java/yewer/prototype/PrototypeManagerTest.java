package yewer.prototype;

import java.util.Hashtable;

import org.junit.Test;

public class PrototypeManagerTest {
    @Test
    public void test01() {
        PrototypeManager pm = new PrototypeManager();
        ConcretePrototype concretePrototype = (ConcretePrototype) pm.get("A");
        concretePrototype.say();

    }
}
