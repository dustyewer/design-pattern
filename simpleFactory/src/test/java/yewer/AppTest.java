package yewer;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import yewer.simplefactory.Chart;
import yewer.simplefactory.ChartFactory;
import yewer.simplefactory.Factory;
import yewer.simplefactory.Product;
import yewer.simplefactory.XmlUtil;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void testSimpleFactory() {
        Product product = null;
        product = Factory.getProduct("b");
        System.out.println("product=" + product);
    }

    @Test
    public void testChartFactory() {
        Chart chart = null;
        chart = ChartFactory.getChar("pie");
        System.out.println("chart=" + chart);
    }

    /**
     * 从xml中获取type
     */
    @Test
    public void testChartFactoryFromXml() {
        Chart chart = null;
        String type = XmlUtil.getCharType();
        chart = ChartFactory.getChar(type);
        System.out.println("chart=" + chart);
    }

}
