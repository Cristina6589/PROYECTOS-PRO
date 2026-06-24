import java.util.Scanner;

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

    public void operadoresAsignacion(){
        int operandoUno = 6;
        operandoUno += 6; //operandoUno = operandoUno + 6; // 12
        /*A lo que ya tengo (operandoUno) le sumo 6 poniendo +=, así pico menos código
        se puede hacer con cualquiera de los operadores aritméticos (suma, resta, multiplicación...)*/
        operandoUno -= 3; // 9
        operandoUno *= 2; // 18
        operandoUno /= 2; // 9
        operandoUno %= 3; // 0


    }

    public void operadoresRelacionales(){
        int numeroUno = 4;
        int numeroDos = 7;

        boolean resultado = numeroUno > numeroDos; //false, uno más grande que dos?
        System.out.println("El resultado de > es: "+resultado);
        resultado = numeroUno >= numeroDos; //false, uno más grande o igual que dos?
        System.out.println("El resultado de >= es: "+resultado);
        resultado = numeroUno < numeroDos; //true, uno más pequeño que dos?
        System.out.println("El resultado de < es: "+resultado);
        resultado = numeroUno <= numeroDos;//true, uno más pequeño o igual que dos?
        System.out.println("El resultado de <= es: "+resultado);
        resultado = numeroUno == numeroDos;//false, son iguales?
        System.out.println("El resultado de == es: "+resultado);
        resultado = numeroUno != numeroDos;//true, es diferente?
        System.out.println("El resultado de != es: "+resultado);
    }

    public void operadoresLogicos(){
        /*Son AND OR NOT (los más comunes, hay más) y da como resultado
        un booleano teniendo en cuenta varias comparaciones*/

        int numeroUno = 4;
        int numeroDos = 10;
        int numeroTres = 17;

        boolean resultadoLogicoAND = numeroUno>1 && numeroDos<11 && numeroDos!=numeroTres && numeroTres%2!=0;
                                  // true && true && true && true -> true
        /*AND -> el resultado de una comparacion compuesta por 2 o mas condiciones sera true si todas las comparaciones son true. &&
		OP1		OP2		RESULTADO
		true	true	true
		true	false	false
		false	true	false
		false	false	false
         */
        System.out.println("El resultado lógico de AND es: "+resultadoLogicoAND);

        boolean resultadoLogicoOR = numeroUno!=10 || numeroDos>10 || numeroTres<numeroDos || numeroDos%2!=0;
                                    // true || false || false || false
        /*OR -> el resultado de una compracion compuesta por 2 o mas condiciones sera true si una de las conciones es true. Solo sera false si todas son false ||
		OP1		OP2		RESULTADO
		true	true	true
		true	false	true
		false	true	true
		false	false	false
         */
        System.out.println("El resultado lógico de OR es: "+resultadoLogicoOR);

        boolean resultadoCombinado = numeroUno<10 || numeroTres>0 || numeroDos!=9 && numeroUno>0;
                                     // true || true || true && true
        System.out.println("El resultado de OR y AND es: "+resultadoCombinado);

        numeroTres = 20;
        numeroDos = 10;
        numeroUno = 0;

        boolean resultadoTotal = numeroUno>=0 && numeroDos<20&&false; //false porque hay un false
        boolean resultadoTotalInverso = !resultadoTotal; // Este sería el NOT, tu me das algo y yo te lo devuelvo negado
        /*como lo niego con el inverso ! se convierte en true esto es muy útil
        porque en alguna estructura if me permitirá entrar por otro sitio*/

        System.out.println("El resultado total inverso es: "+resultadoTotalInverso);
    }

    public void evaluarCandidato(){
        //para no tener que poner yo las variables, creo una variable Scanner
            Scanner lectorTeclado = new Scanner(System.in);
            System.out.println("Dime tu nombre y apellido: ");
            String nombreApellido = lectorTeclado.nextLine();
            System.out.println("Dime tu edad: ");
            int edad = lectorTeclado.nextInt();
            System.out.println("¿Qué salario quieres cobrar? ");
            int salario = lectorTeclado.nextInt();
            System.out.println("¿Tienes experiencia laboral? ");
            boolean experiencia = lectorTeclado.nextBoolean();

            /*edad inferior a 35 y sueldo < 40000 y experiencia, este podría ser un programa
            para un proceso de selección para una empresa*/

        boolean resultadoEvaluacion = edad<=35 && salario<40000 && experiencia;
        System.out.println("El resultado evaluacion es que el candidato es: "+resultadoEvaluacion);

        /*Por seguridad, cualquier flujo de datos debe cerrarse con close,
        en un Scanner da un poco igual, pero hay otro flujos de datos que si puede ser peligroso
        si no lo cierras el proceso no se completa. Por ejemplo, si estoy escribiendo en
        un fichero como flujo de datos y no lo cierro, no se guardarán los datos que he escrito*/

        lectorTeclado.close();

        }
}
