/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algus;

import java.util.Arrays;

public class massiivid {
    public static void main(String[] arg) {
        int[] pikkused = {176, 163, 158, 171, 169};
        System.out.println("Kokku: " + pikkused.length);
        System.out.println(pikkused[0] + " " + pikkused[pikkused.length - 1]);
   
        for(int i = 0; i< pikkused.length; i++){
            System.out.println(pikkused[i]);
        }

        int summa = 0;
        for(int i = 0; i<pikkused.length; i++){
            summa += pikkused[i];
        }
        System.out.println("Summa: " + summa);
        
        // Teine variant
        summa = 0;
        for(int pikkus: pikkused){
            summa+=pikkus;
        }
        System.out.println(summa);
        System.out.println(Arrays.stream(pikkused).sum());
    }
}
