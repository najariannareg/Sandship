
import java.util.Map;
import java.util.TreeMap;

public class Player {
    Map<String, Warehouse> warehouses;

    public Player(){
        warehouses = new TreeMap<>();
    }

    public void move(String w1, String w2, Material m, Integer i){
        warehouses.get(w2).add(m, warehouses.get(w1).remove(m, i));
    }

    public void add(String name, Warehouse w){warehouses.put(name, w);}
    public void remove(String name){warehouses.remove(name);}
    public int size(){return warehouses.size();}
    public boolean isEmpty(){return warehouses.isEmpty();}
}
