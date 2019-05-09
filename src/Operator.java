import java.util.ArrayList;

public class Operator extends Human {

    private ArrayList<Driver> drivers = new ArrayList<>();


    public Operator(String name, String phone) {
        super(name, phone);
    }

    public void addDriver(Driver driver){
        drivers.add(driver);
    }


    public Driver setOrder(){
       for (Driver driver:drivers){
           if (driver.isFree()){
               System.out.println(driver.isFree());
               driver.setFree(false);
               return driver;
           }
        }
       return null;
    }


}
