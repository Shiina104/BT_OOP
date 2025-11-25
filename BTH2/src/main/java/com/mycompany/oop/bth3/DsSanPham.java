/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop.bth3;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 *
 * @author admin
 */
public class DsSanPham {
    private ArrayList<SanPham> ds;

    public DsSanPham() {
        this.ds = new ArrayList<>();
    }

    public DsSanPham(ArrayList<SanPham> ds) {
        this.ds = ds;
    }

    public void themSP(SanPham sp) {
        this.ds.add(sp);
    }
    
    public void xoaSP(SanPham sp) {
        this.ds.remove(sp);
    }
    
    public void hienThi() {
        this.ds.stream().forEach(sp -> System.out.println(sp));
    }
    
    public ArrayList<SanPham> timKiemTheoTen(String ten) {
        return this.ds.stream().filter(sp -> sp.getTenSP().contains(ten)).collect(Collectors.toCollection(ArrayList::new)); 
    }
    
    public ArrayList<SanPham> timKiemTheoMoTa(String moTa) {
        return this.ds.stream().filter(sp -> sp.getMoTa().contains(moTa)).collect(Collectors.toCollection(ArrayList::new)); 
    }
    
    public ArrayList<SanPham> timKiemTheoGia(double min, double max) {
        return this.ds.stream().filter(sp -> sp.getGiaBan() >= min && sp.getGiaBan() <= max).collect(Collectors.toCollection(ArrayList::new)); 
    }
    
    /**
     * @return the ds
     */
    public ArrayList<SanPham> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(ArrayList<SanPham> ds) {
        this.ds = ds;
    }
    
    
}
