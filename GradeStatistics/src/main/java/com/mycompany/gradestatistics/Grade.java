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
public class Grade {
    private Point pointlist;
    
    public Grade(Point pointlist) {
        this.pointlist = pointlist;
    }
    
    //average function
    public int average() {
        int sum = 0;
        
        for (int i = 0; i < pointlist.points.size(); i++) {
            sum += pointlist.points.get(i);
        }
        int average = sum / pointlist.points.size();
        
        return average;
    }
}
