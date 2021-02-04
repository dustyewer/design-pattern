package yewer.firstfactory;

import org.junit.Test;

public class FirstFactoryTest {

    @Test
    public void test() {
        Product product = null;
        product = Factory.getProduct("b");
        System.out.println("product=" + product);
    }

}
