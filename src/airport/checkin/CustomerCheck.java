package airport.checkin;

import airport.entity.Customer;

public interface CustomerCheck {

    public void Add(Customer cust);

    public Customer remove(Integer custId);

}
