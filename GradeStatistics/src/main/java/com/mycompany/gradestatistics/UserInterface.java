/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gradestatistics;
import java.util.Scanner;
/**
 *
 * @author Gatack
 */
public class UserInterface {
    public Point point;
    public Grade grade;
    public Scanner sc;
    //take point
    //take grade
    //constructor
    //start method
    
    public UserInterface(Point point) {
        Scanner sc = new Scanner(System.in);
        this.point = point;
        this.sc = sc;
        //this.grade = grade;
    }
    
    public void createGrade() {
        Grade grade = new Grade(point);
        this.grade = grade;
    }
    
    public void start() {
        
        boolean menu = true;
        createGrade();
        
        while (menu == true) {
            System.out.println("Enter point totals, -1 stops:");
            int total = sc.nextInt();
            
            if (total == -1) {
                float average = grade.average();
                System.out.println("Point average (all): " + average);
                grade.passAverage();
                grade.passPercentage();
                grade.gradeDist();
                menu = false;
            } else {
                point.addPoints(total);
            }
        }
    }
}
