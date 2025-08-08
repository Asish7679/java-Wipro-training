package class28_7;

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

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getDisease() {
        return disease;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + "\nAge: " + age + "\nDisease: " + disease);
    }
}
