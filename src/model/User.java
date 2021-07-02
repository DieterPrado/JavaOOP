package model;

public abstract class User {
    private int id;
    private String name;
    private String address;
    private String phoneNumber;
    private String email;

    public User(String name, String email){
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
            if (phoneNumber.length() != 8){
                System.out.println("El número telefónico debe de tener 8 digitos");
            }else{
                this.phoneNumber = phoneNumber;
            }
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "model.User: " + name + ", Email: " + email+ "Address" + address;
    }
    public abstract void showDataUser();
}
