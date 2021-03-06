/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gradestatistics;
import java.util.Collections;
import java.lang.Math;
import java.util.Arrays;
import java.lang.Object;

/**
 *
 * @author Gatack
 */
public class Grade {
    private Point pointlist;
    
    public Grade(Point pointlist) {
        this.pointlist = pointlist;
    }
    
    //these seem more related to the Point object
    public float evaluateSum() {
        float fullSum = 0;
        
        for (int i = 0; i < pointlist.points.size(); i++) {
            fullSum += pointlist.points.get(i);
        }
        
        return fullSum;
    }
    
    public float evaluatePassingSum() {
        float passSum = 0;
        
            for (int i = 0; i < pointlist.points.size(); i++) {
            if (pointlist.points.get(i) >= 50) {
                passSum += pointlist.points.get(i);
            }
        }
            return passSum;
    }
    
    public float evaluatePassingSize() {
            float passSize = 0;
        
            for (int i = 0; i < pointlist.points.size(); i++) {
            if (pointlist.points.get(i) >= 50) {
                passSize++;
            }
        }
            return passSize;
    }
    
    //average function
    public float average() {
        float sum = evaluateSum();
        
        if (pointlist.points.size() == 0) {
            return 0;
        } else {
            return sum / pointlist.points.size();
        }   
    }
    
    public void passAverage() {
        float sum = evaluatePassingSum();
        float passSize = evaluatePassingSize();
        
        if (passSize == 0) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + (sum / passSize));
        }
    }
    
    public void passPercentage() {
        float passSize = evaluatePassingSize();
        float totalSize = pointlist.points.size();
        float total = ((passSize / totalSize) * 100);
        
        System.out.println("Pass Percentage: " + total);
    }
    
    public void gradeDist() {
        int[] dist = {0,0,0,0,0,0};
        Collections.sort(pointlist.points);
        
        for (int point : pointlist.points) {
            int round = (point-50) / 10 + (((point-50) % 10 == 0) ? 0 : 1); 
            
            if ((int) round <= 0) {
                dist[0]++;
            } else {
                dist[(int) round]++;
            }
        }
            
            System.out.println("Grade distribution: ");
            for (int i = dist.length - 1; i >= 0; i--) {          
                System.out.println(i + ": " + String.join("", Collections.nCopies(dist[i], "*")));
            }
  
    }
}
