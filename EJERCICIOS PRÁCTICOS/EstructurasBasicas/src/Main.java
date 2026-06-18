public class Main {
    // Ejercicios Notion PRO-ThePower -- Ejercicios estructuras básicas
    
    public static void main(String[] args) {
        //Ejercicio 1: Definir y mostrar variables
        String nombre = "Cristina";
        int edad = 37;
        String ciudad = "Granada\n";

        System.out.println(nombre);
        System.out.println(edad);
        System.out.println(ciudad);

        puntuacion();
        datosPersonales();
        libro();
        miApp();
    }

    public static void puntuacion(){
        //Ejercicio 2: Modificar variables
        int inicial = 0;
        int mod1 = 5;
        int mod2 = 10;
        int fin = 15;

        System.out.println("Puntuación inicial: "+inicial);
        System.out.println("Después de primera modificación: "+mod1);
        System.out.println("Después de segunda modificación: "+mod2);
        System.out.println("Puntuación final: "+fin);
    }

    public static void datosPersonales(){
        //Ejercicio 3: Tipos de variables
        String nombre = "Imperio";
       int edad = 4;
       boolean perra = true;
       double peso = 10.5;
       char incial = 'I';

        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("¿Eres una perra: "+perra);
        System.out.println("Peso: "+peso);
        System.out.println("Inicial: "+incial);
    }

    public static void libro(){
        //Ejercicio 4: Variables con nombres descriptivos
        String titulo = "Mujercitas";
        String autora = "Louisa May Alcott";
        int año = 1868;
        int paginas = 650;
        boolean disponible = true;

        System.out.println("Título: "+titulo);
        System.out.println("Autora: "+autora);
        System.out.println("Año de publicación: "+año);
        System.out.println("Número de paginas: "+paginas);
        System.out.println("¿Disponible en la biblioteca?: "+disponible);
    }

    public static void miApp(){
        //Ejercicio 5: Declaración y uso de constantes

        //Constantes
        String aplicacion = "MiApp";
        String version = "1.0.0";
        double PI = 3.14159;

        //Variables
        String usuario = "Juanlu";
        int nivel = 1;
        int puntuacion = 0;

        System.out.println("Aplicación: "+aplicacion);
        System.out.println("Version: "+version);
        System.out.println("Valor de PI: "+PI);
        System.out.println("Ususario actual: "+usuario);
        System.out.println("Nivel: "+nivel);
        System.out.println("Puntuación: "+puntuacion);

        usuario = "Cris";
        nivel = 6;
        puntuacion = 54;

        System.out.println("Ususario actualizado: "+usuario);
        System.out.println("Nivel actualizado: "+nivel);
        System.out.println("Puntuación actualizada: "+puntuacion);

    }

}
