/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop.bth2.bth2package;

/**
 *
 * @author admin
 */
public class PhanSo {
    private int tu, mau;

    public PhanSo() {
        this.tu = 0;
        this.mau = 1;
    }

    public PhanSo(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }
    
    public static int UCLN(int a, int b) {
        if (b == 0)
            return a;
        if (b > a)
            return UCLN(b, a);
        return UCLN(b, a%b);
    }
    
    public void rutGon() {
        int uoc = PhanSo.UCLN(this.tu, this.mau);
        this.setTu(this.tu/uoc);
        this.setMau(this.mau/uoc);
    }
    
    public PhanSo congPS(PhanSo ps) {
        int t = this.tu * ps.mau + this.mau * ps.tu;
        int m = this.mau * ps.mau;
        PhanSo p = new PhanSo(t, m);
        p.rutGon();
        return p;
    }
    
    public PhanSo truPS(PhanSo ps) {
        int t = this.tu * ps.mau - this.mau * ps.tu;
        int m = this.mau * ps.mau;
        PhanSo p = new PhanSo(t, m);
        p.rutGon();
        return p;
    }
    
    public PhanSo nhanPS(PhanSo ps) {
        int t = this.tu * ps.tu;
        int m = this.mau * ps.mau;
        PhanSo p = new PhanSo(t, m);
        p.rutGon();
        return p;
    }
    
    public PhanSo chiaPS(PhanSo ps) {
        int t = this.tu * ps.mau;
        int m = this.mau * ps.tu;
        PhanSo p = new PhanSo(t, m);
        p.rutGon();
        return p;
    }
    
    public int soSanh(PhanSo ps) {
        // bang => 0; lon hon => 1; be hon => -1
        int thisTu = this.tu * ps.mau;
        int psTu = ps.tu * this.mau;
        if (thisTu == psTu) {
            return 0;
        }
        else if (thisTu > psTu) {
            return 1;
        }
        else
            return -1;
    }
    
    public void hienThi() {
        System.out.println(this.tu + "/" + this.mau);
    }

    /**
     * @return the tu
     */
    public int getTu() {
        return tu;
    }

    /**
     * @param tu the tu to set
     */
    public void setTu(int tu) {
        this.tu = tu;
    }

    /**
     * @return the mau
     */
    public int getMau() {
        return mau;
    }

    /**
     * @param mau the mau to set
     */
    public void setMau(int mau) {
        this.mau = mau;
    } 
}
