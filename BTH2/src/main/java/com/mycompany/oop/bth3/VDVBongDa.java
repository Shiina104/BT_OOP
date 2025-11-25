/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop.bth3;

/**
 *
 * @author admin
 */
public class VDVBongDa extends VanDongVien{
    private String viTriDaBong;
    private int soAo;
    private String CLB;

    public VDVBongDa(String hoTen, String monThiDau, String viTriDaBong, int soAo, String CLB) {
        super(hoTen, monThiDau);
        this.viTriDaBong = viTriDaBong;
        this.soAo = soAo;
        this.CLB = CLB;
    }

    /**
     * @return the viTriDaBong
     */
    public String getViTriDaBong() {
        return viTriDaBong;
    }

    /**
     * @param viTriDaBong the viTriDaBong to set
     */
    public void setViTriDaBong(String viTriDaBong) {
        this.viTriDaBong = viTriDaBong;
    }

    /**
     * @return the soAo
     */
    public int getSoAo() {
        return soAo;
    }

    /**
     * @param soAo the soAo to set
     */
    public void setSoAo(int soAo) {
        this.soAo = soAo;
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
