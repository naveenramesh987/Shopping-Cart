public class Test {
    public static void main(String[] args) {
        Item pen = new Item("pen", 7, 4);
        Item computer = new Item("HP", 1, 9);
        Item phone = new Item("iPhone", 3, 6);

        Cart cart = new Cart();
        cart.addItem(pen);
        cart.addItem(computer);
        cart.addItem(phone);
        System.out.println(cart.calculateTotalPrice());
    }
}
