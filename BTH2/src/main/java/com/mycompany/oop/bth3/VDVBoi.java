/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop.bth3;

/**
 *
 * @author admin
 */
public class VDVBoi extends VanDongVien{
    private String moSoTruong;
    private String CLB;

    public VDVBoi(String hoTen, String monThiDau, String moSoTruong, String CLB) {
        super(hoTen, monThiDau);
        this.moSoTruong = moSoTruong;
        this.CLB = CLB;
    }
    
    

    /**
     * @return the moSoTruong
     */
    public String getMoSoTruong() {
        return moSoTruong;
    }

    /**
     * @param moSoTruong the moSoTruong to set
     */
    public void setMoSoTruong(String moSoTruong) {
        this.moSoTruong = moSoTruong;
    }

    /**
     * @return the CLB
     */
    public String getCLB() {
        return CLB;
    }

    /**
     * @param CLB the CLB to set
     */
    public void setCLB(String CLB) {
        this.CLB = CLB;
    }
    
    
}
