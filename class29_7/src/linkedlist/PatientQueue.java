package linkedlist;

class Patient {
    private String name;
    private int age;
    private String disease;

    public Patient(String name, int age, String disease) {
        this.name = name;
        this.age = age;
        this.disease = disease;
    }

    public String getName() {
        return name;
    }

    public String getDisease() {
        return disease;
    }

    public String getDoctor() {
        switch (disease.toLowerCase()) {
            case "fever":
                return "General Physician";
            case "bone pain":
                return "Orthopedic";
            case "toothache":
                return "Dentist";
            case "eye problem":
                return "Eye Specialist";
            default:
                return "No Specialist needed";
        }
    }

    public void displayDetails() {
        System.out.println("Patient Name: " + name +", Age: " + age +
                           ", Disease: " + disease);
    }
}
