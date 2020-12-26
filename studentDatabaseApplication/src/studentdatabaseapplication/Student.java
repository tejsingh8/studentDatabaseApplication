/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdatabaseapplication;

import java.util.Scanner;

/**
 *
 * @author 15865
 */
public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private double tuitionBalance = 0;
    private static int costOfCourse = 600; //true for all the members of the Student class
    private static int id = 1000; //true for all the members of the Student class

    // Constructor: prompt user to enter student's name and year
    public Student() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstName = input.nextLine();

        System.out.print("Enter student last name:");
        this.lastName = input.nextLine();

        System.out.println("1 - Freshmen"
                + "\n2 - Sophomore"
                + "\n3 - Junior"
                + "\n4 - Senior"
                + "Enter student class standing: ");
        this.gradeYear = input.nextInt();

        setStudentID();
    }

    // Generate an ID
    private void setStudentID() {
        // Grade Level + ID
        id++;
        this.studentID = gradeYear + "" + id;
    }

    // Enroll in courses
    public void enroll() {
        // Get inside a loop, user hits 0
        do {
            System.out.print("Enter course to enroll (Q to quit):");
            Scanner input = new Scanner(System.in);
            String course = input.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n     " + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            } else {
                break;
            }
        } while (1 != 0);

    

    }
    // View balance  
    public void viewBalance() {
        System.out.println("Your balance is : $" + tuitionBalance);
    }
    // Pay tuition
    public void payTuition() {
        viewBalance();
        System.out.print("Enter your payment: $");
        Scanner input = new Scanner(System.in);
        int payment = input.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }
    // Show status
    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName + 
                "\nStanding: " + gradeYear + 
                "\nStudent ID: " + studentID +
                "\nCourses Enrolled: " + courses + 
                "\nBalance: $" + tuitionBalance;
    }
}
