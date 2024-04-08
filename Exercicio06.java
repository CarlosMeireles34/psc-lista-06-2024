package vetores;
import java.util.Scanner;
public class Exercicio06 {
    public static void main(String[] args){
        Scanner ent = new Scanner(System.in);
        int soma = 0;
        double multiplicar = 0;
        int numero;
        for(int i = 0; i < 5; i++) {
            System.out.println("Digite um número");
            numero = ent.nextInt();
        while (numero != 0) {
            soma += numero;
            System.out.println("Digite 5 número (0 para somar): ");
            numero = ent.nextInt();
        }

        System.out.println("A soma dos números digitados é: " + soma);
        while (numero != 1) {
            multiplicar += numero;
            System.out.println("Digite 5 número (1 para multiplicar): ");
            numero = ent.nextInt();
        }

        System.out.println("A multiplicacao dos números digitados é: " + multiplicar);
    }
    }
}

