package airport.checkin;

import airport.Status;
import airport.entity.Customer;

public interface CustomerCheck {

    public void add(Customer cust);

    public Customer remove(Integer custId);

    public Status status = Status.valueOf("TICKET_BOOKED");

}
