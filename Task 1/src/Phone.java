public class Phone {
    static String country = "Китай";
    String phoneNumber;
    double weight;
    String manufacturer;

    public Phone() {
    }

    public Phone(String phoneNumber, double weight, String manufacturer) {
        this.phoneNumber = phoneNumber;
        this.weight = weight;
        this.manufacturer = manufacturer;
    }

    public void receiveCall(String name) {
        receiveCall(name,null);
        //System.out.println("Звонит абонент по имени " + name);
    }

    public void receiveCall(String name, String phoneNumber) {
        System.out.println("Звонит абонент по имени " + name + (this.phoneNumber != null ? " номер " + this.phoneNumber :""));
    }
}
