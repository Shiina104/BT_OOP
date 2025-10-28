/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop.bth2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class bt11 {
    public static void main(String[] args) {
        File f = new File("SV-HS-CD.txt");
        int hs = 0, sv = 0, cd = 0;
        try {
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                if (line.trim().startsWith("//")) {
                    continue;
                } else {
                    String[] value = line.trim().split(",");
                    if (value[0].matches("\\d+")) {
                        if (value.length == 7)
                            sv++;
                        else
                            cd++;
                    } else {
                        hs++;
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Loi doc file");
        }
        System.out.println("So hs: " + hs + "\nSo sv: " + sv + "\nSo cd: " + cd);
    }
}
