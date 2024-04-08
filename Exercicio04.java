package vetores;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        int i = 0;
        Scanner teclado = new Scanner(System.in);
        int[] vetor = new int [20];
        int[] par = new int [20];
        int[] impar = new int[20];
        System.out.println("Digite 20 numeros para o vetor:");
        for(i = 0; i < 20; i++){
            int n = teclado.nextInt();
            vetor[i] = n;
            if(vetor[i] % 2==0){
                par[i] = i;
            }
                else {
                    impar[i] = i;
                }
        }
        System.out.println("o vetor de numeros lidos é:");
        for(i=0; i<20;i++){
            System.out.println(vetor[i]);
        }
        System.out.println("o vetor de numeros impar lidos é:");
        for(i=0;i<par.length;i++){
            System.out.println(par[i]);
        }
        System.out.println("o vetor de numeros par lidos é:");
        for(i=0;i<impar.length;i++){
            System.out.println(impar[i]);
        }
    }
}
