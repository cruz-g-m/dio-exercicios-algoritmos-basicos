import java.util.Scanner;
/*
 * Entrada
A entrada deverá ser composta pelo valor A na primeira linha, seguido do valor N na segunda. 

Saída
A saída deverá retornar o valor da soma de todos os múltiplos A até o seu limite N.
 */

import javax.naming.spi.DirStateFactory.Result;

public class App {
    public static void main(String[] args) {
        int A = 5;
        int N = 20;
        int incremento = 1;
        int sum = 0;
        int result = 0;



       // Scanner input = new Scanner(System.in);
       // A = input.nextInt();
       // N = input.nextInt();
        
       do {

        result = A * incremento;
        incremento++;
        sum = sum + result;

       } while (result < N);

       System.out.println("o valor da soma de todos os múltiplos de:" + A + " é " + sum);


    }
}