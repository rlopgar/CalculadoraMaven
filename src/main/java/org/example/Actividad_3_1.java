package org.example;

import java.util.Scanner;

public class Actividad_3_1 {
    public static void main(String[] args) {
        int num = 0;
        int cont_pos = 0;
        int cont_neg = 0;
        int suma_pos = 0;
        int suma_neg = 0;
        float media_pos = 0;
        float media_neg = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        num = sc.nextInt();

        while (num != 0){
            if (num > 0){
                cont_pos++;
                suma_pos += num;
            } else {
                cont_neg++;
                suma_neg += num;
            }
            System.out.print("Introduce un número: ");
            num = sc.nextInt();
        }

        if (cont_pos != 0){
            media_pos = (float)suma_pos/cont_pos;
            System.out.println("Media de los positivos: " + media_pos);
        }

        if (cont_neg != 0){
            media_neg = (float) suma_neg / cont_neg;
            System.out.println("Media de los negativos: " + media_neg);
        }
    }
}
