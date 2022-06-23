public class Cart {
    private Item[] cart;
    private double totalPrice;
    private int storedItems;

    public Cart() {
        cart = new Item[5];
    }

    public Cart(int size) {
        cart = new Item[size];
    }

    public void addItem(Item item) {
        if (storedItems < cart.length) {
            cart[storedItems] = item;
            storedItems++;
        }
        else {
            System.out.println("Shopping cart is full");
        }
    }

    public double calculateTotalPrice() {
        for (int i = 0; i < cart.length; i++) {
            totalPrice += cart[i].getTotalPrice();
        }
        return totalPrice;
    }

}
