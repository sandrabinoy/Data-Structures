package airport.entity;

import java.util.Date;

public class Customer {

    private Integer customerId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String fullName;
    private Integer age;
    private Long contactNo;
    private String mailId;
    private String airline;
    private String seatNo;
    private String gateNo;
    private String dest;
    private String source;
    private Date dateOfTravel;

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFullName() {
        if(getMiddleName() != null) {
            fullName = getFirstName() + " " + getMiddleName() + " " + getLastName();
        }
        else {
            fullName = getFirstName() + " " + getLastName();
        }
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Long getContactNo() {
        return contactNo;
    }

    public void setContactNo(Long contactNo) {
        this.contactNo = contactNo;
    }

    public String getMailId() {
        return mailId;
    }

    public void setMailId(String mailId) {
        this.mailId = mailId;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    public String getGateNo() {
        return gateNo;
    }

    public void setGateNo(String gateNo) {
        this.gateNo = gateNo;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Date getDateOfTravel() {
        return dateOfTravel;
    }

    public void setDateOfTravel(Date dateOfTravel) {
        this.dateOfTravel = dateOfTravel;
    }

    public Customer(Integer custId, String firstName, String middleName, String lastName, Integer age, Long contactNo, String mailId, String seatNo, String gateNo, String dest, String source, Date dateOfTravel) {
        this.customerId = custId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        setFullName();
        this.age = age;
        this.contactNo = contactNo;
        this.mailId = mailId;
        this.seatNo = seatNo;
        this.gateNo = gateNo;
        this.dest = dest;
        this.source = source;
        this.dateOfTravel = dateOfTravel;
    }
}
