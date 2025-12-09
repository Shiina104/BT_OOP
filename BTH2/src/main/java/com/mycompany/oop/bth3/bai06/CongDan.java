/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop.bth3.bai06;

import java.util.Date;

/**
 *
 * @author admin
 */
public class CongDan {
    private String hoTen;
    private String CCCD;
    private String ngaySinh;
    private String noiSinh;
    private String ngheNghiep;

    public CongDan(String hoTen, String CCCD, String ngaySinh, String noiSinh, String ngheNghiep) {
        this.hoTen = hoTen;
        this.CCCD = CCCD;
        this.ngaySinh = ngaySinh;
        this.noiSinh = noiSinh;
        this.ngheNghiep = ngheNghiep;
    }
    
    public int tinhTuoi() {
        var d = new Date();
        int len = this.ngaySinh.length();
        int ns = Integer.parseInt(this.ngaySinh.substring(len-2));
        if (ns < d.getYear() - 100) ns += 100;
        return d.getYear() - ns;
    }

    @Override
    public String toString() {
        return String.format("Ho ten: %s\nCCCD: %s\nNgay sinh: %s\nNoi sinh: %s\nNghe nghiep: %s\n",
                this.getHoTen(), this.getCCCD(), this.getNgaySinh(), this.getNoiSinh(), this.getNgheNghiep());
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
     * @return the CCCD
     */
    public String getCCCD() {
        return CCCD;
    }

    /**
     * @param CCCD the CCCD to set
     */
    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }



    /**
     * @return the noiSinh
     */
    public String getNoiSinh() {
        return noiSinh;
    }

    /**
     * @param noiSinh the noiSinh to set
     */
    public void setNoiSinh(String noiSinh) {
        this.noiSinh = noiSinh;
    }

    /**
     * @return the ngheNghiep
     */
    public String getNgheNghiep() {
        return ngheNghiep;
    }

    /**
     * @param ngheNghiep the ngheNghiep to set
     */
    public void setNgheNghiep(String ngheNghiep) {
        this.ngheNghiep = ngheNghiep;
    }

    /**
     * @return the ngaySinh
     */
    public String getNgaySinh() {
        return ngaySinh;
    }

    /**
     * @param ngaySinh the ngaySinh to set
     */
    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    
    
}
