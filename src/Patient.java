public class Patient {
    int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    Patient(String name, String email){
        this.name = name;
        this.email = email;
        this.weight = 54.5;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public String getWeight(){
        return this.weight + " Kg.";
    }

    public void setHeight(double height){
        this.height = height;
    }

    public String getHeight(){
        return this.height + " Mts.";
    }

    public void setPhoneNumber(String phoneNumber){
        if (phoneNumber.length() != 8){
            System.out.println("El número telefónico debe de tener 8 digitos");
        }else{
            this.phoneNumber = phoneNumber;
        }
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }
}
