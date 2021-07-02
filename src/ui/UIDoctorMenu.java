package ui;

import model.Doctor;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class UIDoctorMenu {
    public static ArrayList<Doctor> doctorsAvailableAppointments = new ArrayList<>();

    public static void showDoctorMenu(){
        int response = 0;
        do {
            System.out.println();
            System.out.println("Doctor");
            System.out.println("Welcome " + UIMenu.doctorLogged.getName());
            System.out.println("1. Add Available Appointment");
            System.out.println("2. My Shedule Appointment");
            System.out.println("0. Logout");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    showAddAvailableAppointmentsMenu();
                    break;
                case 2:
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
            }

        }while (response != 0);
    }

    private static void showAddAvailableAppointmentsMenu(){
        int response = 0;
        do {
            System.out.println();
            System.out.println("::Add Available Appointment");
            System.out.printf(":: Select a month");

            for (int i = 0; i < 3; i++) {
                int j = i + 1;
                System.out.println(j + ". " + UIMenu.MONTHS[i]);
            }
            System.out.println("0. Return");
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            if (response > 0 && response < 4){
                int monthSelected = response;
                System.out.println(monthSelected + " . " + UIMenu.MONTHS[monthSelected-1]);
                System.out.println("Insert the date available: [dd/mm/yyyy]");
                String date = sc.nextLine();

                System.out.println("Your date is: " + date + "1. Correct 2. Change date");
                int responseDate = Integer.valueOf(sc.nextLine());
                if (responseDate == 2) continue;

                int responseTime = 0;
                String time = "";
                do{
                    System.out.println("Insert the tine available for date: " + date + "[10:00]");
                    time = sc.nextLine();
                    System.out.println("Your time is: " + time + "1. Correct" + "2 . Change Date");
                    responseTime = Integer.valueOf(sc.nextLine());

                }while (responseTime == 2);

                UIMenu.doctorLogged.addAvailableAppointment(date, time);
                checkDoctorAvailableAppointmets(UIMenu.doctorLogged);
            }else if(response == 0){
                showDoctorMenu();
            }
        }while (response != 0);
    }

    private static void checkDoctorAvailableAppointmets(Doctor doctor){
        if (doctor.getAvailableAppointments().size()>0 && !doctorsAvailableAppointments.contains(doctor)) {
            doctorsAvailableAppointments.add(doctor);
        }
    }
}
