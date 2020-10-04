public class Product implements Comparable<Product> {

    private String type;
    private  String color;
    private String mark;
    private String size;
    private int price;

    public Product() {
    }

    public Product(String type, String color, String mark, String size, int price) {
        this.type = type;
        this.color = color;
        this.mark = mark;
        this.size = size;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", mark='" + mark + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Product product) {
        if(price == product.price){
            return 0;
        }else if(price > product.price){
            return -1;
        }else return 1;
    }
}
