public class Driver extends Human {

    private boolean isFree = true;

    public Driver(String name, String phone) {
        super(name, phone);
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean status){
        this.isFree = status;
    }
}
