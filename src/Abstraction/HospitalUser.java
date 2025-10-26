package Abstraction;

public abstract class HospitalUser {
    private String name;
    private String email;

    public HospitalUser(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Abstract method (no implementation)
    abstract void showDashboard();

    // Common method (shared by all)
    public void viewProfile() {
        System.out.println("Name: " + name + ", Email: " + email);
    }
}
