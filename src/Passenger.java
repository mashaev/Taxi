import java.util.ArrayList;

public class Passenger extends Human {

    private ArrayList<Operator> taxi = new ArrayList<>();

    public Passenger(String name, String phone) {
        super(name, phone);
        setOperators();
    }

    private void setOperators(){
        Operator smsTaxi = new Operator("SmsTaxi","1236");
        Operator namba = new Operator("Namba","123");
        Driver driver = new Driver("Nurs","9974343434");
        namba.addDriver(driver);
        taxi.add(smsTaxi);
        taxi.add(namba);

    }

   public Driver callTaxi(){
        for (Operator operator:taxi){
            call(operator.getPhone());
            Driver driver = operator.setOrder();
            if (driver !=null){
                return driver;
            }
        }
        return null;
   }

    @Override
    public String getPhone() {
       return super.getPhone();
        //return "99700455454";
    }
}
