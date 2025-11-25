/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop.bth3;

/**
 *
 * @author admin
 */
public class VanDongVien {
    private String hoTen;
    private String monThiDau;

    public VanDongVien(String hoTen, String monThiDau) {
        this.hoTen = hoTen;
        this.monThiDau = monThiDau;
    }

    
    
    /**
     * @return the hoTen
     */
    public String getHoTen() {
        return hoTen;
    }

    /**
     * @param hoTen the hoTen to set
     */
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    /**
     * @return the monThiDau
     */
    public String getMonThiDau() {
        return monThiDau;
    }

    /**
     * @param monThiDau the monThiDau to set
     */
    public void setMonThiDau(String monThiDau) {
        this.monThiDau = monThiDau;
    }
    
    
}
