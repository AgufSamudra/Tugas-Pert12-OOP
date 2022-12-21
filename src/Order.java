import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private int id;
    private Customer customer;
    private List<OrderDetail> details;
    private Payment payment;

    public Order(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
        this.details = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<OrderDetail> getDetails() {
        return details;
    }

    public void addDetail(OrderDetail detail) {
        this.details.add(detail);
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
