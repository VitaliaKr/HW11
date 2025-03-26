public class Main {
    public static void main(String[] args) {
        Phone numberOne = new Phone("+375299883927",0.325,"Apple");
        Phone numberTwo = new Phone();
        numberTwo.weight = 0.211;
        numberTwo.manufacturer = "Google";
        numberOne.receiveCall("Галина", numberOne.phoneNumber);
        numberTwo.receiveCall("Валентина");

    }
}
