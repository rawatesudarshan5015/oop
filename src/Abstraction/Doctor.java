package Abstraction;
import Abstraction.HospitalUser;

class Doctor extends HospitalUser {
    public Doctor(String name, String email) {
        super(name, email);
    }

    @Override
    void showDashboard() {
        System.out.println("Doctor Dashboard: View appointments, patient history, and prescriptions.");
    }
}