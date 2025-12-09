/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop.bth3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class QLVDV {
    private ArrayList<VanDongVien> ds;

    public QLVDV(String path) {
        ds = new ArrayList<>();
        try {
            File f = new File(path);
            Scanner sc = new Scanner(f);
            sc.nextLine();
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] info = line.trim().split(",");
                switch (info.length) {
                    case 2:
                        VanDongVien v = new VanDongVien(info[0], info[1]);
                        this.ds.add(v);
                        break;
                    case 3:
//                        VanDongVien v = new VDVBoi(info[0], path, line, line);
                    default:
                        throw new AssertionError();
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    
}
