/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop.bth2.bth2package;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class DsPhanSo {
    private ArrayList<PhanSo> ds;

    public DsPhanSo() {
    }
    
    public void themPS(PhanSo ps) {
        this.getDs().add(ps);
    }
    
    public void xoaPS(PhanSo ps) {
        this.getDs().remove(ps);
    }

    public PhanSo tongDanhSach() {
        PhanSo ps = new PhanSo();
        for(PhanSo p : this.ds) {
            ps = ps.congPS(p);
        }
        ps.rutGon();
        return ps;
    }
    
    public void sapXep() {
        this.ds.sort((p1, p2) -> p1.soSanh(p2));
    }
    
    public void hienThiDs() {
        this.ds.forEach(p -> p.hienThi());
    }
    
    /**
     * @return the ds
     */
    public ArrayList<PhanSo> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(ArrayList<PhanSo> ds) {
        this.ds = ds;
    }
    
}
