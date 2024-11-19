package nl.novi.broker;

public class House {
    private Address address;
    private short numberOfRooms;
    private int price;

    public House(Address address, short numberOfRooms, int price) {
        this.address = address;
        this.numberOfRooms = numberOfRooms;
        this.price = price;
    }

    public String toString() {
        return "House{" +
                "address=" + address +
                ", numberOfRooms=" + numberOfRooms +
                ", price=" + price +
                '}';
    }
}
