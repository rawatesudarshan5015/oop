package Abstraction;

public class Main {
    public static void main(String[] args) {
        HospitalUser r = new Receptionists("Neha", "neha@hospital.com");
        HospitalUser d = new Doctor("Dr. Sudarshan", "sudarshan@hospital.com");

        d.viewProfile();
        d.showDashboard();

        r.viewProfile();
        r.showDashboard();
    }
}