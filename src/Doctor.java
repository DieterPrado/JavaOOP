public class Doctor {
    int id;
    String name;
    String speciality;

    Doctor(){
        System.out.println("Construyendo el objeto doctor");
    }

    //comportamientos
    public void showName(){
        System.out.println(name);
    }
}
