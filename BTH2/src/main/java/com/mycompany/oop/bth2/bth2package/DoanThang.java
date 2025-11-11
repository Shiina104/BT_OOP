/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop.bth2.bth2package;

/**
 *
 * @author admin
 */
public class DoanThang {
    private Diem a, b;

    public DoanThang(Diem a, Diem b) {
        this.a = a;
        this.b = b;
    }

    public void hienThi() {
        System.out.println("[(" + this.a.getX() + ", " + this.a.getY() +"), (" + this.b.getX() + ", " + this.b.getY() +")]");
    }
    
    public double doDai() {
        return this.a.khoangCach(this.b);
    }
    
    public Diem trungDiem() {
        // xu ly
        
        Diem td = new Diem(0, 0);
        return td;
    }
    
    public boolean checkSongSong(DoanThang dt) {
        double d1 = (this.a.getX() - this.b.getX()) / (this.a.getY() - this.b.getY());
        double d2 = (dt.a.getX() - dt.b.getX()) / (dt.a.getY() - dt.b.getY());
        return d1 == d2;
    }
    
    /**
     * @return the a
     */
    public Diem getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(Diem a) {
        this.a = a;
    }

    /**
     * @return the b
     */
    public Diem getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(Diem b) {
        this.b = b;
    }
    
    
}
