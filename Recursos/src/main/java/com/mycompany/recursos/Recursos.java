/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.recursos;

/**
 *
 * @author DELL
 */


 import java.util.ArrayList;
import java.util.List;

class Recursos {
    
    // Primer método: Retorna un mensaje fijo.
    public String obtenerMensajeProgramacion() {
        return "Programación Orientada a Objetos";
    }

    // Segundo método: Retorna un mensaje dependiendo de la edad.
    public String verificarEdad(int edad) {
        if (edad >= 21) {
            return "Mayor de edad";
        } else {
            return "Menor de edad";
        }
    }

    // Tercer método: Retorna el resultado de la multiplicación de dos enteros.
    public int realizarMultiplicacion(int num1, int num2) {
        return num1 * num2;
    }

    // Cuarto método: Retorna una lista de números del 1 al X.
    public List<Integer> generarListaHastaX(int x) {
        List<Integer> listaNumeros = new ArrayList<>();
        for (int i = 1; i <= x; i++) {
            listaNumeros.add(i);
        }
        return listaNumeros;
    }

    public static void main(String[] args) {
        // Instanciamos la clase Recursos
        Recursos recursos = new Recursos();

        // Llamamos al primer método
        String mensaje = recursos.obtenerMensajeProgramacion();
        System.out.println(mensaje); // Imprime "Programación Orientada a Objetos"

        // Llamamos al segundo método con la edad
        int edad = 22; // Puedes cambiar la edad para probar con otros valores
        String resultadoEdad = recursos.verificarEdad(edad);
        System.out.println(resultadoEdad); // Imprime "Mayor de edad"

        // Llamamos al tercer método con dos números para multiplicar
        int num1 = 6, num2 = 7;
        int resultadoMultiplicacion = recursos.realizarMultiplicacion(num1, num2);
        System.out.println("Resultado de la multiplicación: " + resultadoMultiplicacion); // Imprime "Resultado de la multiplicación: 42"

        // Llamamos al cuarto método con un valor X
        int X = 10;
        List<Integer> listaNumeros = recursos.generarListaHastaX(X);
        System.out.println("Lista de números del 1 al " + X + ": " + listaNumeros); // Imprime la lista de números del 1 al 10
    }
}
