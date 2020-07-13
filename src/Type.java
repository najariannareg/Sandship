public class Type {
    private String name;
    private String description;
    private String icon;
    private int maxCap;
    public Type(String n, String d, String i, int m){
        name = n;
        description = d;
        icon = i;
        maxCap = m;
    }
    public String getName(){return name;}
    public String getDescription(){return description;}
    public String getIcon(){return icon;}
    public int getMaxCap(){return maxCap;}
}
