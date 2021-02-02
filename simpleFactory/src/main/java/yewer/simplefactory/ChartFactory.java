package yewer.simplefactory;

public class ChartFactory {
    public static Chart getChar(String type) {
        Chart chart = null;
        if (type.equalsIgnoreCase("Line")) {
            chart = new LineChart();
        } else if (type.equalsIgnoreCase("Pie")) {
            chart = new PieChart();
        }
        return chart;
    }
}
