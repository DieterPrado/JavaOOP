public class Doctor {
    static int id = 0;
    String name;
    String speciality;

    Doctor(){
        System.out.println("Construyendo el objeto doctor");
        id++;
    }

    Doctor(String name){
        System.out.println("El nombre del doctor es: " + name);
    }

    //comportamientos
    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.printf("ID del doctor: " +  id);
    }
}
