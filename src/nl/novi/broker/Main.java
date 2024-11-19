package nl.novi.broker;

public class Main {
    public static void main(String[] args) {
        Address a1 = new Address(22, "Dorpstraat",
                "1234 BB", "Leiden");
        System.out.println("a1 = " + a1);
        
        Address a2 = new Address("8888 ZZ", 13);
        a2.setCity("Venlo");
        System.out.println(a2.getCity());
        System.out.println("a2 = " + a2);

        Address a3 = new Address();
        System.out.println("a3 = " + a3);

        House house1 = new House(a3, (short) 5, 475_000);
        System.out.println(house1);
    }
}
