/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gradestatistics;

/**
 *
 * @author Gatack
 */
public class Main {
    /*
    Write a program that reads integers representing course point totals from the user. Numbers between [0-100] are acceptable and the number -1 ends the reading of input. Other numbers are erroneous input, which should be ignored. When the user enters the number -1, the program should print the average of the point totals that were input.
    */
    public static void main(String[] args) {
        Point points = new Point();
    
        points.addPoints(10);
        points.addPoints(20);
        points.addPoints(30);
        
        points.printPoints();
        
        Grade grade = new Grade(points);
        
        System.out.println("avg: " + grade.average());
    }
}
