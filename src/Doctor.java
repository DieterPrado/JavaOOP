public class Doctor {
    static int id = 0;
    String name;
    String speciality;

    Doctor(){
        System.out.println("Construyendo el objeto doctor");

    }

    Doctor(String name, String speciality){
        id++;
        System.out.println();
        this.name = name;
        this.speciality = speciality;
    }

    //comportamientos
    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.printf("ID del doctor: " +  id);
    }
}
