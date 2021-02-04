package yewer.firstfactory;

import org.junit.Test;

import yewer.chartfactory.Chart;
import yewer.chartfactory.ChartFactory;
import yewer.chartfactory.XmlUtil;

public class FactoryTest {
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