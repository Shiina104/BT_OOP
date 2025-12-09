/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop.bth4.ontap;

/**
 *
 * @author admin
 */
public class SanPham {
    static int so = 0;
    
    private String maSP;
    private String tenSP;
    private String ngayNhapKho;
    private double donGia;
    private int soLuongTonKho;

    public SanPham(String tenSP, String ngayNhapKho, double donGia, int soLuongTonKho) {
        this.maSP = taoMaSP(++so);
        this.tenSP = tenSP;
        this.ngayNhapKho = ngayNhapKho;
        this.donGia = donGia;
        this.soLuongTonKho = soLuongTonKho;
    }

    public static String taoMaSP(int soThuTu) {
    if (soThuTu > 9999) {
        System.err.println("Lỗi: Số lượng sản phẩm vượt quá 9999!");
        System.exit(0);
    }

    return String.format("SP-%04d", soThuTu);
}
    
    /**
     * @return the maSP
     */
    public String getMaSP() {
        return maSP;
    }

    /**
     * @param maSP the maSP to set
     */
    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    /**
     * @return the tenSP
     */
    public String getTenSP() {
        return tenSP;
    }

    /**
     * @param tenSP the tenSP to set
     */
    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    /**
     * @return the ngayNhapKho
     */
    public String getNgayNhapKho() {
        return ngayNhapKho;
    }

    /**
     * @param ngayNhapKho the ngayNhapKho to set
     */
    public void setNgayNhapKho(String ngayNhapKho) {
        this.ngayNhapKho = ngayNhapKho;
    }

    /**
     * @return the donGia
     */
    public double getDonGia() {
        return donGia;
    }

    /**
     * @param donGia the donGia to set
     */
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    /**
     * @return the soLuongTonKho
     */
    public int getSoLuongTonKho() {
        return soLuongTonKho;
    }

    /**
     * @param soLuongTonKho the soLuongTonKho to set
     */
    public void setSoLuongTonKho(int soLuongTonKho) {
        this.soLuongTonKho = soLuongTonKho;
    }
    
    
}
