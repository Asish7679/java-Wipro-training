package Healthcare;

public class Cardio extends Doctor {
    public Cardio(String name) {
        super(name, "Cardiologist");
    }

    public void diagnose(Patient p) {
        System.out.println(name + " (" + specialization + ") is diagnosing patient: " + p.getName());
        if (p.getIllness().toLowerCase().contains("heart")) {
            System.out.println("Specialized treatment for heart-related issue: " + p.getIllness());
        } else {
            System.out.println("Redirecting to general physician. Not a heart-related illness.");
        }
    }
}

