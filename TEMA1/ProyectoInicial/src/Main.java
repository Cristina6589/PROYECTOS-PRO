public class Main {

    int edadGlobal = 90;
    //esta varible la podré usar en cualquier sitio dentro de la public class Main

    public static void main(String[] args) {
        System.out.println("Este es mi primer programa en Java");
        System.out.println("Esta es la segunda línea del programa en Java\n");
        /* La \n se usa como salto de línea, en lugar de usar println puedes usar
        print y \n detrás de cualquiera de las palabras */
        //TODO clase del 02/10/2025 (para ver esto VIEW - TOOL WINDOWS - TODO)

        // empezamos con variables
        String miNombre = "Cristina"; //String es variable compleja
        System.out.println("¡Hola! Mi nombre es: "+miNombre);

        /* En naranja está la variable primitiva, encima su tipo envolvente (ofrece más funcionalidades)
        que la convierte en compleja */

        Character letraDNICompleja ='N';
        char letraPrimerApellido = 'R';
        char letraSegundoApellido = 'S';
        System.out.println("La letra de mi primer apellido es: "+letraPrimerApellido);
        System.out.println("La letra de mi segundo apellido es: "+letraSegundoApellido);
        /* En variable char también podemos encontrar números (aunque char solo sea para letras)
        esto se debe a que se use el código ASCII que es un sistema de codificación
        que asigna un valor numérico único a cada letra, número y símbolo.
         */
        Integer edadCompleja = 37;
        int edad = 37;
        System.out.println("Mi edad es: "+edad+" años");
        Double alturaCompleja = 1.70;
        double altura = 1.70;
        System.out.println("Mi altura es de: "+altura+" cm");
        Float pesoCompleja = 67.4f;
        float peso = 67.4f;
        System.out.println("Mi peso actual es de: "+peso+" kg");

        Boolean morenoCompleja = true;
        boolean moreno = true;
        System.out.println("Mi color de pelo es moreno: "+moreno);

        /* Tenemos también la clase Object, que es la clase padre de Java,
        de ella heredan todas y esta es la más general de todas,
        puede guardar cualquier tipo de dato */

        // ejemplo de variable no mutable (no cambia nunca)
        final String DNI = "69696969X";
        System.out.println("Mi número de DNI es: "+DNI);
        /* otras variables no mutables se pueden buscar en la libreria Math de Java
        aquí no se declara varible, porque es un número predeterminado, es una constante,
        por lo que solo se solicita que se imprima */
        System.out.println("El valor del número PI es: "+Math.PI);
        System.out.println("El valor del número E es: "+Math.E);
        System.out.println("El valor máximo de un int es: "+Integer.MAX_VALUE);
        System.out.println("El valor mínimo de un int es: "+Integer.MIN_VALUE);

    }

    public void nombreMetodo(int edadGlobal) {
        System.out.println(this.edadGlobal);
        /* aquí un ejemplo de cómo puedo usar la variable qué formulé al principio
        para que no haya duda en caso de tener mcuhas varibles, pongo this. delante
         y coge directamente el valor de esa variable declarada al inicio */
    }

}