package com.campusdual.classroom;

public class Exercise09 {

    public static void main(String[] args) {
        int num = 7;
        doWhileLoop(num);
    }

    //TODO ↓
    // Comprueba el funcionamiento del bucle do-while, que para cada interacción muestre el siguiente mensaje:
    // Entra con valor: X, sale con valor: X+1
    // Entra con valor: X+1, sale con valor: X+2;
    // etc.
    public static void doWhileLoop(int num) {
        int x = 0;
        do {
            int contador = 0;
            contador++;
            System.out.println("Entra con valor: " + x + ", sale con valor: " + (x + contador));
            x = x + contador;

        }while (x < num);
    }
}