/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop.bth3;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class DsNhanVien {
    private ArrayList<NhanVien> ds;

    public DsNhanVien() {
        ds = new ArrayList<>();
    }

    public void themNV(NhanVien nv) {
        this.ds.add(nv);
    }
    
    public void xoaNV(NhanVien nv) {
        this.ds.remove(nv);
    }

    public void hienThi() {
        this.ds.stream().forEach(n -> System.out.println(n));
    }
    
    public NhanVien traCuuTheoCMND(String CMND) {
        return this.ds.stream().filter(nv -> nv.getCMND().equalsIgnoreCase(CMND)).findFirst().orElse(null);
    }
    
    public NhanVien traCuuTheoHoTen(String hoTen) {
        return this.ds.stream().filter(nv -> nv.getHoTen().equalsIgnoreCase(hoTen)).findFirst().orElse(null);
    }
    
    public NhanVien traCuuTheoQueQuan(String queQuan) {
        return this.ds.stream().filter(nv -> nv.getQueQuan().equalsIgnoreCase(queQuan)).findFirst().orElse(null);
    }
    
    /**
     * @return the ds
     */
    public ArrayList<NhanVien> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(ArrayList<NhanVien> ds) {
        this.ds = ds;
    }
    
    
}
