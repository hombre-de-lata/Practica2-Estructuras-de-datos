//Programa que declare un vector de diez elementos enteros y pida números para rellenarlo hasta que se
//llene el vector o se introduzca un número negativo. Entonces se debe imprimir el vector (sólo los
//elementos introducidos).


import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);


        System.out.println("Ingrese el primer numero: ");
        int n1 = leer.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        int n2 = leer.nextInt();

        System.out.println("Ingrese el tersero numero: ");
        int n3 = leer.nextInt();

        System.out.println("Ingrese el cuarto numero: ");
        int n4 = leer.nextInt();

        System.out.println("Ingrese el quinto numero: ");
        int n5 = leer.nextInt();

        System.out.println("Ingrese el sexto numero: ");
        int n6 = leer.nextInt();

        System.out.println("Ingrese el septimo numero: ");
        int n7 = leer.nextInt();

        System.out.println("Ingrese el octavo numero: ");
        int n8 = leer.nextInt();

        System.out.println("Ingrese el noveno numero: ");
        int n9 = leer.nextInt();

        System.out.println("Ingrese el decimo numero: ");
        int n10 = leer.nextInt();

        int numeros [] = new  int [10];

        numeros[0]= n1;
        numeros[1]= n2;
        numeros[2]= n3;
        numeros[3]= n4;
        numeros[4]= n5;
        numeros[5]= n6;
        numeros[6]= n7;
        numeros[7]= n8;
        numeros[8]= n9;
        numeros[9]= n10;

        int positivos = 0;
        int negativos = 0;
        int ceros = 0;

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] > 0){
                positivos++;
            }
            if (numeros [i] <0){
                negativos++;
            }
            if (numeros [i]==0){
                ceros++;
            }
        }
        System.out.println("Cantidad de positivos :  "+positivos);
        System.out.println("Cantidad de negativos :  "+negativos);
        System.out.println("Cantidad de ceros :  "+ceros);
    }
}
