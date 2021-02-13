package yewer.prototype.clone;

public class Attachment {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void download(){
        System.out.println("download attch"+name);



    }
}
