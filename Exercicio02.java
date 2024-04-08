package vetores;

import java.util.Scanner;

public class Exercicio02 {

    
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        double nota1, nota2, nota3, nota4;
        double media, i;
        

            for(i = 0; i < 4; i++){
            System.out.println("Aluno  digite a nota");
            nota1 = ent.nextInt();
            System.out.println("Aluno  digite a nota");
            nota2 = ent.nextInt();
            System.out.println("Aluno  digite a nota");
            nota3 = ent.nextInt();
            System.out.println("Aluno  digite a nota");
            nota4 = ent.nextInt();
            media = (nota1 + nota2 + nota3 + nota4) /4;
            System.out.println("A média do aluno é " + media);
            break;
        }   
    }    
}
