import db.DBCustomer;
import db.DBOrder;
import models.Customer;
import models.Order;

import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Customer customer1 = new Customer("Bob", "Smith");
        DBCustomer.save(customer1);

        Order order1 = new Order("Beans", 2);
        DBOrder.save(order1);

        Customer customer2 = new Customer("Jane", "Jones");
        DBCustomer.save(customer2);

        Order order2 = new Order("Bread", 1);
        DBOrder.save(order2);

        DBCustomer.delete(customer1);


        List<Customer> customers = DBCustomer.getCustomers();

        Customer foundCustomer = DBCustomer.find(customer2.getId());

    }
}
