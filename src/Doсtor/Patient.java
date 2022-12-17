package Doсtor;

public class Patient{
    Plan plan;
    public Patient(Plan plan) {
        this.plan=plan;
    }
    public Doctor treatsPlan() {
        if (plan.getCode() == 1) {
            return new Surgeon();
        } else if (plan.getCode() == 2) {
            return new Dentist();
        } else  {
            return new Therapist();
        }

    }
}



