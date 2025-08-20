
public class Main {
    public static void main(String[] args) {
        Vehicle rental = new CarRental("1", "bmw", "Ayxan");
        printOperations(rental);
        Vehicle rental1 = new BikeRental("2", "yamaha", "Fateh");
        printOperations(rental1);

    }

    public static void printOperations(Vehicle rental) {
        rental.printReceipt();
        rental.processRental();
        System.out.println("-------------------------");
    }

}