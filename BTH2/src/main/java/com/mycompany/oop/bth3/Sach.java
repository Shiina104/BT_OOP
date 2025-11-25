/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop.bth3;

/**
 *
 * @author admin
 */
public class Sach extends SanPham{
    private int soTrang;
    
    public Sach(String tenSP, String moTa, String NSX, double giaBan, int soTrang) {
        super(tenSP, moTa, NSX, giaBan);
        this.soTrang = soTrang;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSo trang: " + this.soTrang;
    }

    

    /**
     * @return the soTrang
     */
    public int getSoTrang() {
        return soTrang;
    }

    /**
     * @param soTrang the soTrang to set
     */
    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }
    
}
