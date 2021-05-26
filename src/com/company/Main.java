package com.company;

import java.util.Scanner;

public class Main {

    public static void ejercicio1(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un valor para ver los números pares: ");
        int n = scanner.nextInt();

        for (int i = 0; i <= n; i++){
            if (i%2 == 0){
                System.out.println(i);
            }
        }

        scanner.close();
    }

    public static void ejercicio2(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mostrar los primeros n múltiplos de m");
        System.out.println("Ingrese n: ");
        int n = scanner.nextInt();
        System.out.println("Ingrese m: ");
        int m = scanner.nextInt();

        int cantidadMultiplos = 0;
        int numero = 0;
        while (cantidadMultiplos < n){
            if (numero % m == 0){
                System.out.println(numero);
                cantidadMultiplos++;
            }
            numero++;
        }

        scanner.close();
    }

    public static void ejercicio3(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un valor para ver si es primo:");
        int n = scanner.nextInt();

        if (esPrimo(n)){
            System.out.println(n + " es primo");
        }
        else
        {
            System.out.println(n + " no es primo");
        }

        scanner.close();
    }

    public static boolean esPrimo(int x){
        boolean esPrimo = true;

        for (int i = 2; i < x; i++){
            if (x % i == 0){
                esPrimo = false;
                break;
            }
        }

        return esPrimo;
    }

    public static void ejercicio4(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un valor para ver los primeros n números primos:");
        int n = scanner.nextInt();

        int cantidadPrimos = 0;
        int i = 1;
        while (cantidadPrimos < n){
            if (esPrimo(i)){
                System.out.println(i);
                cantidadPrimos++;
            }
            i++;
        }

        scanner.close();
    }

    public static boolean tieneMdigitosD(int numero, int m, int d){
        int cantidadRepeticiones = 0;
        String sNumero = Integer.toString(numero);
        for (int i = 0; i < sNumero.length(); i++){
            //Me fijo si en sNumero, el char que hay en la posicion i es igual a d
            //Para eso d lo casteé a String y me quedo con lo que hay en la posición 0, no encontré otra forma, solo casteando a char no funcionaba
            if (sNumero.charAt(i) == Integer.toString(d).charAt(0)){
                cantidadRepeticiones++;
            }
        }

        if (cantidadRepeticiones >= m){
            System.out.println(sNumero);
            return true;
        }
        return false;
    }

    public static void ejercicio5(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mostrar los primeros n números naturales, que tienen al menos m dígitos d");
        System.out.println("Ingrese n, m y d:");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int d = scanner.nextInt();

        int cantidadNumeros = 0;
        int numeroActual = 0;
        while (cantidadNumeros < n){
            if (tieneMdigitosD(numeroActual, m, d)) {
                cantidadNumeros++;
            }
            numeroActual++;
        }

        scanner.close();
    }

    public static void main(String[] args) {
        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
        ejercicio5();
    }
}
