/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop.bth2.bth2package;

/**
 *
 * @author admin
 */
public class Diem {
    private double x, y;

    public Diem(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void hienThi() {
        System.out.println("(" + this.x + ", " + this.y +")");
    }
    
    public double khoangCach(Diem d) {
        return Math.sqrt(Math.pow((this.x - d.x), 2) + Math.pow((this.y = d.y), 2));
    }
    
    /**
     * @return the x
     */
    public double getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public double getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(double y) {
        this.y = y;
    }
    
    
}
