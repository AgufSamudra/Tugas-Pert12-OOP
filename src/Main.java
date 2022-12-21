public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("John Smith");
        Item item1 = new Item(1, "Shirt", 19.99);
        Item item2 = new Item(2, "Pants", 29.99);

        Order order = new Order(1, customer);
        order.addDetail(new OrderDetail(item1, 2));
        order.addDetail(new OrderDetail(item2, 1));
        order.setPayment(new Credit(79.97, "Visa", "1234 5678 9012 3456", "01/23"));

        customer.addOrder(order);

        System.out.println("Customer: " + customer.getName());
        System.out.println("Number of orders: " + customer.getOrders().size());
        System.out.println("Total cost: $" + order.getPayment().getAmount());
        System.out.println("Payment type: " + order.getPayment().getPaymentType());



    }
}