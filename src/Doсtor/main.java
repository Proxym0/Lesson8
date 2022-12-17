package Doсtor;

public class main {
    public main() {
    }

    public static void main(String[] args) {

        Plan plan1=new Plan(1);
        Plan plan2=new Plan(2);
        Plan plan=new Plan(4);

        Patient patient1=new Patient(plan1);
        Patient patient2=new Patient(plan2);
        Patient patient=new Patient(plan);

        Doctor  doctor1=patient1.treatsPlan();
        Doctor  doctor2=patient2.treatsPlan();
        Doctor  doctor=patient.treatsPlan();

        doctor1.treats();
        doctor2.treats();
        doctor.treats();




    }
}


