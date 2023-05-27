package Arreglos;

import java.util.Random;

public class Volado {
    public static void main(String[] args) {
        int [] volado = new int[3];
        final int aguila = 1;
        final int sol = 2;
        final int lanzamientos = 100;
        Random uzi = new Random();

        volado[aguila] = 0;
        volado[sol] = 0;

        for (int tiro = 1; tiro <= 6000000; tiro ++)
            ++volado[1 + uzi.nextInt(2)];
        if (lanzamientos == aguila){
            volado[aguila]+=1;
        }
        if (lanzamientos == sol){
            volado[sol]+=1;
        }

        System.out.println("Cayo " +volado[aguila] + "Cayo " +volado[sol]);
    }


}
