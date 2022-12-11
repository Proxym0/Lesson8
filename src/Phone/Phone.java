package Phone;

public class Phone {
    private int number;
    private String model;
    private int weight;


    public int getNumber() {
        return number;
    }

    public Phone(int number, String model, int weight) {
        this(number,model);
        this.weight = weight;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
void receiveCall(String name){


}
    void receiveCall(String name,int number){
        System.out.println( "Звонит " +name+getNumber());

    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}