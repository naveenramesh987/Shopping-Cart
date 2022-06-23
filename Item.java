public class Item {
    private String name;
    private double totalPrice;
    private int quantity;

    public Item(String name, double unitPrice, int quantity) {
        this.name = name;
        this.quantity = quantity;
        totalPrice = quantity * unitPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }    

}