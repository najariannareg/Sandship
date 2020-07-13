import java.util.Map;
import java.util.TreeMap;

public class Warehouse {
    protected Map<Type, Integer> warehouse;

    public Warehouse(){
        warehouse = new TreeMap<>();
    }

    public void add(Material m, Integer i){
        if(i>m.getQuantities())
            warehouse.put(m.getType(), m.getType().getMaxCap());
        else
            warehouse.put(m.getType(), i);
    }
    public Integer remove(Material m, Integer i){
        if(i>=m.getQuantities()) {
            return warehouse.remove(m.getType());
        }else{
            return warehouse.replace(m.getType(), (m.getQuantities()-i));
        }
    }
    public int size(){return warehouse.size();}
    public boolean isEmpty(){return warehouse.isEmpty();}
}
