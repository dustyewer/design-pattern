package yewer;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import yewer.chartfactory.Chart;
import yewer.chartfactory.ChartFactory;
import yewer.firstfactory.Factory;
import yewer.firstfactory.Product;
import yewer.chartfactory.XmlUtil;

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
