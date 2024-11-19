package nl.novi.broker;

public class Address {
    public int number;
    public String street;
    public String zipcode;
    private String city;

    public Address() { }

    public Address(String zipcode, int number) {
        this.zipcode = zipcode;
        this.number = number;
    }

    public Address(int number, String street,
                   String zipcode, String city) {
        this.number = number;
        this.street = street;
        this.zipcode = zipcode;
        this.city = city;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String toString() {
        return "nummer: " + this.number +
                " street: " + this.street +
                " zipcode: " + this.zipcode +
                " city: " + this.city;
    }
}
