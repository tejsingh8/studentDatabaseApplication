/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Scenario: You are a Database Administrator for a university and need to create an application to manage student enrollments and balance.
package studentdatabaseapplication;

import java.util.Scanner;

/**
 *
 * @author 15865
 */
public class StudentDatabaseApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Ask how many new users we want to add
        System.out.print("Enter number of new students to enroll: ");
        Scanner input = new Scanner(System.in);
        int numOfStudents = input.nextInt();
        Student studentArray[] = new Student[numOfStudents];
        
        // Create n number of new students
        for (int i = 0; i < numOfStudents; i++) {
            studentArray[i] = new Student();
            studentArray[i].enroll();
            studentArray[i].payTuition();
            System.out.println(studentArray[i].toString());
        }
    }

}
