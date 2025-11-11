/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop.bth2.bth2package;

/**
 *
 * @author admin
 */

public class HinhChuNhat {
    private int dai, rong;

    public HinhChuNhat() {
        this.dai = 1;
        this.rong = 0;
    }

    public HinhChuNhat(int a, int b) {
        this.dai = a;
        this.rong = b;
    }

    public int chuVi() {
        return 2 * (this.dai + this.rong);
    }
    
    public int dienTich() {
        return this.dai * this.rong;
    }
    
    /**
     * @return the dai
     */
    public int getDai() {
        return dai;
    }

    /**
     * @param dai the dai to set
     */
    public void setDai(int dai) {
        this.dai = dai;
    }

    /**
     * @return the rong
     */
    public int getRong() {
        return rong;
    }

    /**
     * @param rong the rong to set
     */
    public void setRong(int rong) {
        this.rong = rong;
    }
    
}