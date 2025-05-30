public class Main {

    public static void main(String[] args) {

        Car car = new Car(5);

        car.start();
        System.out.println("Liczba miejsce: " + car.getNumberOfSeats());
        car.stop();
    }

}
