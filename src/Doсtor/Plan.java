package Doсtor;

public class Plan extends Clinic {
    int code;

    Plan(int code) {
        this.code = code;
    }

    void treatsPlan() {
        if (code == 1) {
            System.out.println("Dentist будет вырывать зубы");
        } else if (code == 2) {
            System.out.println("Surgeon будет резать");
        } else {
            System.out.println("Therapist первый раз такое видит, но как-то будет лечить");
        }
    }
}

