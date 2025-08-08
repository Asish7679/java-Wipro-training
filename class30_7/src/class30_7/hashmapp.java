package class30_7;

class Patients {
    private int id;
    private String name;
    private String disease;

    public Patients(int id, String name, String disease) {
        this.id = id;
        this.name = name;
        this.disease = disease;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDisease() {
        return disease;
    }

    public String toString() {
        return "[ID: " + id + ", Name: " + name + ", Disease: " + disease + "]";
    }
}

