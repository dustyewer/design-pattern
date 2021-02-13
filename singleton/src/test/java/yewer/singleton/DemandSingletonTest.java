package yewer.singleton;

import org.junit.Test;

public class DemandSingletonTest {
    @Test
    public void test01(){
        DemandSingleton d1, d2;
        d1 = DemandSingleton.getInstance();
        d2 = DemandSingleton.getInstance();
        System.out.println(d1+"="+d2);
        }
}
