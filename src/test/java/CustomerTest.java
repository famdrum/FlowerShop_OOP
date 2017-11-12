
import com.FlowerShop_OOP.Entity.Customer;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CustomerTest {
    @Test
    public void charge() throws Exception {
        Customer customer = new Customer(200);
        customer.charge(20);
        assertThat("Wrong balance", 180, is(customer.getBalance()));
    }

    @Test
    public void setMoneyAvailable() throws Exception {
    }

    @Test
    public void getBalance() throws Exception {
    }

}