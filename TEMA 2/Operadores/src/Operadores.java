public class Operadores {
    public void operadoresAritmeticos(){
        System.out.println("Explicación de los operadores aritméticos");

        //UNARIOS -> solo necesitan un operando, se usan para contadores atrás como por ejemplo los intentos del pin del móvil
        int operandoUno = 5;
        operandoUno++; //Aquí operandoUno = operandoUno + 1
        System.out.println("Despúes de incrementar: " +operandoUno);
        operandoUno--; //Aquí operandoUno = operandoUno - 1
        System.out.println("Despúes de decrementar: " +operandoUno);
        operandoUno=-operandoUno;
        //Aquí calculo su inverso, paso de 5 a -5

        //BINARIOS
        int operandoDos = 3;
        int suma = operandoUno + operandoDos;
        System.out.println("El resultado de la suma es: "+suma);
        int resta = operandoUno - operandoDos;
        System.out.println("El resultado de la resta es: "+resta);
        int multiplicacion = operandoUno*operandoDos;
        System.out.println("El resultado de la multiplicación es: "+multiplicacion);
        double division = (double)operandoUno/operandoDos;
        /*Al convertir uno de los operandos en double, la división arroja decimales,
        si no pongo double en el pirmer operando sale un número redondo, en este caso de
        dividir 5 entre 3, saldría 1.0 en vez de 1.6667*/
        System.out.println("El resultado de la división es: "+division);
        /*También, cuando queremos sacar un determinado número de decimales en una operación
        podemos usar las banderas, por ejemplo:
        System.out.println("El resultado de la división es %.4f" ,division);
        donde %.4f sería el número de decimales que quiero que incluya*/
        int modulo = operandoUno%operandoDos;
        //Esto hace referencia al resto de la división,es útil para saber si un número es par
        System.out.println("El resultado del resto de la división es: "+modulo);

        /*También se puede concatenar el texto en una suma, en vez de sumar los dos operadores,
        forma un nuevo número juntando los dos, en cambio, si en vez de esto:
        +operandoUno+operandoDos, pongo un paréntesis antes +(operandoUno+operandoDos)
        sabe que primero tiene que concatenar y luego sumar*/
        System.out.println("El resultado de la concatenación es: "+operandoUno+operandoDos);
        System.out.println("El resultado de la suma es: "+(operandoUno+operandoDos));

        
    }

}
