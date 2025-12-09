/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop.bth3.bai06;

/**
 *
 * @author admin
 */
public class SinhVien extends CongDan{
    private String nganhHoc;
    private String truongDH;
    
    public SinhVien(String hoTen, String CCCD, String ngaySinh, String noiSinh, String nganhHoc, String truongDH) {
        super(hoTen, CCCD, ngaySinh, noiSinh, "Sinh vien");
        this.nganhHoc = nganhHoc;
        this.truongDH = truongDH;
    }

    @Override
    public String toString() {
        return String.format("Ho ten: %s\nMSSV: %s\nNgay sinh: %s\nNoi sinh: %s\nNganh hoc: %s\nTruong: %s\n",
                this.getHoTen(), this.getCCCD(), this.getNgaySinh(), this.getNoiSinh(), this.getNganhHoc(), this.getTruongDH());
    }

    /**
     * @return the nganhHoc
     */
    public String getNganhHoc() {
        return nganhHoc;
    }

    /**
     * @param nganhHoc the nganhHoc to set
     */
    public void setNganhHoc(String nganhHoc) {
        this.nganhHoc = nganhHoc;
    }

    /**
     * @return the truongDH
     */
    public String getTruongDH() {
        return truongDH;
    }

    /**
     * @param truongDH the truongDH to set
     */
    public void setTruongDH(String truongDH) {
        this.truongDH = truongDH;
    }
    
}
