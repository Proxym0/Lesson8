package Phone;

public class main {
    public static void main(String[] args) {
        Phone ph1=new Phone();
        Phone ph2=new Phone(1234455,"apple");
        Phone ph3=new Phone(3215544,"HONOR",320);
        ph1.sendMessage(1234455,1234455);
        ph2.sendMessage(4567788);
        ph1.receiveCall("Alexandr");
        ph1.getNumber();
        ph1.receiveCall("Alexandr",1443773);
        System.out.println(ph1);
        System.out.println(ph2);
        System.out.println(ph3);    }
}
