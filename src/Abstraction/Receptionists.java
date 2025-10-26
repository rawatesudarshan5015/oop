package Abstraction;

class Receptionists extends HospitalUser {
    public Receptionists(String name, String email) {
        super(name, email);
    }

    @Override
    void showDashboard() {
        System.out.println("Receptionist Dashboard: Manage appointments and patient check-ins.");
    }
}