import static ui.UIMenu.*;

import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //showMenu();
        Doctor myDoctor = new Doctor("Dieter Prado", "Pediatria");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);


    }

}
