public class Product implements Comparable<Product> {
    private String name;
    private int id;
    private int vnd;

    public Product(String name, int id, int vnd) {
        this.name = name;
        this.id = id;
        this.vnd = vnd;
    }
    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public int getVnd() {
        return vnd;
    }

    public void setVnd(int vnd) {
        this.vnd = vnd;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name: " + name + '\'' +
                ", id: " + id + ", "+
                 vnd + " vnd/kg" +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        return 0;
    }
}
