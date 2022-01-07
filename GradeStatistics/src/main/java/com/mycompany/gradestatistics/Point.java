/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gradestatistics;
import java.util.ArrayList;

/**
 *
 * @author Gatack
 */
public class Point {
    public ArrayList<Integer> points;
    
    public Point() {
        this.points = new ArrayList<Integer>();
    }
    
    public ArrayList<Integer> getPoints() {
        return this.points;
    }
    
    //add number to point list
    public void addPoints(int score) {
        if (score >= 0 && score <= 100) {
            this.points.add(score);
        }
    }
    
    public void printPoints() {
        for (int i = 0; i < points.size(); i++) {
            System.out.println(points.get(i));
        }
    }
}
