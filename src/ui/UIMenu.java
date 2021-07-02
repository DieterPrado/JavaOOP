package ui;

import model.Doctor;
import model.Patient;

import javax.print.Doc;
import java.util.ArrayList;
import  java.util.Scanner;

public class UIMenu {
    public static final String[] MONTHS = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    public static Doctor doctorLogged;
    public static Patient patientLogged;

    public static void showPatientMenu(){


        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("model.Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("::Book an appointment");
                    for (int i = 0; i < 3; i++) {
                        System.out.println((i+1) + "." + MONTHS[i]);
                    }
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        }while (response != 0);
    }

    public static void showMenu(){
        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona la opción deseada");

        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("1. Doctor");
                    response = 0;
                    authUser(1);
                    break;
                case 2:
                    System.out.println("2 Patient");
                    response = 0;
                    authUser(2);
                    break;
                case 0:
                    System.out.println("Thanks for your visit");
                    break;
                default:
                    System.out.println("Please elect a correct answer");
            }
        }while (response != 0);
    }
    private static void authUser(int userType){
        //user type = 1 doctor, 2 = patient
        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Alejandro Martinez", "Alejandro@mil.com"));
        doctors.add(new Doctor("Karen Sosa", "kare@mil.com"));
        doctors.add(new Doctor("Rocio Gomez", "rocio@mil.com"));

        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Dieter Prado", "prado@mail.com"));
        patients.add(new Patient("Anahi Salgado", "ana@mail.com"));
        patients.add(new Patient("Roberto Rodriguez", "beto@mail.com"));

        boolean emailCorrect = false;
        do {
            System.out.println("Insert your email: ");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();
            if (userType == 1){
                for (Doctor doctor:doctors) {
                    if (doctor.getEmail().equals(email)){
                        emailCorrect = true;
                        doctorLogged = doctor;
                        UIDoctorMenu.showDoctorMenu();
                    }
                }
            }else if (userType == 2){
                for (Patient patient:patients) {
                    if (patient.getEmail().equals(email)){
                        emailCorrect = true;
                        patientLogged = patient;
                        UIPatientMenu.showPatientMenu();
                    }
                }
            }
        }while (!emailCorrect);

    }
}
