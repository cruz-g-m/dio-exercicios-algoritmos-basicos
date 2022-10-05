import java.util.*;

import javafx.beans.binding.ObjectExpression;

public class BuscaSequencial {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        boolean encontrar = false;
        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75}; 
        
        int indice = 0;
        int item;

        System.out.println("Digite um elementos[i]: ");
        item = leitor.nextInt();

        for (; indice < elementos.length; indice++) {
            if (elementos[indice] == item) {
                encontrar = true;
                break;
            }
        }

        if (encontrar) {
            System.out.println("Achei " + item + " na posicao " + indice);
        }
        else {
            System.out.println("Numero " + item + " nao encontrado!");
        }
        }

}