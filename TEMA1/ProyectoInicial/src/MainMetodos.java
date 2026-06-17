public class MainMetodos {
    public static void main(String[] args) {

        System.out.println("Este es un Main para probar métodos y variables");
        saludar ( "Cristina");
        despedir();
    }

    public static void saludar(String data){
        System.out.println("Enhorabuena "+data+" has llamado a tu primer método");
    }

    public static void despedir(){
        System.out.println("Hasta luego, hemos terminado por hoy");
    }
}
