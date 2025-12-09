/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop.bth3.bai06;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class QLCD {
    private ArrayList<CongDan> dsCongDan;

    public QLCD(String path) {
        this.dsCongDan = new ArrayList<>();
        
        try {
            File f = new File(path); //"SV-HS-CD.txt"
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                
                if (line.startsWith("//")) continue;
                
                String[] info = line.trim().split(",");
                CongDan cd;
                if (info.length == 7) {
                    cd = new SinhVien(info[1] +" "+ info[2], info[0], info[3], info[5], info[4], info[6]);
                }
                else {
                    if (isScore(info[2]) && isScore(info[3]) && isScore(info[4])) {
                        cd = new HocSinh(info[0], info[1], "", "", Double.parseDouble(info[2]), Double.parseDouble(info[3]), Double.parseDouble(info[4]), info[5]);
                    } else {
                        cd = new CongDan(info[1] +" "+ info[2], info[0], info[3], info[4], info[5]);
                    }
                }
                
                dsCongDan.add(cd);
            }
        } catch(IOException ex) {
            System.err.println(ex.getMessage());
        }
    }
    
    private static boolean isScore(String s) {
        try {
            double score = Double.parseDouble(s.trim());
            return score >= 0 && score <= 10;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    @Override
    public String toString() {
        String s = "";
        for (CongDan cd : dsCongDan) {
            s += cd;
            s += "\n";
        }
        return s;
    }

    public void xuatTheoLoai(int loai) {
        switch (loai) {
            case 1 -> dsCongDan.stream().filter(cd -> cd instanceof CongDan).forEach(cd -> System.out.println(cd));
            case 2 -> dsCongDan.stream().filter(cd -> cd instanceof SinhVien).forEach(cd -> System.out.println(cd));
            case 3 -> dsCongDan.stream().filter(cd -> cd instanceof HocSinh).forEach(cd -> System.out.println(cd));
        }
    }
    
    public void xuatTheoTen(char c) {
        dsCongDan.stream().filter(cd -> {
            String [] words = cd.getHoTen().split(" ");
            String ten = words[words.length - 1];
            return Character.toLowerCase(ten.charAt(0)) == Character.toLowerCase(c);
        })
                .forEach(cd -> System.out.println(cd));
    }
    
    /**
     * @return the dsCongDan
     */
    public ArrayList<CongDan> getDsCongDan() {
        return dsCongDan;
    }

    /**
     * @param dsCongDan the dsCongDan to set
     */
    public void setDsCongDan(ArrayList<CongDan> dsCongDan) {
        this.dsCongDan = dsCongDan;
    }
    
}
