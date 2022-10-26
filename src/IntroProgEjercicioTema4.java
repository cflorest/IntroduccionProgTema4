public class IntroProgEjercicioTema4 {
    public static void main(String[] args) {
        /*
        En este ejercicio practicarás las estructuras de control, para ello deberás crear:
        Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
        Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
        Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
        Incrementar el valor de la variable en uno cada vez que se ejecute.
        Mostrarlo por pantalla cada vez que se ejecute.
        Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
        Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.
        Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación.
         */

        System.out.println("Se ejecutará Estructura control IF");
        // Estrucuta control IF
        int numeroIf = -10;
        if(numeroIf >0){
            System.out.println(numeroIf+" Es positivo");
        }
        else {
            System.out.println(numeroIf+" Es negativo");
        }

        // Estructura control WHILE
        System.out.println("Se ejecutará Estructura control WHILE");

        int numeroWhile = 0;
        while(numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        // Estructura control DO WHILE
        System.out.println("Se ejecutará Estructura control DO WHILE");
        do{
            System.out.println(numeroWhile);
            numeroWhile++;
        }while(numeroWhile < 3) ;

        // Estructura control FOR
        System.out.println("Se ejecutará Estructura control FOR");
        for(int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }

        // Estructura control SWITCH
        System.out.println("Se ejecutará Estructura control SWITCH");

        String estación = "invierno";
        switch(estación){
            case "verano":
                System.out.println("verano");
                break;
            case "invierno":
                System.out.println("invierno");
                break;
            case "otoño":
                System.out.println("otoño");
                break;
            case "primavera":
                System.out.println("primavera");
                break;
            default:
                System.out.println("Otra Estación");
                break;
    }
}
}

