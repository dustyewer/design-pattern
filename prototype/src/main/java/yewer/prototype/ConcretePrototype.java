package yewer.prototype;

public class ConcretePrototype extends Prototype {
    private String attr;

    public void setAttr(String attr) {
        this.attr = attr;
    }

    public String getAttr() {
        return attr;
    }

    @Override
    public Prototype clone() {
        ConcretePrototype prototype = new ConcretePrototype();
        prototype.setAttr(this.attr);
        return prototype;
    }

    public void say() {
        System.out.println("haha");
    }

}
