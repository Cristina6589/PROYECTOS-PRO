package model;

public class Decisiones {
    public void estructuraIF(int nota){
        System.out.println("Vamos a explicar la estructura IF");
        if (nota>=5){
            System.out.println("El examen está aprobado");
        } else {
            System.out.println("El examen está suspenso");
        }
        System.out.println("Terminando la evaluación");
    }
}
