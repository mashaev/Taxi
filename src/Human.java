public class Human {
     String name;
    private String phone;

    public Human(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public Human(){

    }
    public Human(String name){
        this.name = name;
    }

    public void call(String phone){
        System.out.println(this.name  + " call for number " + phone);
    }



    public void ask(String text){
        System.out.println(text);
    }

    public void speak(String text){
        System.out.println(text);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
