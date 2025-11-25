/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop.bth3;

/**
 *
 * @author admin
 */
public class SanPham {
    private static int count = 0;
    private String maSP;
    private String tenSP;
    private String moTa;
    private String NSX;
    private double giaBan;

    
    public SanPham(String tenSP, String moTa, String NSX, double giaBan) {
        this.maSP = "sp" + String.valueOf(++count);
        this.tenSP = tenSP;
        this.moTa = moTa;
        this.NSX = NSX;
        this.giaBan = giaBan;
    }

    @Override
    public String toString() {
        return String.format("Ma SP: %s\nTen SP: %s\nMo ta: %s\nNha SX: %s\nGia ban: %.1f", this.maSP, this.tenSP, this.moTa, this.NSX, this.giaBan);
    }

    
    
    /**
     * @return the maSP
     */
    public String getMaSP() {
        return maSP;
    }

    /**
     * @param maSP the maSP to set
     */
    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    /**
     * @return the tenSP
     */
    public String getTenSP() {
        return tenSP;
    }

    /**
     * @param tenSP the tenSP to set
     */
    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    /**
     * @return the moTa
     */
    public String getMoTa() {
        return moTa;
    }

    /**
     * @param moTa the moTa to set
     */
    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    /**
     * @return the NSX
     */
    public String getNSX() {
        return NSX;
    }

    /**
     * @param NSX the NSX to set
     */
    public void setNSX(String NSX) {
        this.NSX = NSX;
    }

    /**
     * @return the giaBan
     */
    public double getGiaBan() {
        return giaBan;
    }

    /**
     * @param giaBan the giaBan to set
     */
    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }
    
    
}
