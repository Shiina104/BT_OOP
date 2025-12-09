/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop.bth3;

/**
 *
 * @author admin
 */
public class NhanVien {
    static final int LUONG = 100000;
    static int so = 0;

    String maNV;
    private String CMND;
    private String hoTen;
    private String queQuan;
    private int gioiTinh; //0 nam, 1 nu
    private String sdt;

    public NhanVien(String CMND, String hoTen, String queQuan, int gioiTinh, String sdt) {
        this.maNV = "NV" + String.format("%04d", ++so);
        this.CMND = CMND;
        this.hoTen = hoTen;
        this.queQuan = queQuan;
        this.gioiTinh = gioiTinh;
        this.sdt = sdt;
    }

    public double tinhLuong(int soNgayCong) {
        return LUONG * soNgayCong;
    }

    @Override
    public String toString() {
        return String.format("Ho ten: %s\nCMND: %s\nGioi tinh: %s\nQue quan: %s\nSDT: %s", this.hoTen, this.CMND, this.gioiTinh == 0 ? "Nam" : "Nu", this.queQuan, this.sdt);
    }
    
    
    
    /**
     * @return the maNV
     */
    public String getMaNV() {
        return maNV;
    }

    /**
     * @param maNV the maNV to set
     */
    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    /**
     * @return the CMND
     */
    public String getCMND() {
        return CMND;
    }

    /**
     * @param CMND the CMND to set
     */
    public void setCMND(String CMND) {
        this.CMND = CMND;
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
     * @return the queQuan
     */
    public String getQueQuan() {
        return queQuan;
    }

    /**
     * @param queQuan the queQuan to set
     */
    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    /**
     * @return the gioiTinh
     */
    public int getGioiTinh() {
        return gioiTinh;
    }

    /**
     * @param gioiTinh the gioiTinh to set
     */
    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    /**
     * @return the sdt
     */
    public String getSdt() {
        return sdt;
    }

    /**
     * @param sdt the sdt to set
     */
    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    
    
}
