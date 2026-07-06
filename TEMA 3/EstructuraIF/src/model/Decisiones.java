package model;

import java.util.Scanner;

public class Decisiones {
    public void estructuraIF(int nota) {
        System.out.println("Vamos a explicar la estructura IF");
        if (nota >= 5) {
            System.out.println("El examen está aprobado");
        } else {
            System.out.println("El examen está suspenso");
        }
        System.out.println("Terminando la evaluación");
    }

    public void estructuraIFELSEIF(double nota) {
        // 0 -> desastroso
        // 1 - 3.99 -> mal
        // 4 - 4.99 -> casi
        // 5 - 7.99 -> bien
        // 8 - 8.99 -> notable
        // 9 - 9.99 -> sobresaliente
        // 10 -> máquina
        System.out.println("Iniciando la evaluación del examen");
        if (nota >= 0 && nota <= 10) {
            if (nota < 1) {
                System.out.println("Examen desastroso");
            } else if (nota < 4) {
                System.out.println("Examen mal");
            } else if (nota < 5) {
                System.out.println("Examen casi aprobado");
            } else if (nota < 8) {
                System.out.println("Examen bien");
            } else if (nota < 9) {
                System.out.println("Examen notable");
            } else if (nota < 10) {
                System.out.println("Examen sobresaliente");
            } else {
                System.out.println("¡Eres una máquina!");
            }
        } else {
            System.out.println("Rango incorrecto");
        }

        System.out.println("Evaluación finalizada");
    }

    public void ejercicio4T2() {
        Scanner lecturaTeclado = new Scanner(System.in);
        System.out.println("Dime que número quieres evaluar");
        int numero = lecturaTeclado.nextInt();
        if (numero % 2 == 0) {
            System.out.printf("El número %d es par%n", numero);
        } else {
            System.out.printf("El número %d es impar%n", numero);
        }

        lecturaTeclado = null;
        //lo igual a nulo para que no de error en el siguiente
    }

    public void ejercicio10T2() {
        Scanner lectorTeclado = new Scanner(System.in);
        System.out.println("Indica cuánto cobras por hora");
        int salarioHora = lectorTeclado.nextInt();
        System.out.println("Indica cuántas horas has trabajado");
        int horasTrabajadas = lectorTeclado.nextInt();
        System.out.println("¿Has trabajado horas extra?");
        boolean horasExtra = lectorTeclado.nextBoolean();

        int salarioTotal = 0;
        salarioTotal += 40 * salarioHora;

        if (horasExtra && horasTrabajadas > 40){
            int numeroHorasExtra = horasTrabajadas - 40;
            salarioTotal = numeroHorasExtra * (salarioTotal*2);
        }
        System.out.println("El salario cobrado este mes es: " + salarioTotal);

        lectorTeclado.close();
    }
}
