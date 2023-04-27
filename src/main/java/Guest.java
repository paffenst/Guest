public class Guest {
    //properties
    private String name;
    public Guest(String name) {
        this.name = name;
    }
    //constructor
    public Guest(){}
    @Override
    public String toString() {
        return "Guest{" +
                "name='" + name + '\'' +
                '}';
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
