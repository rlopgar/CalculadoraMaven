package org.example;

import java.util.Scanner;

public class CalculadoraMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1;
        double n2;
        int opcion;

        Calculadora c = new Calculadora();

        do {

            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");
            opcion = sc.nextInt();
            if (opcion == 5){
                System.out.println("Gracias por utilizar la calculadora. Saliendo...");
                break;
            }

            System.out.print("Primer numero: ");
            n1 = sc.nextDouble();
            System.out.print("Segundo numero: ");
            n2 = sc.nextDouble();

            switch (opcion) {
                case 1:
                    System.out.println(n1 + " + " + n2 + " = " + c.Sumar(n1, n2));
                    break;
                case 2:
                    System.out.println(n1 + " - " + n2 + " = " + c.Restar(n1, n2));
                    break;
                case 3:
                    System.out.println(n1 + " * " + n2 + " = " + c.Multiplicar(n1, n2));
                    break;
                case 4:
                    System.out.println(n1 + " / " + n2 + " = " + c.Dividir(n1, n2));
                    break;
                default:
                    System.out.println("No has elegido una opción");
            }
        }while(opcion != 5);
    }

}
