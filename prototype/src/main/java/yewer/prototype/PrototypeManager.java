package yewer.prototype;

import java.util.Hashtable;

public class PrototypeManager {
    private Hashtable<Object,Object> prototypeTable = new Hashtable<Object, Object>();

    public PrototypeManager() {
        prototypeTable.put("A", new ConcretePrototype());
    }

    public void add(String key, Prototype prototype) {
        prototypeTable.put(key, prototype);
    }

    public Prototype get(String key) {
        Prototype clone = null;
        clone = ((Prototype) prototypeTable.get(key)).clone();
        return clone;
        }
    
}
