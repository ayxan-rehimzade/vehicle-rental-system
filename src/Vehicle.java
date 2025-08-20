public abstract class Vehicle {
    private String id;
    private String model;

    public abstract void printReceipt();

    public abstract void processRental();

    public Vehicle() {
    }

    public Vehicle(String id, String model) {
        if (id.length() == 1 && model.length() < 12 && model.matches("[a-z]+")) {
            this.id = id;
            this.model = model;
        } else {
            throw new RuntimeException("Melumatlar sehv daxil edilib");
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
