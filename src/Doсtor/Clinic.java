package Doсtor;

public class Clinic {
    Surgeon surgeon;
    Therapist therapist;
    Dentist dentist;
    Patient patient;
    Plan plan;

    public Clinic() {
    }

    public Clinic(Surgeon surgeon, Therapist therapist, Dentist dentist, Patient patient, Plan plan) {
        this.surgeon = surgeon;
        this.therapist = therapist;
        this.dentist = dentist;
        this.patient = patient;
        this.plan = plan;
    }

}
