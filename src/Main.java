import static ui.UIMenu.*;

import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //showMenu();
        Doctor myDoctor = new Doctor("Dieter Prado", "Pediatria");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);

        Patient patient = new Patient("Alejandra", "alejandra@mail.com");
        System.out.println(patient.name);
        System.out.println(patient.email);
        patient.weight = 60.5;
        patient.height = 1.65;
        System.out.println(patient.weight);
        System.out.println(patient.height);




    }

}
