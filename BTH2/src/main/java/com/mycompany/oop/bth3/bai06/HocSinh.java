/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop.bth3.bai06;

/**
 *
 * @author admin
 */
public class HocSinh extends CongDan{
    private double diemVan;
    private double diemToan;
    private double diemNgoaiNgu;
    private String loaiHanhKiem;

    public HocSinh(String hoTen, String maSoHS, String ngaySinh, String noiSinh, double diemVan, double diemToan, double diemNgoaiNgu, String loaiHanhKiem) {
        super(hoTen, maSoHS, ngaySinh, noiSinh, "Hoc sinh");
        this.diemVan = diemVan;
        this.diemToan = diemToan;
        this.diemNgoaiNgu = diemNgoaiNgu;
        this.loaiHanhKiem = loaiHanhKiem;
    }

    @Override
    public String toString() {
        return String.format("Ho ten: %s\nMSHS: %s\nDiem van: %.1f\nDiem toan: %.1f\nDiem ngoai ngu: %.1f\nHanh kiem: %s\n",
                this.getHoTen(), this.getCCCD(), this.getDiemVan(), this.getDiemToan(), this.getDiemNgoaiNgu(), this.getLoaiHanhKiem());
    }
    
    /**
     * @return the diemVan
     */
    public double getDiemVan() {
        return diemVan;
    }

    /**
     * @param diemVan the diemVan to set
     */
    public void setDiemVan(double diemVan) {
        this.diemVan = diemVan;
    }

    /**
     * @return the diemToan
     */
    public double getDiemToan() {
        return diemToan;
    }

    /**
     * @param diemToan the diemToan to set
     */
    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    /**
     * @return the diemNgoaiNgu
     */
    public double getDiemNgoaiNgu() {
        return diemNgoaiNgu;
    }

    /**
     * @param diemNgoaiNgu the diemNgoaiNgu to set
     */
    public void setDiemNgoaiNgu(double diemNgoaiNgu) {
        this.diemNgoaiNgu = diemNgoaiNgu;
    }

    /**
     * @return the loaiHanhKiem
     */
    public String getLoaiHanhKiem() {
        return loaiHanhKiem;
    }

    /**
     * @param loaiHanhKiem the loaiHanhKiem to set
     */
    public void setLoaiHanhKiem(String loaiHanhKiem) {
        this.loaiHanhKiem = loaiHanhKiem;
    }
    
    
}
