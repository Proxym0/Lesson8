package Phone;

public class main {
    public static void main(String[] args) {
        Phone ph1=new Phone();
        ph1.receiveCall("Alexandr");
        ph1.getNumber();
        ph1.receiveCall("Alexandr",1443773);
        System.out.println(ph1);
    }
}
