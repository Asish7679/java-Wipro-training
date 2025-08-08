package Healthcare;

public class General extends Doctor {
    public General(String name) {
        super(name, "General Physician");
    }

    public void diagnose(Patient p) {
        System.out.println(name + "  " + specialization + " is diagnosing patient: " + p.getName());
        System.out.println("General checkup for illness: " + p.getIllness());
    }
}
