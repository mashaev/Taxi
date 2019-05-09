public class Main {

    public static void main(String[] args) {


          Passenger passenger = new Passenger("Aidana","9967003232323");

          Driver driver1 = passenger.callTaxi();
          passenger.call(driver1.getPhone());

        System.out.println(driver1.isFree());
    }
}
