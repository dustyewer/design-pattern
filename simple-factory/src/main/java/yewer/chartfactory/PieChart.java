package yewer.chartfactory;

public class PieChart implements Chart {

    @Override
    public void display() {
        System.out.println("显示饼图");
    }

    public PieChart() {
        System.out.println("创建饼图");
    }

}
