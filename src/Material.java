public class Material {
    private Type type;
    private Integer quantities;

    public Material(Type t, Integer i){
        type = t;
        if(i>t.getMaxCap())
            quantities = t.getMaxCap();
        else
            quantities = i;
    }

    public Type getType(){return type;}
    public Integer getQuantities(){return quantities;}
    public boolean isEmpty(){return quantities==0;}
}
