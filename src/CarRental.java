public class CarRental extends Vehicle implements SecureRental {
    private final String renterName;

    public CarRental(String id, String model, String renterName) {
        super(id, model);
        this.renterName = renterName;
    }

    public String getRenterName() {
        return renterName;
    }

    @Override
    public void printReceipt() {
        System.out.println("Model: " + getModel());
        System.out.println("Icareci adi: " + getRenterName());
    }

    public void processRental() {
        System.out.println("Rental is  secure");
    }

}
