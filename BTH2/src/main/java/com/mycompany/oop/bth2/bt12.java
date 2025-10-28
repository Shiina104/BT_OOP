/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop.bth2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class bt12 {
    public static void main(String[] args) {
        try {
            int countCNTT = 0, countQTKD = 0;
            ArrayList<String> svCNTT = new ArrayList<String>();
            File f = new File("SinhVien.txt");
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                if (line.startsWith("DANH")) {
                    continue;
                } else {
                    String[] info = line.trim().split(",");
                    if (info[4].equalsIgnoreCase("cong nghe thong tin")) {
                        countCNTT++;
                        svCNTT.add(line);
                    } else if (info[4].equalsIgnoreCase("quan tri kinh doanh")) {
                        countQTKD++;
                    }
                }
            }
            sc.close();
            System.out.printf("So sv CNTT: %d\nSo sv QTKD: %d\n", countCNTT, countQTKD);
            
            FileWriter fout = new FileWriter("SinhVienCNTT.txt");
            PrintWriter writer = new PrintWriter(fout);
            for (String s : svCNTT) {
                writer.println(s);
            }
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
