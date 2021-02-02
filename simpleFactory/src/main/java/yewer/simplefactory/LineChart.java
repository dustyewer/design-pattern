package yewer.simplefactory;

public class LineChart implements Chart {

    @Override
    public void display() {
        System.out.println("显示折线");

    }

    public LineChart() {
        System.out.println("创建折线");
    }

}
