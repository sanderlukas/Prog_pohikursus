package com.mycompany.vorkandmed;
import java.net.*;
import java.io.*;

public class Vork1 {
    public static void main(String[] args) /*throws Exception*/ {
        try {
        String aadress = "http://www.tlu.ee/~jaagup/andmed/muu/ounad/antoonovka2.txt";
        BufferedReader br = new BufferedReader(new InputStreamReader(new URL(aadress).openStream()));
        String rida = br.readLine();
        System.out.println("Tulbad: " + rida);
       /* int aug_summa = 0;
        int sept_summa = 0;
        int loendur = 0;
        rida = br.readLine();
        while (rida != null) {
            String[] m = rida.split(",");
            System.out.println(m[0]);
            aug_summa += Double.parseDouble(m[0]);
            sept_summa += Double.parseDouble(m[1]);
            loendur += 1;
            rida = br.readLine();
        }
        br.close();
        System.out.println("Augusti õunte diameeter on: " + aug_summa);
        System.out.println("Septembri õunte keskmine diameeter: " + sept_summa / (float) loendur);*/
        rida = br.readLine();
        double[] summad = new double[rida.split(",").length];
        int kogus = 0;
        while (rida != null) {
            String[] m = rida.split(",");
            for (int i = 0; i < m.length; i++) {
                summad[i] += Double.parseDouble(m[i]);
            }
            kogus++;
            rida = br.readLine();
        }
        br.close();
        System.out.println("Augusti õunte diameetrite summa: " + summad[0]);
        } catch(Exception ex) {
            System.out.println("Probleem: " + ex);
        }
    }
}
