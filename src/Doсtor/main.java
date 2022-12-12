package Doсtor;

public class main  {
    public static void main(String[] args) {


        Plan pl1=new Plan(1);
        Plan pl2=new Plan(2);
        Plan pl3=new Plan(3);
        Patient pat1=new Patient(pl1);
        Patient pat2=new Patient(pl2);
        Patient pat3=new Patient(pl3);
        pl1.treatsPlan();
        pl2.treatsPlan();
        pl3.treatsPlan();
        System.out.println(pat1);
        System.out.println(pat2);
        System.out.println(pat3);


    }

    @Override
    public String toString() {
        return "main{}";
    }
}
